package com.mochen.spi.infrastucture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration //配置类
@EnableSwagger2// 开启Swagger2的自动配置
public class SwaggerConfig {

    @Bean //配置docket以配置Swagger具体参数
    public Docket userDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户中心")
                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.basePackage("com.mochen.spi.restful.user"))
                .build();
    }

    @Bean //配置docket以配置Swagger具体参数
    public Docket orderDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("订单中心")
                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.basePackage("com.mochen.spi.restful.order"))
                .build();
    }

    @Bean //配置docket以配置Swagger具体参数
    public Docket productDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("商品中心")
                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.basePackage("com.mochen.spi.restful.product"))
                .build();
    }

}
