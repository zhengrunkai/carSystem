package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Sysdept;
import com.mymendian.mymendian.service.SysdeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class SysdeptController {
    @Resource
    SysdeptService sysdeptService;
    @PostMapping("/sysdeptaddSave")
    public String sysdeptaddSave(int deptid, String deptname, int deptmanageemployeeid, String deptmanageemployeename, String deptremark
            , Model model, HttpSession session){
        Sysdept sysdept=sysdeptService.findSysdeptByDeptid(deptid);
        if(sysdept==null){
            sysdept=new Sysdept();
            sysdept.setDeptid(deptid);
            sysdept.setDeptname(deptname);
            sysdept.setDeptmanageemployeeid(deptmanageemployeeid);
            sysdept.setDeptmanageemployeename(deptmanageemployeename);
            sysdept.setDeptremark(deptremark);
            sysdeptService.insertSysdept(sysdept);
        }else{
            sysdept.setDeptname(deptname);
            sysdept.setDeptmanageemployeeid(deptmanageemployeeid);
            sysdept.setDeptmanageemployeename(deptmanageemployeename);
            sysdept.setDeptremark(deptremark);
            sysdeptService.updateSysdept(sysdept);
        }
        return "sysdeptadd";
    }
    @RequestMapping("/sysdeptadd")
    public String sysdeptadd(){
        return "sysdeptadd";
    }
}
