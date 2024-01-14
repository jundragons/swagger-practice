package com.practice.swagger.controller;

import com.practice.swagger.dto.TestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public TestResponse getTest(){
        String str = "test1";
        TestResponse response = new TestResponse();
        response.setTestStr(str);

        return response;
    }

}
