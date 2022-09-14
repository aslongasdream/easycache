package org.galileo.easycache.easycachetest;

import org.galileo.easycache.springboot.config.EnableEasyCache;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.galileo.easycache")
@MapperScan("org.galileo.easycache.easycachetest")
@EnableEasyCache(basePackages = "org.galileo.easycache")
public class EasyCacheTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyCacheTestApplication.class, args);
    }

}
