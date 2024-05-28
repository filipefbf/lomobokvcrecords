package com.filipeferreira.lombokvsrecords.service;

import com.filipeferreira.lombokvsrecords.entities.lombokUser.LombokUser;
import com.filipeferreira.lombokvsrecords.entities.recordUser.RecordUser;
import com.filipeferreira.lombokvsrecords.entities.simpleUser.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    Map<String, User> users = new HashMap<>();
    Map<String, LombokUser> lombokUser = new HashMap<>();

    Map<String, RecordUser> recordUser = new HashMap<>();

    //for simple user
    public void create1(User user) {
        users.put(user.getUsername(), new User(user.getUsername(), user.getPassword(), user.getEmail()));
    }

    public User getUser(String username) {
        return users.get(username);
    }

    //for lombok user
    public void create2(LombokUser user) {
        lombokUser.put(user.getUsername(), new LombokUser(user.getUsername(), user.getPassword(), user.getEmail()));
    }

    public LombokUser getLombokUser(String username) {
        return lombokUser.get(username);
    }

    //for record user
    public void create3(RecordUser user) {
        recordUser.put(user.username(), new RecordUser(user.username(), user.password(), user.email()));
    }

    public RecordUser getRecordUser(String username) {
        return recordUser.get(username);
    }
}
