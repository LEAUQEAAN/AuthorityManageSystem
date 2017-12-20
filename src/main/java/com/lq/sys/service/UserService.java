package com.lq.sys.service;

import com.lq.sys.dao.AuthorityDao;
import com.lq.sys.dao.GroupDao;
import com.lq.sys.dao.UserDao;
import com.lq.sys.model.Authority;
import com.lq.sys.model.Groups;
import com.lq.sys.model.User;
import com.lq.sys.viewmodel.GroupInfo;
import com.lq.sys.viewmodel.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Software1 on 2017/12/15.
 */

@Service
public class UserService {
    @Resource
    UserDao userDao;

    @Resource
    GroupDao groupDao;

    @Resource
    AuthorityDao authorityDao;

    public UserInfo Login(String code,String pwd){
        UserInfo userInfo = new UserInfo();
        User user = userDao.loadById(code);
        if(user!=null  ){
            if(user.getUser_pwd().equals(pwd)){
                List<Groups> groupsList = groupDao.loadByUserId(code);
                List<GroupInfo> gs = new ArrayList<GroupInfo>();
                for (Groups g:groupsList) {
                    GroupInfo gi = new GroupInfo();
                    gi.setGroups(g);
                    List<Authority> authorities = authorityDao.loadByGrpId(g.getGroup_code());
                    gi.setAuthorities(authorities);
                    gs.add(gi);
                }
                userInfo.setGroupInfos(gs);
            }
            user.setUser_pwd("");
            userInfo.setUser(user);
        }
        return userInfo;
    }
}
