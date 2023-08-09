package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @date:2023/8/9 10:35
 * @author:Mr.zhao
 * @Description:
 * 自定义注解，用于标识某个方法需要进行字段自动填充处理
 **/

@Target(ElementType.METHOD)//表示注解会加在什么位置
@Retention(RetentionPolicy.RUNTIME)// 指定注解在运行时保留
public @interface AutoFill {
    //数据库操作类型，UPDATE, INSERT
    OperationType value();
}
