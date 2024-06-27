package com.henry.mapper;

import com.henry.model.course.Output;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlanMapper {
    List<Output> list(@Param("id") Integer id,
                      @Param("courseId") Integer courseId,
                      @Param("name") String name);
}
