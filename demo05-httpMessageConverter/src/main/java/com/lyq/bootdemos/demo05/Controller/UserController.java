package com.lyq.bootdemos.demo05.Controller;

import com.lyq.bootdemos.demo05.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 0:34
 */
@RestController
public class UserController {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Object getList(){
        List<User> list = new ArrayList<>();
        User ul = new User("一哥", null);
        list.add(ul);
        return list;
    }
}
