package org.example.demo.ioc;

import org.springframework.stereotype.Component;

@Component
public class Bird {
    private Feather feather;

    public Bird(Feather feather) {
        this.feather = feather;
        System.out.println("call bird constructor.");
    }

    public String call() {
        return "Hello, bird, bird.";
    }
}
