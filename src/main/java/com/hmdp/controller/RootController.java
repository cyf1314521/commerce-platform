package com.hmdp.controller;

import com.hmdp.dto.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public Result index() {
        return Result.ok("hm-dianping 后端已运行。无需登录可试：GET /shop-type/list");
    }
}
