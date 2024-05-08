package features.example.graphqlserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Author author() {
        return new Author("123", "abc", "dcc");
    }
}
