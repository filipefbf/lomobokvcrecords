package com.filipeferreira.lombokvsrecords.service;

import com.filipeferreira.lombokvsrecords.entities.simpleUser.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    Map<String, User> users = new HashMap<>();

    public void create(User user) {
        users.put(user.getUsername(), new User(user.getUsername(), user.getPassword(), user.getEmail()));
    }

    public User getUser(String username) {
        return users.get(username);
    }
}
