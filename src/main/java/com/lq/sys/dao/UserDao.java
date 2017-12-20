package com.lq.sys.dao;

import com.lq.sys.model.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Software1 on 2017/12/15.
 */
public interface UserDao {

    @Select("select * from user where user_code = #{0}")
    User loadById(String code);

}
