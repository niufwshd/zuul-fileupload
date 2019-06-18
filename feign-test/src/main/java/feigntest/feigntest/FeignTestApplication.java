package feigntest.feigntest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FeignTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignTestApplication.class, args);
    }

}
