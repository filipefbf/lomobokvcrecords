package com.filipeferreira.lombokvsrecords.entities.recordUser;

public record RecordUser(
        String username,
        String password,
        String email) {

    public RecordUser {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
    }
}
