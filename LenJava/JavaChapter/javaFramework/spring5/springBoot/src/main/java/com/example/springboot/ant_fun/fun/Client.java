package com.example.springboot.ant_fun.fun;

import com.example.springboot.ant_fun.bean.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class Client {
    public static void main(String[] args) {
//        调用服务器地址
        WebClient webClient = WebClient.create("http://127.0.0.1:50491");

//        根据id查询
        User block = webClient.get().uri("/user/{id}", 1).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class).block();
        System.out.println(block);
    }
}
