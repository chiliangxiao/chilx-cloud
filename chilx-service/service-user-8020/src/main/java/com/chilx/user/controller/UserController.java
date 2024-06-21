package com.chilx.user.controller;

import com.chilx.common.res.ResApi;
import com.chilx.user.feign.SysFeignService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chilx
 **/
@RestController
@RequestMapping
public class UserController {

    @Resource
    private SysFeignService sysFeignService;
    @GetMapping("/info")
    public ResApi<?> info(Long userId) {
        List<String> userAuth = sysFeignService.userAuth(userId);
        return ResApi.ok(userAuth);
    }

}
