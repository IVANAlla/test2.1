package app;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args)  {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) context.getBean("getHelloWorld");
        System.out.println(helloWorld.getMessage());
        HelloWorld helloWorld1 = (HelloWorld) context.getBean("getHelloWorld");
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("getHelloWorld");
        Cat cat1  = (Cat) context.getBean("cat", Cat.class);
        Cat cat2  = (Cat) context.getBean("cat", Cat.class);
        System.out.println(helloWorld1 == helloWorld2);
        System.out.println(cat1 == cat2);
        context.close();
    }
}