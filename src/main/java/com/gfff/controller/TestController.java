package com.gfff.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制类
 *
 * @author gaofeng
 * @version 1.0
 * @date 2020-04-07
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/hello")
    public String helloWorld() {
        return "hello world!";
    }
}
