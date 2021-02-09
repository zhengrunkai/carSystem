package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="yuangong")
public class Yuangong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int yuangong_id;
    private String yuangong_name;
    private String yuangong_sex;
    private String yuangong_phone;
    private String yuangong_yeji;
    private String yuangong_pingjia;
    private String yuangong_bumen;

    public int getYuangong_id() {
        return yuangong_id;
    }

    public void setYuangong_id(int yuangong_id) {
        this.yuangong_id = yuangong_id;
    }

    public String getYuangong_name() {
        return yuangong_name;
    }

    public void setYuangong_name(String yuangong_name) {
        this.yuangong_name = yuangong_name;
    }

    public String getYuangong_sex() {
        return yuangong_sex;
    }

    public void setYuangong_sex(String yuangong_sex) {
        this.yuangong_sex = yuangong_sex;
    }

    public String getYuangong_phone() {
        return yuangong_phone;
    }

    public void setYuangong_phone(String yuangong_phone) {
        this.yuangong_phone = yuangong_phone;
    }

    public String getYuangong_yeji() {
        return yuangong_yeji;
    }

    public void setYuangong_yeji(String yuangong_yeji) {
        this.yuangong_yeji = yuangong_yeji;
    }

    public String getYuangong_pingjia() {
        return yuangong_pingjia;
    }

    public void setYuangong_pingjia(String yuangong_pingjia) {
        this.yuangong_pingjia = yuangong_pingjia;
    }

    public String getYuangong_bumen() {
        return yuangong_bumen;
    }

    public void setYuangong_bumen(String yuangong_bumen) {
        this.yuangong_bumen = yuangong_bumen;
    }
}
