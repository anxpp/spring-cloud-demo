# Spring Cloud Demo

### 模块说明
| 模块        | 说明           | 端口  |   服务名 |
| ----- |:-------:| -----| -----:|
| spring-cloud-common| 公共jar包，含公共实体、工具类等 | -| -|
| spring-cloud-config| 配置项目| 8888| config|
| spring-cloud-eureka| 注册中心| 8761| eureka|
| spring-cloud-service-data| 数据服务| 9998| service-data|
| spring-cloud-web-home|Web主页| 9898| web-home|

### 项目涉及的主要内容

- Spring Cloud Config 配置仓库
- Spring Cloud Eureka 注册中心
- docker-maven-plugin Docker 打包插件
- Spring Boot Actuator 系统的自省和监控工具
- Feign 调用（基于 spring-cloud-starter-parent 自动实现负载均衡）
- Lombok 工具