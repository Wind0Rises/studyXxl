package com.liu.study.job.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/7/21 19:37
 * @version 1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/first")
    public String firstMethod() {
        return "success";
    }

}
