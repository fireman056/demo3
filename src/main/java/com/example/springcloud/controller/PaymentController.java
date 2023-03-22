package com.example.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fengjw
 * @Classname
 * @Description
 * @Date 2021/10/27 17:06
 */
@RestController
@Slf4j
public class PaymentController {


    @GetMapping(value = "/payment/getstr")
    public Object getStr() {
        String aaa = "hello world";
        return aaa;
    }

}
