package com.henry.model.plan;

import lombok.Data;

@Data
public class Table {
    private Integer id;
    private Integer courseId;
    private String name;
    private String createAt;
    private String updateAt;
}
