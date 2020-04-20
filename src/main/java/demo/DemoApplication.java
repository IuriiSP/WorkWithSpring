package demo;

import data.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        // пустой спринговый контекст, который будет искать бины по аннотациям в указанном пакете
        ApplicationContext context = new AnnotationConfigApplicationContext("data");
        Service service = context.getBean(Service.class);
        System.out.println(service.numberPlease("Alex"));
    }
}
