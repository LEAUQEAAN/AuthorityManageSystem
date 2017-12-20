package com.lq.sys.dao;

import com.lq.sys.model.Authority;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Software1 on 2017/12/15.
 */
public interface AuthorityDao {

    @Select("select * from authority where authority_code in (select authority_code from have where group_code = #{0})")
    List<Authority> loadByGrpId(int code);
}
