package com.tireba.mallsystem.config;

import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * @Description api文档配置类
 * @Date 2022/3/16 16:16
 * @Create by Tireba
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${server.servlet.context-path}")
    private String pathMapping;

    private ApiInfo initApiInfo() {
        ApiInfo apiInfo = new ApiInfo("商城后台管理项目 Platform API",//大标题
                initContextInfo(),//简单的描述
                "1.0.0",//版本
                "服务条款",
                "田仁斌",//作者
                "The Apache License, Version 2.0",//链接显示文字
                "http://www.tireba.com/mallManage/index"//网站链接
        );

        return apiInfo;
    }

    private String initContextInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append("REST API 设计在细节上有很多自己独特的需要注意的技巧，并且对开发人员在构架设计能力上比传统 API 有着更高的要求。")
                .append("<br/>")
                .append("本文通过翔实的叙述和一系列的范例，从整体结构，到局部细节，分析和解读了为了提高易用性和高效性，REST API 设计应该注意哪些问题以及如何解决这些问题。");

        return sb.toString();
    }


    @Bean
    public Docket restfulApi() {
        System.out.println("http://localhost:20872" + pathMapping + "/swagger-ui.html");

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("RestfulApi")
//                .genericModelSubstitutes(DeferredResult.class)
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(true)
                .forCodeGeneration(false)
                .pathMapping(pathMapping) // base，最终调用接口后会和paths拼接在一起
                .select()
//                .paths(doFilteringRules())
                .paths(any())
                .build()
                .apiInfo(initApiInfo());
    }

    /**
     * 设置过滤规则
     * 这里的过滤规则支持正则匹配
     * @return
     */
    private Predicate<String> doFilteringRules() {
        return or(
                regex("/hello.*"),
                regex("/vehicles.*")
        );
    }
}
