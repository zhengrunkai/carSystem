package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Sss;
import com.mymendian.mymendian.service.SssService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class SssController {
    @Resource
    SssService sssService;

    @PostMapping("/sssSave")
    public String sssSave(String yi, String er
            , Model model, HttpSession session) {
        Sss sss = sssService.findSssByyi(yi);
        if (sss == null) {
            sss = new Sss();
            sss.setYi(yi);
            sss.setEr(er);
            sssService.insertSss(sss);
        } else {
            sss.setEr(er);
            sssService.updateSss(sss);
        }
        return "sssAdd";
    }

    @PostMapping("/saveSss")
    public String saveSss(String yi, String er
            , Model model, HttpSession session) {
        Sss sss = sssService.findSssByyi(yi);
        if (sss == null) {
            sss = new Sss();
            sss.setYi(yi);
            sss.setEr(er);
            sssService.insertSss(sss);
        } else {
            sss.setEr(er);
            sssService.updateSss(sss);
        }
        return "success";
    }

    @PostMapping("/getSssInit")
    public String getSssInit() {
        return sssService.getSssInit();
    }
    @PostMapping("/updateSss")
    public String updateSss(String yi , Model model, HttpSession session) {
        Sss sss = sssService.findSssByyi(yi);
        String retStr="";
        if(sss==null){
            retStr="alert('非法操作！请通过正规途径进行操作！');";
        }else {
            retStr+="$(\"#yi\").val(\""+sss.getYi()+"\");";
            retStr+="$(\"#er\").val(\""+sss.getEr()+"\");";
            retStr += " $(\".sssadd\").show();";
        }
        return retStr;
    }

    @PostMapping("/deleteSss")
    public String deleteSss(String yi , Model model, HttpSession session) {
        sssService.deleteSss(yi);
        String retStr= "initHtml();alert('删除成功！');";
        return retStr;
    }

}