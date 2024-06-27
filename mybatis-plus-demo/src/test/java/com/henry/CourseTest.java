package com.henry;

import com.henry.mapper.CourseMapper;
import com.henry.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseTest {
    @Autowired
    private CourseMapper courseMapper;
}
