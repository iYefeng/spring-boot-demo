package com.git.hui.cloud.config.server.conf;

import com.git.hui.cloud.config.server.demo.BDemo;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by @author yihui in 22:19 18/9/6.
 */
@Configuration
@AutoConfigureOrder(15)
public class BConf {
    @Bean
    public BDemo bDemo() {
        System.out.println("bconf");
        return new BDemo();
    }
}
