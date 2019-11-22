package com.wyma.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author      ：51ma
 * @ DateTime    ：2019/11/21 15:28
 * @ Description ：TODO
 * @ Version     ：v1.0
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name="+name,String.class);
    }
}
