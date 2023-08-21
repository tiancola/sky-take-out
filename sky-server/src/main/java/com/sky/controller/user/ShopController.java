package com.sky.controller.user;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @date:2023/8/17 20:01
 * @author:Mr.zhao
 * @Description:
 **/
@RestController("userShopController")
@RequestMapping("/user/shop")
@Api(tags = "店铺相关接口")
public class ShopController {

    @Autowired
    private RedisTemplate redisTemplate;



    @GetMapping("/status")
    @ApiOperation("查询营业状态")
    public Result<Integer> getStatus(){

        Integer status = (Integer) redisTemplate.opsForValue().get("SHOP_STATUS");

        return Result.success(status);
    }
}
