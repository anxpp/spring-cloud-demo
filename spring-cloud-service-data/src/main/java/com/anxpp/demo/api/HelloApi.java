package com.anxpp.demo.api;

import com.anxpp.demo.config.PortUtil;
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
    private PortUtil portUtil;

    @RequestMapping
    public SimpleResponse index() {
        SimpleResponse response = new SimpleResponse();
        response.setData("Hello World ! My port is " + portUtil.getPort());
        return response;
    }

    @RequestMapping("/{name}")
    public SimpleResponse name(@PathVariable String name) {
        SimpleResponse response = new SimpleResponse();
        response.setData("Hello " + name + " ! My port is " + portUtil.getPort());
        return response;
    }
}
