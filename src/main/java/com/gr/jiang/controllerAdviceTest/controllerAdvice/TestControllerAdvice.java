package com.gr.jiang.controllerAdviceTest.controllerAdvice;

import com.gr.jiang.controllerAdviceTest.exception.TestException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiang on 2017/10/24.
 */
@RestControllerAdvice
public class TestControllerAdvice {

//    @InitBinder
//    public void initBinder(WebDataBinder binder){}
//
//    @ModelAttribute
//    public void addAttributes(Model model){
//        model.addAttribute("author","sam");
//    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex){
        Map map = new HashMap();
        map.put("msgCode","TEST00001");
        map.put("msgInfo","This is a test");
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = TestException.class)
    public Map TestErrorHandler(TestException ex){
        Map map = new HashMap();
        map.put("msgCode",ex.getMsgCode());
        map.put("msgInfo",ex.getMsgInfo());
        return map;
    }

}
