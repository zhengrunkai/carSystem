package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="sss")
public class Sss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String yi;
    private String er;

    public String getYi() {
        return yi;
    }

    public void setYi(String yi) {
        this.yi = yi;
    }

    public String getEr() {
        return er;
    }

    public void setEr(String er) {
        this.er = er;
    }
}