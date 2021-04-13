package xin.carryzheng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xin.carryzheng.service.HelloService;

/**
 * @author zhengxin
 * @date 2018-09-21 20:57:13
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
