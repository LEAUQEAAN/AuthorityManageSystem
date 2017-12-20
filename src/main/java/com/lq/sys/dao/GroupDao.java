package com.lq.sys.dao;

import com.lq.sys.model.Groups;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Software1 on 2017/12/15.
 */
public interface GroupDao {

    @Select("select * from groups where group_code in (select group_code from belong where user_code = #{0})")
    List<Groups> loadByUserId(String code);
}
