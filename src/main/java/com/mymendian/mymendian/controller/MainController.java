package com.mymendian.mymendian.controller;


import com.mymendian.mymendian.error.BussinessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

    @RequestMapping("/homepage")
    public String homepage(Model model, HttpSession session) {
        if(session.getAttribute("username") !=null)
            return "homepage";
        else
            return  "login";
    }
    @RequestMapping("/top")
    public String top(HttpSession session) {
        return  "top";
    }

    @RequestMapping("/left")
    public String left(HttpSession session) {
        if(session.getAttribute("username") !=null)
            return  "left";
        else
            return  "login";
    }
    @RequestMapping("/syscustomerShow")
    public String syscustomerShow(){
        return "syscustomerShow";
    }
    @RequestMapping("/cheliangShow")
    public String cheliangShow(){
        return "cheliangShow";
    }
    @RequestMapping("/jinchuhuodanShow")
    public String jinchuhuodanShow(){
        return "jinchuhuodanShow";
    }
    @RequestMapping("/dingdanShow")
    public String dingdanShow(){
        return "dingdanShow";
    }
    @RequestMapping("/shouhoudanShow")
    public String shouhoudanShow(){
        return "shouhoudanShow";
    }
    @RequestMapping("/yuangongShow")
    public String yuangongShow(){
        return "yuangongShow";
    }
    @RequestMapping("/sssShow")
    public String sssShow(){
        return "sssShow";
    }
    @RequestMapping("/exceptionError")
    public  Object exceptionError() {
        throw new BussinessException( "exceptionError异常");
    }
}
