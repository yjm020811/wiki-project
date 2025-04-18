package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication(scanBasePackages = "com.example") // 这是一个springboot的应用程序
public class DemoApplication {
    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
       SpringApplication app = new SpringApplication(DemoApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
    }
}
