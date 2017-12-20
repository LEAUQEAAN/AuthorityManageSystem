package com.lq.sys.model;

import java.io.Serializable;

/**
 * Created by Software1 on 2017/12/14.
 */
public class User implements Serializable{

    private String  user_code;
    private String  user_name;
    private String  user_sex;
    private String user_phone;
    private String user_email;
    private String user_birth;
    private String user_pwd;

    public User() {
    }

    public User(String user_code, String user_name, String user_sex, String user_phone, String user_email, String user_birth, String user_pwd) {
        this.user_code = user_code;
        this.user_name = user_name;
        this.user_sex = user_sex;
        this.user_phone = user_phone;
        this.user_email = user_email;
        this.user_birth = user_birth;
        this.user_pwd = user_pwd;
    }


    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }


    @Override
    public String toString() {
        return "User{" +
                "user_code='" + user_code + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_birth='" + user_birth + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                '}';
    }
}
