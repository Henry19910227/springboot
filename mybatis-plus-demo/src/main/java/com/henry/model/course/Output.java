package com.henry.model.course;

import lombok.Data;

@Data
public class Output {
    private Integer id;
    private Integer userId;
    private String name;
    private String intro;
    private String createAt;
    private String updateAt;
}
