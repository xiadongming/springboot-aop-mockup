package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import mockit.Mock;
import mockit.MockUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiadongming
 * @Date: 2020/10/11 9:38
 * @描述:
 */
@RestController
@RequestMapping("/dev")
public class MockUpController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/mock",method = RequestMethod.GET)
    public void mockupController(){

        System.out.println(userService.selectByUserId());

        new MockUp<UserServiceImpl>(UserServiceImpl.class){
            @Mock
            String selectByUserId(){
                return "河南郑州，+ 天津";
            }
        };

        System.out.println(userService.selectByUserId());
    }
}
