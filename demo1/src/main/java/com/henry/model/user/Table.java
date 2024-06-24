package com.henry.model.user;

import lombok.Data;

@Data
public class Table {
    private int id;
    private String nickname;
    private String email;
    private String createAt;
    private String updateAt;
}
