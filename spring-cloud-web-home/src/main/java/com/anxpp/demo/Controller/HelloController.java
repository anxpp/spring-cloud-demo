package com.anxpp.demo.Controller;

import com.anxpp.demo.Exception.BusinessException;
import com.anxpp.demo.FeignClient.HelloClient;
import com.anxpp.demo.dto.SimpleResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * hello
 * Created by yangtao on 2017/6/20.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloClient helloClient;

    @RequestMapping
    @ResponseBody
    public SimpleResponse hello() throws Exception {
        throw new Exception("hello");
//        return helloClient.hello();
    }

    @RequestMapping("/{name}")
    @ResponseBody
    public SimpleResponse helloName(@PathVariable String name) {
        throw new BusinessException(-1, "helloName");
//        return helloClient.helloName(name);
    }

}
