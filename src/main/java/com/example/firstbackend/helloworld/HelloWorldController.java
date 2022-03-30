package com.example.firstbackend.helloworld;

import com.example.firstbackend.helloworld.NewWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String newWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public NewWorldBean newWorldBean(){
        return new NewWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public NewWorldBean newWorldPathVariable(@PathVariable String name){
        return new NewWorldBean(String.format("Hello World, %s", name));
    }
}
