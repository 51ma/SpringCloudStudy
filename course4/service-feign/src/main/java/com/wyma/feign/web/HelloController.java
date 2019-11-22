package com.wyma.feign.web;

import com.wyma.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author      ：51ma
 * @ DateTime    ：2019/11/22 11:16
 * @ Description ：TODO
 * @ Version     ：v1.0
 */
@RestController
public class HelloController {

    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
