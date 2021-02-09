package com.mymendian.mymendian.controller;

import com.mymendian.mymendian.model.Syscustomer;
import com.mymendian.mymendian.service.SyscustomerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class SyscustomerController {
    @Resource
    SyscustomerService syscustomerService;

    @PostMapping("/syscustomerSave")
    public String syscustomerSave(int customerid, String customertelephone, String customerphonetypename
            , String customername, String customerwhetherflow, String isoutmealflow, String customermealname
            , Model model, HttpSession session) {
        Syscustomer syscustomer = syscustomerService.findSyscustomerByCustomerid(customerid);
        if (syscustomer == null) {
            syscustomer = new Syscustomer();
            syscustomer.setCustomerid(customerid);
            syscustomer.setCustomertelephone(customertelephone);
            syscustomer.setCustomerphonetypename(customerphonetypename);
            syscustomer.setCustomername(customername);
            syscustomer.setCustomerwhetherflow(customerwhetherflow);
            syscustomer.setIsoutmealflow(isoutmealflow);
            syscustomer.setCustomermealname(customermealname);
            syscustomerService.insertSyscustomer(syscustomer);
        } else {
            syscustomer.setCustomertelephone(customertelephone);
            syscustomer.setCustomerphonetypename(customerphonetypename);
            syscustomer.setCustomername(customername);
            syscustomer.setCustomerwhetherflow(customerwhetherflow);
            syscustomer.setIsoutmealflow(isoutmealflow);
            syscustomer.setCustomermealname(customermealname);
            syscustomerService.updateSyscustomer(syscustomer);
        }
        return "syscustomerAdd";
    }

    @PostMapping("/saveSyscustomer")
    public String saveSyscustomer(int customerid, String customertelephone, String customerphonetypename
            , String customername, String customerwhetherflow, String isoutmealflow, String customermealname
            , Model model, HttpSession session) {
        Syscustomer syscustomer = syscustomerService.findSyscustomerByCustomerid(customerid);
        if (syscustomer == null) {
            syscustomer = new Syscustomer();
            syscustomer.setCustomerid(customerid);
            syscustomer.setCustomertelephone(customertelephone);
            syscustomer.setCustomerphonetypename(customerphonetypename);
            syscustomer.setCustomername(customername);
            syscustomer.setCustomerwhetherflow(customerwhetherflow);
            syscustomer.setIsoutmealflow(isoutmealflow);
            syscustomer.setCustomermealname(customermealname);
            syscustomerService.insertSyscustomer(syscustomer);
        } else {
            syscustomer.setCustomertelephone(customertelephone);
            syscustomer.setCustomerphonetypename(customerphonetypename);
            syscustomer.setCustomername(customername);
            syscustomer.setCustomerwhetherflow(customerwhetherflow);
            syscustomer.setIsoutmealflow(isoutmealflow);
            syscustomer.setCustomermealname(customermealname);
            syscustomerService.updateSyscustomer(syscustomer);
        }
        return "success";
    }

    @PostMapping("/getSyscustomerInit")
    public String getSyscustomerInit() {
        return syscustomerService.getSyscustomerInit();
    }

}

