package com.henry.repository.course.implement;

import com.henry.mapper.CourseMapper;
import com.henry.mapper.UserMapper;
import com.henry.model.user.ListInput;
import com.henry.model.user.Output;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository implements com.henry.repository.course.Repository {

    private final CourseMapper courseMapper;

    @Autowired
    public Repository(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    @Override
    public List<Output> list(ListInput input) {
        return null;
    }
}
