package com.lyq.bootdemos.demo06.controller;

import com.lyq.bootdemos.demo06.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 21:07
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public List<User> getUser(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "凌远强", "18337123711"));
        users.add(new User(2L, "凌远强2", "18337123712"));
        users.add(new User(3L, "凌远强3", "18337123713"));
        return users;
    }

}
