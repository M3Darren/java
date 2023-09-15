package com.example.springboot.ant_fun.fun;

import com.example.springboot.ant_fun.fun.handler.UserHandler;
import com.example.springboot.ant_fun.service.UserService;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;


import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

public class Server {

    //启动服务器
    public static void main(String[] args) {
        Server server = new Server();
        server.createReactorServer();
        System.out.println("enter to exit");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //    创建路由
    public RouterFunction<ServerResponse> routingFunction() {
        UserService userService = new UserService();
        UserHandler userHandler = new UserHandler(userService);
        return RouterFunctions.route(
                GET("/user/{id}").and(accept(APPLICATION_JSON)), userHandler::getUser).andRoute(GET("/users").and(accept(APPLICATION_JSON)),userHandler::getAll);
    }

//    完成适配
    public void createReactorServer(){
        //路由与handler适配
        RouterFunction<ServerResponse> serverResponseRouterFunction = routingFunction();
        HttpHandler httpHandler = toHttpHandler(serverResponseRouterFunction);
        ReactorHttpHandlerAdapter reactorHttpHandlerAdapter = new ReactorHttpHandlerAdapter(httpHandler);

        //创建服务器
        HttpServer httpServer = HttpServer.create();
        httpServer.handle(reactorHttpHandlerAdapter).bindNow();
    }
}
