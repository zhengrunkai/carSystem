package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="jinchuhuodan")
public class Jinchuhuodan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jinchuhuodan_id;
    private String jinchuhuodan_cheliangxinghao;
    private String jinchuhuodan_gongyingshang;
    private String jinchuhuodan_qianshou_time;
    private String jinchuhuodan_chuku_time;

    public int getJinchuhuodan_id() {
        return jinchuhuodan_id;
    }

    public void setJinchuhuodan_id(int jinchuhuodan_id) {
        this.jinchuhuodan_id = jinchuhuodan_id;
    }

    public String getJinchuhuodan_cheliangxinghao() {
        return jinchuhuodan_cheliangxinghao;
    }

    public void setJinchuhuodan_cheliangxinghao(String jinchuhuodan_cheliangxinghao) {
        this.jinchuhuodan_cheliangxinghao = jinchuhuodan_cheliangxinghao;
    }

    public String getJinchuhuodan_gongyingshang() {
        return jinchuhuodan_gongyingshang;
    }

    public void setJinchuhuodan_gongyingshang(String jinchuhuodan_gongyingshang) {
        this.jinchuhuodan_gongyingshang = jinchuhuodan_gongyingshang;
    }

    public String getJinchuhuodan_qianshou_time() {
        return jinchuhuodan_qianshou_time;
    }

    public void setJinchuhuodan_qianshou_time(String jinchuhuodan_qianshou_time) {
        this.jinchuhuodan_qianshou_time = jinchuhuodan_qianshou_time;
    }

    public String getJinchuhuodan_chuku_time() {
        return jinchuhuodan_chuku_time;
    }

    public void setJinchuhuodan_chuku_time(String jinchuhuodan_chuku_time) {
        this.jinchuhuodan_chuku_time = jinchuhuodan_chuku_time;
    }
}
