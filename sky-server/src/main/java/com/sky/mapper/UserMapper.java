package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @date:2023/8/20 17:00
 * @author:Mr.zhao
 * @Description:
 **/
@Mapper
public interface UserMapper {



    @Select("select * from user where openid = #{openid")
    User getByOpenId(String openid);

    void insert(User user);
}
