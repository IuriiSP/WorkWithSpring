package data;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class People implements PhoneBook {
    private final Map<String,String> names = Map.of("Alex","89619360300","Iurii", "89619360322");

    public String giveMeNumber (String name){
        System.out.println("We'll see");
        return names.get(name);
    }
}