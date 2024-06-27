package com.henry.model.user;

import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;
@Data
@EqualsAndHashCode(callSuper = true)
public class Output extends Table {
    private List<com.henry.model.course.Output> courses;
}
