package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="dingdan")
public class Dingdan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dingdan_id;
    private String dingdan_time;
    private String dingdan_xiaoshou_man;
    private String dingdan_kehu_name;
    private String dingdan_cheliang;

    public int getDingdan_id() {
        return dingdan_id;
    }

    public void setDingdan_id(int dingdan_id) {
        this.dingdan_id = dingdan_id;
    }

    public String getDingdan_time() {
        return dingdan_time;
    }

    public void setDingdan_time(String dingdan_time) {
        this.dingdan_time = dingdan_time;
    }

    public String getDingdan_xiaoshou_man() {
        return dingdan_xiaoshou_man;
    }

    public void setDingdan_xiaoshou_man(String dingdan_xiaoshou_man) {
        this.dingdan_xiaoshou_man = dingdan_xiaoshou_man;
    }

    public String getDingdan_kehu_name() {
        return dingdan_kehu_name;
    }

    public void setDingdan_kehu_name(String dingdan_kehu_name) {
        this.dingdan_kehu_name = dingdan_kehu_name;
    }

    public String getDingdan_cheliang() {
        return dingdan_cheliang;
    }

    public void setDingdan_cheliang(String dingdan_cheliang) {
        this.dingdan_cheliang = dingdan_cheliang;
    }
}
