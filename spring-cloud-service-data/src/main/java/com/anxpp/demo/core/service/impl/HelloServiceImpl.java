package com.anxpp.demo.core.service.impl;

import com.anxpp.demo.Exception.BusinessException;
import com.anxpp.demo.config.PortUtil;
import com.anxpp.demo.core.service.HelloService;
import com.anxpp.demo.dto.SimpleResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangtao on 2017/6/21.
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private PortUtil portUtil;

    @Override
    public SimpleResponse hello() throws Exception {
        throw new Exception("hello");
//        return SimpleResponse.builder().data("Hello World ! My port is " + portUtil.getPort()).build();
    }

    @Override
    public SimpleResponse helloName(String name) {
        throw new BusinessException(-1, "helloName");
//        return SimpleResponse.builder().data("Hello " + name + " ! My port is " + portUtil.getPort()).build();
    }

}
