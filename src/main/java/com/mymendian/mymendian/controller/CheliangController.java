package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Cheliang;
import com.mymendian.mymendian.service.CheliangService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class CheliangController {
    @Resource
    CheliangService cheliangService;

    @PostMapping("/cheliangSave")
    public String cheliangSave(int cheliang_id, String cheliang_xinghao, String cheliang_danjia, String cheliang_cheqi
            , String cheliang_chelunyangshi, String cheliang_neishitiao, String cheliang_zuoyicaizhi
            , Model model, HttpSession session) {
        Cheliang cheliang = cheliangService.findCheliangByCheliang_id(cheliang_id);
        if (cheliang == null) {
            cheliang = new Cheliang();
            cheliang.setCheliang_id(cheliang_id);
            cheliang.setCheliang_xinghao(cheliang_xinghao);
            cheliang.setCheliang_danjia(cheliang_danjia);
            cheliang.setCheliang_cheqi(cheliang_cheqi);
            cheliang.setCheliang_chelunyangshi(cheliang_chelunyangshi);
            cheliang.setCheliang_neishitiao(cheliang_neishitiao);
            cheliang.setCheliang_zuoyicaizhi(cheliang_zuoyicaizhi);
            cheliangService.insertCheliang(cheliang);
        } else {
            cheliang.setCheliang_xinghao(cheliang_xinghao);
            cheliang.setCheliang_danjia(cheliang_danjia);
            cheliang.setCheliang_cheqi(cheliang_cheqi);
            cheliang.setCheliang_chelunyangshi(cheliang_chelunyangshi);
            cheliang.setCheliang_neishitiao(cheliang_neishitiao);
            cheliang.setCheliang_zuoyicaizhi(cheliang_zuoyicaizhi);
            cheliangService.updateCheliang(cheliang);
        }
        return "cheliangAdd";
    }

    @PostMapping("/saveCheliang")
    public String saveCheliang(int cheliang_id, String cheliang_xinghao, String cheliang_danjia, String cheliang_cheqi
            , String cheliang_chelunyangshi, String cheliang_neishitiao, String cheliang_zuoyicaizhi
            , Model model, HttpSession session) {
        Cheliang cheliang = cheliangService.findCheliangByCheliang_id(cheliang_id);
        if (cheliang == null) {
            cheliang = new Cheliang();
            cheliang.setCheliang_id(cheliang_id);
            cheliang.setCheliang_xinghao(cheliang_xinghao);
            cheliang.setCheliang_danjia(cheliang_danjia);
            cheliang.setCheliang_cheqi(cheliang_cheqi);
            cheliang.setCheliang_chelunyangshi(cheliang_chelunyangshi);
            cheliang.setCheliang_neishitiao(cheliang_neishitiao);
            cheliang.setCheliang_zuoyicaizhi(cheliang_zuoyicaizhi);
            cheliangService.insertCheliang(cheliang);
        } else {
            cheliang.setCheliang_xinghao(cheliang_xinghao);
            cheliang.setCheliang_danjia(cheliang_danjia);
            cheliang.setCheliang_cheqi(cheliang_cheqi);
            cheliang.setCheliang_chelunyangshi(cheliang_chelunyangshi);
            cheliang.setCheliang_neishitiao(cheliang_neishitiao);
            cheliang.setCheliang_zuoyicaizhi(cheliang_zuoyicaizhi);
            cheliangService.updateCheliang(cheliang);
        }
        return "success";
    }

    @PostMapping("/getCheliangInit")
    public String getCheliangInit() {
        return cheliangService.getCheliangInit();
    }
    @PostMapping("/updateCheliang")
    public String updateCheliang(int cheliang_id , Model model, HttpSession session) {
        Cheliang cheliang = cheliangService.findCheliangByCheliang_id(cheliang_id);
        String retStr="";
        if(cheliang==null){
            retStr="alert('非法操作！请通过正规途径进行操作！');";
        }else {
            retStr+="$(\"#cheliang_id\").val(\""+cheliang.getCheliang_id()+"\");";
            retStr+="$(\"#cheliang_xinghao\").val(\""+cheliang.getCheliang_xinghao()+"\");";
            retStr+="$(\"#cheliang_danjia\").val(\""+cheliang.getCheliang_danjia()+"\");";
            retStr+="$(\"#cheliang_cheqi\").val(\""+cheliang.getCheliang_cheqi()+"\");";
            retStr+="$(\"#cheliang_chelunyangshi\").val(\""+cheliang.getCheliang_chelunyangshi()+"\");";
            retStr+="$(\"#cheliang_neishitiao\").val(\""+cheliang.getCheliang_neishitiao()+"\");";
            retStr+="$(\"#cheliang_zuoyicaizhi\").val(\""+cheliang.getCheliang_zuoyicaizhi()+"\");";
            retStr += " $(\".cheliangadd\").show();";
        }
        return retStr;
    }

    @PostMapping("/deleteCheliang")
    public String deleteCheliang(int cheliang_id , Model model, HttpSession session) {
        cheliangService.deleteCheliang(cheliang_id);
        String retStr= "initHtml();alert('删除成功！');";
        return retStr;
    }

}

