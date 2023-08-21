package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @date:2023/8/20 16:13
 * @author:Mr.zhao
 * @Description:
 **/
public interface UserService {
    /**
     * 登录功能
     * @param userLoginDTO
     * @return
     */
    User wxlogin(UserLoginDTO userLoginDTO);
}
