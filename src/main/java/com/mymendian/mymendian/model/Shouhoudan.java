package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="shouhoudan")
public class Shouhoudan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shouhoudan_id;
    private String shouhoudan_time;
    private String shouhoudan_wenti;
    private String shouhoudan_shouhou_man;
    private String shouhoudan_kehu_name;

    public int getShouhoudan_id() {
        return shouhoudan_id;
    }

    public void setShouhoudan_id(int shouhoudan_id) {
        this.shouhoudan_id = shouhoudan_id;
    }

    public String getShouhoudan_time() {
        return shouhoudan_time;
    }

    public void setShouhoudan_time(String shouhoudan_time) {
        this.shouhoudan_time = shouhoudan_time;
    }

    public String getShouhoudan_wenti() {
        return shouhoudan_wenti;
    }

    public void setShouhoudan_wenti(String shouhoudan_wenti) {
        this.shouhoudan_wenti = shouhoudan_wenti;
    }

    public String getShouhoudan_shouhou_man() {
        return shouhoudan_shouhou_man;
    }

    public void setShouhoudan_shouhou_man(String shouhoudan_shouhou_man) {
        this.shouhoudan_shouhou_man = shouhoudan_shouhou_man;
    }

    public String getShouhoudan_kehu_name() {
        return shouhoudan_kehu_name;
    }

    public void setShouhoudan_kehu_name(String shouhoudan_kehu_name) {
        this.shouhoudan_kehu_name = shouhoudan_kehu_name;
    }
}
