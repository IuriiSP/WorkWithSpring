package data;

import org.springframework.stereotype.Component;

@Component
public class Service {

    private final PhoneBook phoneBook;

    public Service(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String numberPlease (String name){
        return this.phoneBook.giveMeNumber(name);
    }
}
