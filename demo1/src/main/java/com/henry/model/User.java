package com.henry.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "user")
public class User {
    private int id;
    private String nickname;
    private String email;
    private String createAt = "2024-06-27 12:00:00";
    private String updateAt = "2024-06-27 12:00:00";
}
