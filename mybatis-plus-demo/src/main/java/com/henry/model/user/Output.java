package com.henry.model.user;

import lombok.Data;

import java.util.List;

@Data
public class Output {
    private Integer id;
    private String nickname;
    private String email;
    private String createAt;
    private String updateAt;
    private List<com.henry.model.course.Output> courses;
}
