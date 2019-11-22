package com.wyma.serviceribbon.web;

import com.wyma.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author      ：51ma
 * @ DateTime    ：2019/11/21 15:30
 * @ Description ：TODO
 * @ Version     ：v1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
