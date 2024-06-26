package com.henry.model.user;

import lombok.Data;

@Data
public class Users {
    private int id;
    private String nickname;
    private String email;
    private String createAt;
    private String updateAt;
}
