package com.opensourceteam.modules.admin.configuration.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 开发人:刘文
 * 日期:  2017/11/25.
 * 功能描述:
 */
@Controller
@EnableAutoConfiguration
@ComponentScan("com.opensourceteam")
public class Run {

    Logger logger = LoggerFactory.getLogger(Run.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Run.class, args);
    }
}
