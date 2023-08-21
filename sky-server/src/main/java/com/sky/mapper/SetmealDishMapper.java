package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @date:2023/8/11 21:09
 * @author:Mr.zhao
 * @Description:
 **/
@Mapper
public interface SetmealDishMapper {

//    @Select("select setmeal_id from setmeal_dish where ")
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
