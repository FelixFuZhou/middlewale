package com.zf.middleware.zookeeper.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者  zhoufu
 * 日期  2021/1/28.
 */
@RestController
@Slf4j
public class HomeController {

    @RequestMapping(value = "index")
    public String index(){
        return "success";
    }
}
