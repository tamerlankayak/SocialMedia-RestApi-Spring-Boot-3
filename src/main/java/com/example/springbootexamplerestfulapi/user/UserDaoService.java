package com.example.springbootexamplerestfulapi.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    public static List<User> users = new ArrayList<>();
    private static int usersCount = 3;


    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Tamerlan", LocalDate.now().minusYears(29)));
        users.add(new User(++usersCount, "Elcin", LocalDate.now().minusYears(41)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }


    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
