package com.example.springboot.ant_fun.fun.handler;

import com.example.springboot.ant_fun.bean.User;
import com.example.springboot.ant_fun.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

public class UserHandler {
    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

//    根据id查询
    public Mono<ServerResponse> getUser(ServerRequest request){
        Integer id = Integer.valueOf(request.pathVariable("id"));
        Mono<User> userById = this.userService.getUserById(id);
//        把mono转换为流
        Mono<ServerResponse> serverResponseMono = userById.flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject(person))).switchIfEmpty(Mono.empty());
        return serverResponseMono;
    }

//    查询所有
    public Mono<ServerResponse> getAll(ServerRequest request){
        Flux<User> allUser = this.userService.getAllUser();
        Mono<ServerResponse> body = ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(allUser, User.class);
        return body;
    }

//    添加用户
    public Mono<ServerResponse> save(ServerRequest request){
        Mono<User> userMono = request.bodyToMono(User.class);
        return ServerResponse.ok().build(this.userService.saveUser(userMono));
    }
}
