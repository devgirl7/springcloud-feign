package com.monkey01.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by feiweiwei on 17/8/6.
 */
@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
