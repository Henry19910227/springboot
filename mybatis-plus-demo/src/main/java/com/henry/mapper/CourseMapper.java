package com.henry.mapper;

import com.henry.model.course.ListInput;
import com.henry.model.course.Output;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    List<Output> list(ListInput input);
}
