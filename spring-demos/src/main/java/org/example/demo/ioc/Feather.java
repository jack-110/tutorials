package org.example.demo.ioc;

import org.springframework.stereotype.Component;

@Component
public class Feather {

    private Bird bird;

    public void setBird(Bird bird) {
        this.bird = bird;
    }
}
