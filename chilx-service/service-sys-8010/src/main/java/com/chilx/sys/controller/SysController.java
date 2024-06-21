package com.chilx.sys.controller;

import com.chilx.common.res.ResApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author chilx
 **/
@RestController
@RequestMapping
public class SysController {


    @GetMapping("/info")
    public ResApi<String> info(String username) {
        return ResApi.ok("hello sys " + username);
    }


    @GetMapping("/getAuth")
    public ResApi<List<String>> getAuth(Long userId) {
        return ResApi.ok(Arrays.asList(userId+ " 新增权限", userId+ " 删除权限"));
    }

}
