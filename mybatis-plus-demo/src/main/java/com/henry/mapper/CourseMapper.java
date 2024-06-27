package com.henry.mapper;

import com.henry.model.course.Output;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    List<Output> list(@Param("id") Integer id,
                      @Param("userId") Integer userId,
                      @Param("name") String name,
                      @Param("intro") String intro);
}
