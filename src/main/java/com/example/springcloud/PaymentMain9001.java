package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author fengjw
 * @Classname
 * @Description
 * @Date 2021/10/27 16:06
 */
@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
//@EnableAsync
public class PaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9001.class, args);
    }

    //http://localhost:9001/payment/getstr
}
