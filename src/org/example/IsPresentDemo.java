package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class IsPresentDemo {

    public static  void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", null));
        users.add(new User("Bob", "bob@gmail.com"));
        users.add(new User("Charlie", "charlie@gmail.com"));

        //use optional to check if email is present and process this list as stream. Get list of email ids.
        users.stream()
                .map(User::getEmail)
                .filter(email -> email != null && !email.isEmpty()) // filter out null or empty emails
                .forEach(email -> System.out.println("Email: " + email));

        // Alternatively, using Optional to handle potential null values
        users.stream()
                .map(user -> Optional.ofNullable(user.getEmail()))
                .filter(Optional::isPresent) // filter out empty Optionals
                .map(Optional::get) // get the value from Optional
                .forEach(email -> System.out.println("Email: " + email));
    }

}
