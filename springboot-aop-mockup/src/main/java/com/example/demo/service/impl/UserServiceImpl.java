package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: xiadongming
 * @Date: 2020/10/11 9:37
 * @描述:
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String selectByUserId() {
        return "北京以北";
    }
}
