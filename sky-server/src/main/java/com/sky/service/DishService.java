package com.sky.service;

import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

/**
 * @date:2023/8/11 19:54
 * @author:Mr.zhao
 * @Description:
 **/
public interface DishService {

    /**
     * 分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult page(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 删除
     * @param ids
     */
    void deleteBatch(List<Long> ids);
}
