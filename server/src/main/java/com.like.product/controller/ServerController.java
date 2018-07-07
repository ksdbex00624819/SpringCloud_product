package com.like.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by like
 * 2018/5/27
 */
@RestController
public class ServerController {

    @GetMapping("msg")
    public String message(){
        return "this is a product msg";
    }

}
