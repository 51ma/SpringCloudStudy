package com.wyma.feign.service;

import org.springframework.stereotype.Component;

/**
 * @ Author      ：51ma
 * @ DateTime    ：2019/11/22 14:41
 * @ Description ：TODO
 * @ Version     ：v1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
