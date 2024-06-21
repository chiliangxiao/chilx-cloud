package com.chilx.user.feign;


import com.chilx.user.config.OpenfeignResultDecoderConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author chilx
 */
@FeignClient(name = "service-sys", url = "127.0.0.1:8010", configuration = OpenfeignResultDecoderConfig.class)
public interface SysFeignService {

    @GetMapping("/getAuth")
    List<String> userAuth(@RequestParam Long userId);

}
