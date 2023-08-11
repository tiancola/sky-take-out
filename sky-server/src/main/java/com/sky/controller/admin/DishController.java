package com.sky.controller.admin;

import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.DishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @date:2023/8/9 20:10
 * @author:Mr.zhao
 * @Description:
 **/
//TODO 菜品管理未做
@RequestMapping("/admin/dish")
@RestController
@Api(tags = "菜品相关接口")
public class DishController {

    @Autowired
    private DishService dishService;


    @GetMapping("/page")
    @ApiOperation("菜品分页查询")
    public Result<PageResult> page(DishPageQueryDTO dishPageQueryDTO){
        PageResult page = dishService.page(dishPageQueryDTO);
        return Result.success(page);
    }

    @DeleteMapping
    @ApiOperation("批量删除")
    public Result delete(@RequestParam List<Long> ids){//加了@RequestParam,springmvc自动解析
        dishService.deleteBatch(ids);
        return Result.success();
    }



}
