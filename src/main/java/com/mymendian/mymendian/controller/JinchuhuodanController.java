package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Jinchuhuodan;
import com.mymendian.mymendian.service.JinchuhuodanService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class JinchuhuodanController {
    @Resource
    JinchuhuodanService jinchuhuodanService;

    @PostMapping("/jinchuhuodanSave")
    public String jinchuhuodanSave(int jinchuhuodan_id, String jinchuhuodan_cheliangxinghao, String jinchuhuodan_gongyingshang
            , String jinchuhuodan_qianshou_time, String jinchuhuodan_chuku_time
            , Model model, HttpSession session) {
        Jinchuhuodan jinchuhuodan = jinchuhuodanService.findJinchuhuodanByJinchuhuodan_id(jinchuhuodan_id);
        if (jinchuhuodan == null) {
            jinchuhuodan = new Jinchuhuodan();
            jinchuhuodan.setJinchuhuodan_id(jinchuhuodan_id);
            jinchuhuodan.setJinchuhuodan_cheliangxinghao(jinchuhuodan_cheliangxinghao);
            jinchuhuodan.setJinchuhuodan_gongyingshang(jinchuhuodan_gongyingshang);
            jinchuhuodan.setJinchuhuodan_qianshou_time(jinchuhuodan_qianshou_time);
            jinchuhuodan.setJinchuhuodan_chuku_time(jinchuhuodan_chuku_time);
            jinchuhuodanService.insertJinchuhuodan(jinchuhuodan);
        } else {
            jinchuhuodan.setJinchuhuodan_cheliangxinghao(jinchuhuodan_cheliangxinghao);
            jinchuhuodan.setJinchuhuodan_gongyingshang(jinchuhuodan_gongyingshang);
            jinchuhuodan.setJinchuhuodan_qianshou_time(jinchuhuodan_qianshou_time);
            jinchuhuodan.setJinchuhuodan_chuku_time(jinchuhuodan_chuku_time);
            jinchuhuodanService.updateJinchuhuodan(jinchuhuodan);
        }
        return "jinchuhuodanAdd";
    }

    @PostMapping("/saveJinchuhuodan")
    public String saveJinchuhuodan(int jinchuhuodan_id, String jinchuhuodan_cheliangxinghao, String jinchuhuodan_gongyingshang
            , String jinchuhuodan_qianshou_time, String jinchuhuodan_chuku_time
            , Model model, HttpSession session) {
        Jinchuhuodan jinchuhuodan = jinchuhuodanService.findJinchuhuodanByJinchuhuodan_id(jinchuhuodan_id);
        if (jinchuhuodan == null) {
            jinchuhuodan = new Jinchuhuodan();
            jinchuhuodan.setJinchuhuodan_id(jinchuhuodan_id);
            jinchuhuodan.setJinchuhuodan_cheliangxinghao(jinchuhuodan_cheliangxinghao);
            jinchuhuodan.setJinchuhuodan_gongyingshang(jinchuhuodan_gongyingshang);
            jinchuhuodan.setJinchuhuodan_qianshou_time(jinchuhuodan_qianshou_time);
            jinchuhuodan.setJinchuhuodan_chuku_time(jinchuhuodan_chuku_time);
            jinchuhuodanService.insertJinchuhuodan(jinchuhuodan);
        } else {
            jinchuhuodan.setJinchuhuodan_cheliangxinghao(jinchuhuodan_cheliangxinghao);
            jinchuhuodan.setJinchuhuodan_gongyingshang(jinchuhuodan_gongyingshang);
            jinchuhuodan.setJinchuhuodan_qianshou_time(jinchuhuodan_qianshou_time);
            jinchuhuodan.setJinchuhuodan_chuku_time(jinchuhuodan_chuku_time);
            jinchuhuodanService.updateJinchuhuodan(jinchuhuodan);
        }
        return "success";
    }

    @PostMapping("/getJinchuhuodanInit")
    public String getJinchuhuodanInit() {
        return jinchuhuodanService.getJinchuhuodanInit();
    }
    @PostMapping("/updateJinchuhuodan")
    public String updateJinchuhuodan(int jinchuhuodan_id , Model model, HttpSession session) {
        Jinchuhuodan jinchuhuodan = jinchuhuodanService.findJinchuhuodanByJinchuhuodan_id(jinchuhuodan_id);
        String retStr="";
        if(jinchuhuodan==null){
            retStr="alert('非法操作！请通过正规途径进行操作！');";
        }else {
            retStr+="$(\"#jinchuhuodan_id\").val(\""+jinchuhuodan.getJinchuhuodan_id()+"\");";
            retStr+="$(\"#jinchuhuodan_cheliangxinghao\").val(\""+jinchuhuodan.getJinchuhuodan_cheliangxinghao()+"\");";
            retStr+="$(\"#jinchuhuodan_gongyingshang\").val(\""+jinchuhuodan.getJinchuhuodan_gongyingshang()+"\");";
            retStr+="$(\"#jinchuhuodan_qianshou_time\").val(\""+jinchuhuodan.getJinchuhuodan_qianshou_time()+"\");";
            retStr+="$(\"#jinchuhuodan_chuku_time\").val(\""+jinchuhuodan.getJinchuhuodan_chuku_time()+"\");";
            retStr += " $(\".jinchuhuodanadd\").show();";
        }
        return retStr;
    }

    @PostMapping("/deleteJinchuhuodan")
    public String deleteJinchuhuodan(int jinchuhuodan_id , Model model, HttpSession session) {
        jinchuhuodanService.deleteJinchuhuodan(jinchuhuodan_id);
        String retStr= "initHtml();alert('删除成功！');";
        return retStr;
    }
}


