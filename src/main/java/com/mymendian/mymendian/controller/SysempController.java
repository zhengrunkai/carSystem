package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Sysemp;
import com.mymendian.mymendian.model.User;
import com.mymendian.mymendian.service.SysempService;
import com.mymendian.mymendian.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class SysempController {
    @Resource
    private UserService userService;
    @Resource
    private SysempService sysempService;

    @RequestMapping("/employee")
    public String employee(Model model, HttpSession session){
        if(session.getAttribute("username") !=null){
            User user =userService.findbyName(session.getAttribute("username").toString());
            if(user==null){
                return  "redirect:/login";
            }
            Sysemp sysemp=sysempService.findSysempByUid(user.getUserid());
            if(sysemp==null){//不存在则自动添加
                sysemp=new Sysemp();
                sysemp.setEmpname("姓名");
                sysemp.setUid(user.getUserid());
                sysemp.setDid(0);
                sysemp=sysempService.save(sysemp);
            }
            model.addAttribute("sysemp",sysemp);
            return "employee";
        }
        else
            return  "redirect:/login";
    }

    @PostMapping("/empsave")
    public String empsave(String empname,String uid,String did,String empposition,String empsex
            ,String empage,String emptelephone,String basicdailywage,String empbirthday,String emphiredate
            ,String empdimissionday,String empaddress,Model model, HttpSession session){
        Sysemp sysemp=sysempService.findSysempByUid(Integer.parseInt(uid));
        if(sysemp==null) {
            return  "redirect:/login";
        }else{
            sysemp.setEmpname(empname);
            sysemp.setUid(Integer.parseInt(uid));
            sysemp.setDid(Integer.parseInt(did));
            sysemp.setEmpposition(empposition);
            sysemp.setEmpsex(empsex);
            sysemp.setEmpage(Integer.parseInt(empage));
            sysemp.setEmptelephone(emptelephone);
            sysemp.setBasicdailywage(basicdailywage);
            sysemp.setEmpbirthday(empbirthday);
            sysemp.setEmphiredate(emphiredate);
            sysemp.setEmpdimissionday(empdimissionday);
            sysemp.setEmpaddress(empaddress);

            sysemp=sysempService.save(sysemp);
        }

        model.addAttribute("sysemp",sysemp);
        return "employee";

    }


}