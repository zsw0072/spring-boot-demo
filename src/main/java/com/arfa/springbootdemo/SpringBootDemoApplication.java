package com.arfa.springbootdemo;

import com.arfa.springbootdemo.config.MyAnotherConfig;
import com.arfa.springbootdemo.config.WebConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({WebConfig.class, MyAnotherConfig.class})
@MapperScan("com.arfa.springbootdemo.mapper")
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
