package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 测试文件上传功能
 * @author Solider
 * @version 1.0
 * @Date 2023/10/10 17:12
 * @since 1.0
 */
@Controller
public class FormTestController {

    @RequestMapping("form_layouts")
    public String form_layouts() {
        return "form/form_layouts";
    }
}
