package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Dingdan;
import com.mymendian.mymendian.service.DingdanService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class DingdanController {
    @Resource
    DingdanService dingdanService;

    @PostMapping("/dingdanSave")
    public String dingdanSave(int dingdan_id, String dingdan_time, String dingdan_xiaoshou_man
            , String dingdan_kehu_name, String dingdan_cheliang
            , Model model, HttpSession session) {
        Dingdan dingdan = dingdanService.findDingdanByDingdan_id(dingdan_id);
        if (dingdan == null) {
            dingdan = new Dingdan();
            dingdan.setDingdan_id(dingdan_id);
            dingdan.setDingdan_time(dingdan_time);
            dingdan.setDingdan_xiaoshou_man(dingdan_xiaoshou_man);
            dingdan.setDingdan_kehu_name(dingdan_kehu_name);
            dingdan.setDingdan_cheliang(dingdan_cheliang);
            dingdanService.insertDingdan(dingdan);
        } else {
            dingdan.setDingdan_time(dingdan_time);
            dingdan.setDingdan_xiaoshou_man(dingdan_xiaoshou_man);
            dingdan.setDingdan_kehu_name(dingdan_kehu_name);
            dingdan.setDingdan_cheliang(dingdan_cheliang);
            dingdanService.updateDingdan(dingdan);
        }
        return "dingdanAdd";
    }

    @PostMapping("/saveDingdan")
    public String saveDingdan(int dingdan_id, String dingdan_time, String dingdan_xiaoshou_man
            , String dingdan_kehu_name, String dingdan_cheliang
            , Model model, HttpSession session) {
        Dingdan dingdan = dingdanService.findDingdanByDingdan_id(dingdan_id);
        if (dingdan == null) {
            dingdan = new Dingdan();
            dingdan.setDingdan_id(dingdan_id);
            dingdan.setDingdan_time(dingdan_time);
            dingdan.setDingdan_xiaoshou_man(dingdan_xiaoshou_man);
            dingdan.setDingdan_kehu_name(dingdan_kehu_name);
            dingdan.setDingdan_cheliang(dingdan_cheliang);
            dingdanService.insertDingdan(dingdan);
        } else {
            dingdan.setDingdan_time(dingdan_time);
            dingdan.setDingdan_xiaoshou_man(dingdan_xiaoshou_man);
            dingdan.setDingdan_kehu_name(dingdan_kehu_name);
            dingdan.setDingdan_cheliang(dingdan_cheliang);
            dingdanService.updateDingdan(dingdan);
        }
        return "success";
    }

    @PostMapping("/getDingdanInit")
    public String getDingdanInit() {
        return dingdanService.getDingdanInit();
    }
    @PostMapping("/updateDingdan")
    public String updateDingdan(int dingdan_id , Model model, HttpSession session) {
        Dingdan dingdan = dingdanService.findDingdanByDingdan_id(dingdan_id);
        String retStr="";
        if(dingdan==null){
            retStr="alert('非法操作！请通过正规途径进行操作！');";
        }else {
            retStr+="$(\"#dingdan_id\").val(\""+dingdan.getDingdan_id()+"\");";
            retStr+="$(\"#dingdan_time\").val(\""+dingdan.getDingdan_time()+"\");";
            retStr+="$(\"#dingdan_xiaoshou_man\").val(\""+dingdan.getDingdan_xiaoshou_man()+"\");";
            retStr+="$(\"#dingdan_kehu_name\").val(\""+dingdan.getDingdan_kehu_name()+"\");";
            retStr+="$(\"#dingdan_cheliang\").val(\""+dingdan.getDingdan_cheliang()+"\");";
            retStr += " $(\".dingdanadd\").show();";
        }
        return retStr;
    }

    @PostMapping("/deleteDingdan")
    public String deleteDingdan(int dingdan_id , Model model, HttpSession session) {
        dingdanService.deleteDingdan(dingdan_id);
        String retStr= "initHtml();alert('删除成功！');";
        return retStr;
    }

}
