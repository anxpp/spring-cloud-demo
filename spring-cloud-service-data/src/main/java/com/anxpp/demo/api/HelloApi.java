package com.anxpp.demo.api;

import com.anxpp.demo.core.service.HelloService;
import com.anxpp.demo.dto.SimpleResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试
 * Created by yangtao on 2017/6/20.
 */
@RestController
@RequestMapping("/hello")
public class HelloApi {

    @Resource
    private HelloService helloService;

    @RequestMapping
    public SimpleResponse index() throws Exception {
        return helloService.hello();
    }

    @RequestMapping("/{name}")
    public SimpleResponse name(@PathVariable String name) {
        return helloService.helloName(name);
    }
}
