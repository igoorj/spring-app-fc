package br.com.exemplo.spring_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    @GetMapping
    public Boolean hello() {
        return isSameNumberValue(new AtomicLong(10L), new AtomicLong(11L));
    }

    Boolean isSameNumberValue(AtomicLong a, AtomicLong b) {
        return a.equals(b);
    }
}
