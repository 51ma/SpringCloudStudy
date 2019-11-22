package com.wyma.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Author      ：51ma
 * @ DateTime    ：2019/11/22 11:16
 * @ Description ：TODO
 * @ Version     ：v1.0
 */
@FeignClient(value = "service-hello")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

