package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="sysemp")
public class Sysemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;
    private String empname;
    private int uid;
    private int did;
    private String empposition;
    private String empsex;
    private int empage;
    private String emptelephone;
    private String basicdailywage;
    private String empbirthday;
    private String emphiredate;
    private String empdimissionday;
    private String empaddress;
    private String empstatus;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getEmpposition() {
        return empposition;
    }

    public void setEmpposition(String empposition) {
        this.empposition = empposition;
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public String getEmptelephone() {
        return emptelephone;
    }

    public void setEmptelephone(String emptelephone) {
        this.emptelephone = emptelephone;
    }

    public String getBasicdailywage() {
        return basicdailywage;
    }

    public void setBasicdailywage(String basicdailywage) {
        this.basicdailywage = basicdailywage;
    }

    public String getEmpbirthday() {
        return empbirthday;
    }

    public void setEmpbirthday(String empbirthday) {
        this.empbirthday = empbirthday;
    }

    public String getEmphiredate() {
        return emphiredate;
    }

    public void setEmphiredate(String emphiredate) {
        this.emphiredate = emphiredate;
    }

    public String getEmpdimissionday() {
        return empdimissionday;
    }

    public void setEmpdimissionday(String empdimissionday) {
        this.empdimissionday = empdimissionday;
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress;
    }

    public String getEmpstatus() {
        return empstatus;
    }

    public void setEmpstatus(String empstatus) {
        this.empstatus = empstatus;
    }
}