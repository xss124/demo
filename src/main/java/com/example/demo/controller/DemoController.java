package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping
@RestController
public class DemoController {

    @RequestMapping("/demo")
    public Map<String,String> getReturn(){
        Map<String,String> map =  new HashMap<>();
        map.put("code","200");
        return map;
    }
}
