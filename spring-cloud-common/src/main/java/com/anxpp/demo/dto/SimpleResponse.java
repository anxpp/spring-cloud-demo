package com.anxpp.demo.dto;

import lombok.Builder;
import lombok.Data;

/**
 * 响应消息
 * Created by yangtao on 2017/6/20.
 */

@Builder
@Data
public class SimpleResponse {

    private Integer code = 0;

    private Object data;

    private String message = "success";

}
