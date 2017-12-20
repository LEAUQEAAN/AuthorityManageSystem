package com.lq.sys.model;

import java.io.Serializable;

/**
 * Created by Software1 on 2017/12/14.
 */
public class Authority implements Serializable{

    private int authority_code;
    private String  authority_name;

    public Authority(int authority_code, String authority_name) {
        this.authority_code = authority_code;
        this.authority_name = authority_name;
    }

    public Authority() {
    }


    public int getAuthority_code() {
        return authority_code;
    }

    public void setAuthority_code(int authority_code) {
        this.authority_code = authority_code;
    }

    public String getAuthority_name() {
        return authority_name;
    }

    public void setAuthority_name(String authority_name) {
        this.authority_name = authority_name;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authority_code=" + authority_code +
                ", authority_name='" + authority_name + '\'' +
                '}';
    }
}
