package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="sysdept")
public class Sysdept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int deptid;
    private String deptname;
    private int deptmanageemployeeid;
    private String deptmanageemployeename;
    private String deptremark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getDeptmanageemployeeid() {
        return deptmanageemployeeid;
    }

    public void setDeptmanageemployeeid(int deptmanageemployeeid) {
        this.deptmanageemployeeid = deptmanageemployeeid;
    }

    public String getDeptmanageemployeename() {
        return deptmanageemployeename;
    }

    public void setDeptmanageemployeename(String deptmanageemployeename) {
        this.deptmanageemployeename = deptmanageemployeename;
    }

    public String getDeptremark() {
        return deptremark;
    }

    public void setDeptremark(String deptremark) {
        this.deptremark = deptremark;
    }
}
