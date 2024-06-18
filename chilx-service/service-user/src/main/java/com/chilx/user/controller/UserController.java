package com.chilx.user.controller;

import com.chilx.common.res.ResApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chilx
 **/
@RestController
@RequestMapping
public class UserController {

    @GetMapping("/info")
    public ResApi<String> info(String username) {
        return ResApi.ok("hello user " + username);
    }

}
