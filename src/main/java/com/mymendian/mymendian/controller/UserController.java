package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.User;
import com.mymendian.mymendian.service.SendMailService;
import com.mymendian.mymendian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Autowired
    SendMailService sendMailService;

    String key="xdong001";


    @RequestMapping("/login")
    public String login(Model model, HttpSession session) {
        String sinfo="";
        if(session.getAttribute("statusinfo") !=null)
            sinfo=session.getAttribute("statusinfo").toString();
        if(!sinfo.startsWith("登录："))  sinfo="";
        model.addAttribute("statusinfo",sinfo);
        return "login";
    }

    @PostMapping("/loginVerify")
    public String loginVerify(String username,String password,HttpSession session){
        User user = new User();
        user.setUsername(username);
        user.setUserpassword(DigestUtils.md5DigestAsHex((password + key).getBytes()));

        boolean verify = userService.verifyLogin(user);
        if (verify) {
            session.setAttribute("username", username);
            session.setAttribute("statusinfo", "登录：已经登录，<a href='/hello'>直接进入</a>！");
            return "redirect:/homepage";
        } else {
            session.setAttribute("statusinfo", "登录：用户名或者密码错误！");
            return "redirect:/login";
        }
    }

    @RequestMapping("/register")
    public String register(Model model,HttpSession session) {
        String sinfo="";
        if(session.getAttribute("statusinfo") !=null)
            sinfo=session.getAttribute("statusinfo").toString();
        if(!sinfo.startsWith("注册"))  sinfo="";
        model.addAttribute("statusinfo",sinfo);
        return "register";
    }

    //注册用户
    @PostMapping("/registerVerify")
    public String registerVerify(String username,String password,String useremail,HttpSession session){
        User user = new User();
        user.setUsername(username);
        user.setUserpassword(DigestUtils.md5DigestAsHex((password + key).getBytes()));
        user.setUseremail(useremail);
        User vUser = userService.save(user);
        if (vUser!=null) {
            session.setAttribute("statusinfo", "登录：刚注册成功，请先验证邮箱后再登录！");
            //发邮件到邮箱，以验证邮箱
            String email=user.getUseremail();
            String subject="XXX网站注册用户邮箱验证";
            String content="尊敬的"+user.getUsername()+ "用户：\n"
                    +"您已经成功注册了一个用户，但该用户暂时无法使用，直到您验证完邮箱，验证邮箱链接如下：\n"
                    + " http://localhost:8080/regVerify?username="+user.getUsername()+"&usercheck="+user.getUsercheck()+" \n"
                    + "XXX网站客户部";
            sendMailService.sendMail(email,subject,content);
            return "redirect:/login";
        } else {
            session.setAttribute("statusinfo", "注册不成功！");
            return "redirect:/register";
        }
    }

    @RequestMapping("/regVerify")
    public String regVerify(String username,String usercheck,HttpSession session){
        User user = new User();
        user.setUsername(username);
        user.setUsercheck(usercheck);

        boolean verify = userService.verifyEmail(user);
        if (verify) {
            session.setAttribute("statusinfo", "登录：用户邮箱已经成功验证，可以登录！");
        } else {
            session.setAttribute("statusinfo", "登录：非法操作！");
        }
        return "redirect:/login";
    }
}