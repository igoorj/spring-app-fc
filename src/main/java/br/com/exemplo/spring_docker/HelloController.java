package br.com.exemplo.spring_docker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "<h1>Ola mundo, ola docker!!!</h1>";
    }
}
