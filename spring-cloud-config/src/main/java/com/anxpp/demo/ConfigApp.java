package com.anxpp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@EnableConfigServer
@SpringBootApplication
@RestController
public class ConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApp.class, args);
    }

    @RequestMapping
    public List<Info> index() {
        return Info.list();
    }

    private static class Info {
        private String method = "GET";
        private String path;
        private String desc;
        private Boolean auth = true;

        private Info(String method, String path, String desc, Boolean auth) {
            this.method = method;
            this.path = path;
            this.desc = desc;
            this.auth = auth;
        }

        static List<Info> list() {
            List<Info> list = new ArrayList<>();
            list.add(new Info("GET", "/autoconfig", "查看自动配置的使用情况", true));
            list.add(new Info("GET", "/configprops", "查看配置属性，包括默认配置", true));
            list.add(new Info("GET", "/beans", "查看bean及其关系列表", true));
            list.add(new Info("GET", "/dump", "打印线程栈", true));
            list.add(new Info("GET", "/env", "查看所有环境变量", true));
            list.add(new Info("GET", "/env/{name}", "查看具体变量值", true));
            list.add(new Info("GET", "/health", "查看应用健康指标", false));
            list.add(new Info("GET", "/Info", "查看应用信息", false));
            list.add(new Info("GET", "/mappings", "查看所有url映射", true));
            list.add(new Info("GET", "/metrics", "查看自动配置的使用情况", true));
            list.add(new Info("GET", "/metrics/{name}", "查看自动配置的使用情况", true));
            list.add(new Info("POST", "/trace", "查看基本追踪信息", true));
            list.add(new Info("GET", "/autoconfig", "查看自动配置的使用情况", true));
            list.add(new Info("GET", "/autoconfig", "查看自动配置的使用情况", true));
            list.add(new Info("GET", "/autoconfig", "查看自动配置的使用情况", true));
            list.add(new Info("GET", "/autoconfig", "查看自动配置的使用情况", true));
            return list;
        }

        public String getMethod() {
            return method;
        }

        public String getPath() {
            return path;
        }

        public String getDesc() {
            return desc;
        }

        public Boolean getAuth() {
            return auth;
        }
    }
}
