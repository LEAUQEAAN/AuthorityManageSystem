package com.lq.sys.viewmodel;

import com.lq.sys.model.Authority;
import com.lq.sys.model.Groups;
import com.lq.sys.model.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Software1 on 2017/12/15.
 */

public class UserInfo implements Serializable{

    private User user ;
    private  List<GroupInfo> groupInfos;

    public UserInfo() {
    }

    public UserInfo(User user, List<GroupInfo> groupInfos) {
        this.user = user;
        this.groupInfos = groupInfos;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<GroupInfo> getGroupInfos() {
        return groupInfos;
    }

    public void setGroupInfos(List<GroupInfo> groupInfos) {
        this.groupInfos = groupInfos;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user=" + user +
                ", groupInfos=" + groupInfos +
                '}';
    }
}
