package com.monkey01.feign.controller;

import com.monkey01.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feiweiwei on 17/8/6.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String getUser(@RequestBody String data){
        return userService.getUSer(data);
    }
}
