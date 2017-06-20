package com.anxpp.demo.FeignClient;

import com.anxpp.demo.dto.SimpleResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * hello
 * Created by yangtao on 2017/6/20.
 */
@FeignClient("service-data")
public interface HelloClient {

    @RequestMapping(value = "/hello")
    SimpleResponse hello();

    @RequestMapping(value = "/hello/{name}")
    SimpleResponse helloName(@PathVariable("name") String name);

}
