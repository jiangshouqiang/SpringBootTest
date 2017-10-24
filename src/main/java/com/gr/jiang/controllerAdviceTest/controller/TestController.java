package com.gr.jiang.controllerAdviceTest.controller;

import com.gr.jiang.controllerAdviceTest.exception.TestException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang on 2017/10/24.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test1")
    public void Test1() throws Exception{
        throw new Exception();
    }

    @RequestMapping("/test2")
    public void Test2() throws TestException{
        throw new TestException("TEST00002","Advice测试");
    }
}
