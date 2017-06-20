package com.anxpp.demo.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 获取端口
 * Created by anxpp.com on 2017/6/20.
 */
@Component
public class PortUtil implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {

    private int serverPort;

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        this.serverPort = event.getEmbeddedServletContainer().getPort();

    }

    public int getPort() {
        return this.serverPort;
    }

}