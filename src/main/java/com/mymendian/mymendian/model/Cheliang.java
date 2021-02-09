package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="cheliang")
public class Cheliang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cheliang_id;
    private String cheliang_xinghao;
    private String cheliang_danjia;
    private String cheliang_cheqi;
    private String cheliang_chelunyangshi;
    private String cheliang_neishitiao;
    private String cheliang_zuoyicaizhi;

    public int getCheliang_id() {
        return cheliang_id;
    }

    public void setCheliang_id(int cheliang_id) {
        this.cheliang_id = cheliang_id;
    }

    public String getCheliang_xinghao() {
        return cheliang_xinghao;
    }

    public void setCheliang_xinghao(String cheliang_xinghao) {
        this.cheliang_xinghao = cheliang_xinghao;
    }

    public String getCheliang_danjia() {
        return cheliang_danjia;
    }

    public void setCheliang_danjia(String cheliang_danjia) {
        this.cheliang_danjia = cheliang_danjia;
    }

    public String getCheliang_cheqi() {
        return cheliang_cheqi;
    }

    public void setCheliang_cheqi(String cheliang_cheqi) {
        this.cheliang_cheqi = cheliang_cheqi;
    }

    public String getCheliang_chelunyangshi() {
        return cheliang_chelunyangshi;
    }

    public void setCheliang_chelunyangshi(String cheliang_chelunyangshi) {
        this.cheliang_chelunyangshi = cheliang_chelunyangshi;
    }

    public String getCheliang_neishitiao() {
        return cheliang_neishitiao;
    }

    public void setCheliang_neishitiao(String cheliang_neishitiao) {
        this.cheliang_neishitiao = cheliang_neishitiao;
    }

    public String getCheliang_zuoyicaizhi() {
        return cheliang_zuoyicaizhi;
    }

    public void setCheliang_zuoyicaizhi(String cheliang_zuoyicaizhi) {
        this.cheliang_zuoyicaizhi = cheliang_zuoyicaizhi;
    }
}
