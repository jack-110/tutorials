package org.example.demo.ioc;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class Feather {

    private Bird bird;

    public void setBird(Bird bird) {
        this.bird = bird;
    }
}
