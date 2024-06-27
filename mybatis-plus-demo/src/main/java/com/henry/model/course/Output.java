package com.henry.model.course;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class Output extends Table {
    private List<com.henry.model.plan.Output> plans;
}
