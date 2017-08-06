package com.monkey01.feign.service.impl;

import com.monkey01.feign.client.UserFeignClient;
import com.monkey01.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by feiweiwei on 17/8/6.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public String getUSer(String data) {
        return "Feign: " + userFeignClient.getUser(data);
    }
}
