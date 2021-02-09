package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Yuangong;
import com.mymendian.mymendian.service.YuangongService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class YuangongController {
    @Resource
    YuangongService yuangongService;

    @PostMapping("yuangongSave")
    public String yuangongSave(int yuangong_id, String yuangong_name, String yuangong_sex
            , String yuangong_phone, String yuangong_yeji, String yuangong_pingjia, String yuangong_bumen
            , Model model, HttpSession session) {
        Yuangong yuangong = yuangongService.findYuangongByYuangong_id(yuangong_id);
        if (yuangong == null) {
            yuangong = new Yuangong();
            yuangong.setYuangong_id(yuangong_id);
            yuangong.setYuangong_name(yuangong_name);
            yuangong.setYuangong_sex(yuangong_sex);
            yuangong.setYuangong_phone(yuangong_phone);
            yuangong.setYuangong_yeji(yuangong_yeji);
            yuangong.setYuangong_pingjia(yuangong_pingjia);
            yuangong.setYuangong_bumen(yuangong_bumen);
            yuangongService.insertYuangong(yuangong);
        } else {
            yuangong.setYuangong_name(yuangong_name);
            yuangong.setYuangong_sex(yuangong_sex);
            yuangong.setYuangong_phone(yuangong_phone);
            yuangong.setYuangong_yeji(yuangong_yeji);
            yuangong.setYuangong_pingjia(yuangong_pingjia);
            yuangong.setYuangong_bumen(yuangong_bumen);
            yuangongService.updateYuangong(yuangong);
        }
        return "YuangongAdd";
    }

    @PostMapping("/saveYuangong")
    public String saveSyscustomer(int yuangong_id, String yuangong_name, String yuangong_sex
            , String yuangong_phone, String yuangong_yeji, String yuangong_pingjia, String yuangong_bumen
            , Model model, HttpSession session) {
        Yuangong yuangong = yuangongService.findYuangongByYuangong_id(yuangong_id);
        if (yuangong == null) {
            yuangong = new Yuangong();
            yuangong.setYuangong_id(yuangong_id);
            yuangong.setYuangong_name(yuangong_name);
            yuangong.setYuangong_sex(yuangong_sex);
            yuangong.setYuangong_phone(yuangong_phone);
            yuangong.setYuangong_yeji(yuangong_yeji);
            yuangong.setYuangong_pingjia(yuangong_pingjia);
            yuangong.setYuangong_bumen(yuangong_bumen);
            yuangongService.insertYuangong(yuangong);
        } else {
            yuangong.setYuangong_name(yuangong_name);
            yuangong.setYuangong_sex(yuangong_sex);
            yuangong.setYuangong_phone(yuangong_phone);
            yuangong.setYuangong_yeji(yuangong_yeji);
            yuangong.setYuangong_pingjia(yuangong_pingjia);
            yuangong.setYuangong_bumen(yuangong_bumen);
            yuangongService.updateYuangong(yuangong);
        }
        return "success";
    }

    @PostMapping("/getYuangongInit")
    public String getYuangongInit() {
        return yuangongService.getYuangongInit();
    }
    @PostMapping("/updateYuangong")
    public String updateYuangong(int yuangong_id , Model model, HttpSession session) {
        Yuangong yuangong = yuangongService.findYuangongByYuangong_id(yuangong_id);
        String retStr="";
        if(yuangong==null){
            retStr="alert('非法操作！请通过正规途径进行操作！');";
        }else {
            retStr+="$(\"#yuangong_id\").val(\""+yuangong.getYuangong_id()+"\");";
            retStr+="$(\"#yuangong_name\").val(\""+yuangong.getYuangong_name()+"\");";
            retStr+="$(\"#yuangong_sex\").val(\""+yuangong.getYuangong_sex()+"\");";
            retStr+="$(\"#yuangong_phone\").val(\""+yuangong.getYuangong_phone()+"\");";
            retStr+="$(\"#yuangong_yeji\").val(\""+yuangong.getYuangong_yeji()+"\");";
            retStr+="$(\"#yuangong_pingjia\").val(\""+yuangong.getYuangong_pingjia()+"\");";
            retStr+="$(\"#yuangong_bumen\").val(\""+yuangong.getYuangong_bumen()+"\");";
            retStr += " $(\".yuangongadd\").show();";
        }
        return retStr;
    }

    @PostMapping("/deleteYuangong")
    public String deleteYuangong(int yuangong_id , Model model, HttpSession session) {
        yuangongService.deleteYuangong(yuangong_id);
        String retStr= "initHtml();alert('删除成功！');";
        return retStr;
    }

}
