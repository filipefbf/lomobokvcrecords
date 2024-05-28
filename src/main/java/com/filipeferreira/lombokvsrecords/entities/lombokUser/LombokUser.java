package com.filipeferreira.lombokvsrecords.entities.lombokUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LombokUser {
    private String username;
    private String password;
    private String email;
}
