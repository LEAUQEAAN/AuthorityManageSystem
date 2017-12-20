package com.lq.sys.model;

import java.io.Serializable;

/**
 * Created by Software1 on 2017/12/15.
 */
public class Groups implements Serializable {


    private int   group_code;
    private String group_name;

    public Groups(int group_code, String group_name) {
        this.group_code = group_code;
        this.group_name = group_name;
    }

    public Groups() {
    }

    public int getGroup_code() {
        return group_code;
    }

    public void setGroup_code(int group_code) {
        this.group_code = group_code;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }


    @Override
    public String toString() {
        return "Groups{" +
                "group_code=" + group_code +
                ", group_name='" + group_name + '\'' +
                '}';
    }
}
