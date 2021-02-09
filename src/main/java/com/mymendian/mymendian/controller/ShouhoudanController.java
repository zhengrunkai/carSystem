package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Shouhoudan;
import com.mymendian.mymendian.service.ShouhoudanService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class ShouhoudanController {
    @Resource
    ShouhoudanService shouhoudanService;

    @PostMapping("/shouhoudanSave")
    public String shouhoudanSave(int shouhoudan_id, String shouhoudan_time, String shouhoudan_wenti
            , String shouhoudan_shouhou_man, String shouhoudan_kehu_name
            , Model model, HttpSession session) {
        Shouhoudan shouhoudan = shouhoudanService.findShouhoudanByShouhoudan_id(shouhoudan_id);
        if (shouhoudan == null) {
            shouhoudan = new Shouhoudan();
            shouhoudan.setShouhoudan_id(shouhoudan_id);
            shouhoudan.setShouhoudan_time(shouhoudan_time);
            shouhoudan.setShouhoudan_wenti(shouhoudan_wenti);
            shouhoudan.setShouhoudan_shouhou_man(shouhoudan_shouhou_man);
            shouhoudan.setShouhoudan_kehu_name(shouhoudan_kehu_name);
            shouhoudanService.insertShouhoudan(shouhoudan);
        } else {
            shouhoudan.setShouhoudan_time(shouhoudan_time);
            shouhoudan.setShouhoudan_wenti(shouhoudan_wenti);
            shouhoudan.setShouhoudan_shouhou_man(shouhoudan_shouhou_man);
            shouhoudan.setShouhoudan_kehu_name(shouhoudan_kehu_name);
            shouhoudanService.updateShouhoudan(shouhoudan);
        }
        return "shouhoudanAdd";
    }

    @PostMapping("/saveShouhoudan")
    public String saveShouhoudan(int shouhoudan_id, String shouhoudan_time, String shouhoudan_wenti
            , String shouhoudan_shouhou_man, String shouhoudan_kehu_name
            , Model model, HttpSession session) {
        Shouhoudan shouhoudan = shouhoudanService.findShouhoudanByShouhoudan_id(shouhoudan_id);
        if (shouhoudan == null) {
            shouhoudan = new Shouhoudan();
            shouhoudan.setShouhoudan_id(shouhoudan_id);
            shouhoudan.setShouhoudan_time(shouhoudan_time);
            shouhoudan.setShouhoudan_wenti(shouhoudan_wenti);
            shouhoudan.setShouhoudan_shouhou_man(shouhoudan_shouhou_man);
            shouhoudan.setShouhoudan_kehu_name(shouhoudan_kehu_name);
            shouhoudanService.insertShouhoudan(shouhoudan);
        } else {
            shouhoudan.setShouhoudan_time(shouhoudan_time);
            shouhoudan.setShouhoudan_wenti(shouhoudan_wenti);
            shouhoudan.setShouhoudan_shouhou_man(shouhoudan_shouhou_man);
            shouhoudan.setShouhoudan_kehu_name(shouhoudan_kehu_name);
            shouhoudanService.updateShouhoudan(shouhoudan);
        }
        return "success";
    }

    @PostMapping("/getShouhoudanInit")
    public String getShouhoudanInit() {
        return shouhoudanService.getShouhoudanInit();
    }
    @PostMapping("/updateShouhoudan")
    public String updateShouhoudan(int shouhoudan_id , Model model, HttpSession session) {
        Shouhoudan shouhoudan = shouhoudanService.findShouhoudanByShouhoudan_id(shouhoudan_id);
        String retStr="";
        if(shouhoudan==null){
            retStr="alert('非法操作！请通过正规途径进行操作！');";
        }else {
            retStr+="$(\"#shouhoudan_id\").val(\""+shouhoudan.getShouhoudan_id()+"\");";
            retStr+="$(\"#shouhoudan_time\").val(\""+shouhoudan.getShouhoudan_time()+"\");";
            retStr+="$(\"#shouhoudan_wenti\").val(\""+shouhoudan.getShouhoudan_wenti()+"\");";
            retStr+="$(\"#shouhoudan_shouhou_man\").val(\""+shouhoudan.getShouhoudan_shouhou_man()+"\");";
            retStr+="$(\"#shouhoudan_kehu_name\").val(\""+shouhoudan.getShouhoudan_kehu_name()+"\");";
            retStr += " $(\".shouhoudanadd\").show();";
        }
        return retStr;
    }

    @PostMapping("/deleteShouhoudan")
    public String deleteShouhoudan(int id , Model model, HttpSession session) {
        shouhoudanService.deleteShouhoudan(id);
        String retStr= "initHtml();alert('删除成功！');";
        return retStr;
    }

}