package com.monkey01.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by feiweiwei on 17/8/6.
 */
@FeignClient("usercenter-provider")

public interface UserFeignClient {
    //Feign定义服务提供者接口
    @RequestMapping(value = "/getUser", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    String getUser(@RequestBody String data);

}
