package com.lyq.bootdemos.demo08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/15 20:10
 */
@Controller
public class NegotiationController {
    @GetMapping(value="show/{type}")
    public String showUser(@PathVariable("type") String type){
        System.out.println("type="+type);
        return "学习ContentNegotiationViewResolver";
    }
}
