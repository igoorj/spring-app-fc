package br.com.exemplo.spring_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "<h1>Ola mundo, ola docker!!!</h1>";
    }
}
