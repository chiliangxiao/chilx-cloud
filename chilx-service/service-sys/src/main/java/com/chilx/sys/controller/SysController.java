package com.chilx.sys.controller;

import com.chilx.common.res.ResApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
