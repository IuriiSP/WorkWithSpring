package data;

import org.springframework.stereotype.Component;

@Component
public interface PhoneBook {
    String giveMeNumber(String name);
}
