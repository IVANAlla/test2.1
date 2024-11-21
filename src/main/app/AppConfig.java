package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope
public class AppConfig {
    @Bean
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name="cat")
    @Scope("prototype")
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("Tom");
        return cat;
    }
}




