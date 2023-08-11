package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.plaf.multi.MultiFileChooserUI;

/**
 * @date:2023/8/9 17:13
 * @author:Mr.zhao
 * @Description:
 *
 **/
//TODO 图片的上传逻辑没有实现
@RestController
@RequestMapping("/admin/common")
public class CommonController {

    @PostMapping("/upload")
    @ApiOperation("文件上传")
    public Result<String> upload(MultipartFile file){//上传的是文件，SpringMVC帮助封装成Multipart
        return null;
    }
}
