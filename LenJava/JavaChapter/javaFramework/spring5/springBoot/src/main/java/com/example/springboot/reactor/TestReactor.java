package com.example.springboot.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestReactor {
    public static void main(String[] args) {

//        使用just方法直接声明
        Flux<Integer> just = Flux.just(111, 222, 333);
        just.subscribe(System.out::println);
        Mono<Integer> just1 = Mono.just(111);

//        使用其他方式
//        1.fromArray
        Integer[] intArr={1,2,3};
        Flux<Integer> integerFlux = Flux.fromArray(intArr);
//        2.fromIterable
        List<Integer> list= Arrays.asList(intArr);
        Flux<Integer> integerFlux1 = Flux.fromIterable(list);
//        3.fromStream
        Stream<Integer> stream=list.stream();
        Flux<Integer> integerFlux2 = Flux.fromStream(stream);
    }
}
