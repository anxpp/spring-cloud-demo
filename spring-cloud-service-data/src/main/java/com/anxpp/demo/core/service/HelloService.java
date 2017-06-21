package com.anxpp.demo.core.service;

import com.anxpp.demo.dto.SimpleResponse;

/**
 * Created by yangtao on 2017/6/21.
 */
public interface HelloService {

    SimpleResponse hello() throws Exception;

    SimpleResponse helloName(String name);
}
