package com.mymendian.mymendian.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int userid;
    private String username;
    private String userpassword;
    private String userrights;
    private int rolenumber;
    private String rolename;
    private String roledescription;
    private String usercheck;
    private  String useremail;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserrights() {
        return userrights;
    }

    public void setUserrights(String userrights) {
        this.userrights = userrights;
    }

    public int getRolenumber() {
        return rolenumber;
    }

    public void setRolenumber(int rolenumber) {
        this.rolenumber = rolenumber;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledescription() {
        return roledescription;
    }

    public void setRoledescription(String roledescription) {
        this.roledescription = roledescription;
    }

    public String getUsercheck() {
        return usercheck;
    }

    public void setUsercheck(String usercheck) {
        this.usercheck = usercheck;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }
}