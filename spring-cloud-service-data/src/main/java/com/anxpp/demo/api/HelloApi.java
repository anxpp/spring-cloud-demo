package com.anxpp.demo.api;

import com.anxpp.demo.dto.SimpleResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * Created by yangtao on 2017/6/20.
 */
@RestController
@RequestMapping("/hello")
public class HelloApi {

    @RequestMapping
    public SimpleResponse index() {
        SimpleResponse response = new SimpleResponse();
        response.setData("Hello World !");
        return response;
    }

    @RequestMapping("/{name}")
    public SimpleResponse name(@PathVariable String name) {
        SimpleResponse response = new SimpleResponse();
        response.setData("Hello " + name + " !");
        return response;
    }
}
