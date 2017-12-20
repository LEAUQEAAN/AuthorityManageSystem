package com.lq.sys.viewmodel;

import com.lq.sys.model.Authority;
import com.lq.sys.model.Groups;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Software1 on 2017/12/15.
 */
public class GroupInfo implements Serializable {

    private Groups groups;
    private List<Authority> authorities;

    public GroupInfo(Groups groups, List<Authority> authorities) {
        this.groups = groups;
        this.authorities = authorities;
    }

    public GroupInfo() {
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "GroupInfo{" +
                "groups=" + groups +
                ", authorities=" + authorities +
                '}';
    }
}
