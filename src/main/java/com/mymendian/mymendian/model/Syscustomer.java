package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="syscustomer")
public class Syscustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;
    private String customertelephone;
    private String customerphonetypename;
    private String customername;
    private String customerwhetherflow;
    private String isoutmealflow;
    private String customermealname;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomertelephone() {
        return customertelephone;
    }

    public void setCustomertelephone(String customertelephone) {
        this.customertelephone = customertelephone;
    }

    public String getCustomerphonetypename() {
        return customerphonetypename;
    }

    public void setCustomerphonetypename(String customerphonetypename) {
        this.customerphonetypename = customerphonetypename;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerwhetherflow() {
        return customerwhetherflow;
    }

    public void setCustomerwhetherflow(String customerwhetherflow) {
        this.customerwhetherflow = customerwhetherflow;
    }

    public String getIsoutmealflow() {
        return isoutmealflow;
    }

    public void setIsoutmealflow(String isoutmealflow) {
        this.isoutmealflow = isoutmealflow;
    }

    public String getCustomermealname() {
        return customermealname;
    }

    public void setCustomermealname(String customermealname) {
        this.customermealname = customermealname;
    }
}
