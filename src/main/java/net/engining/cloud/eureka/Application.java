package net.engining.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心服务启动类
 * @author luxue
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
    	SpringApplication.run(Application.class, args);
    }

}
