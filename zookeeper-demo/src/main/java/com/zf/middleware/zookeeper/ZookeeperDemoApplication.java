package com.zf.middleware.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 作者  zhoufu
 * 日期  2021/1/28.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.zf.middleware"})
public class ZookeeperDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperDemoApplication.class);
    }
}
