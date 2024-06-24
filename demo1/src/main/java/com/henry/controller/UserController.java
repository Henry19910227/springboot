package com.henry.controller;

import com.henry.mapper.UserMapper;
import com.henry.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("test")
    public List<User> test() {
        List<User> list = jdbcTemplate.query("SELECT * FROM ssm.users", new BeanPropertyRowMapper<>(User.class));
        return list;
    }

    @GetMapping("test2")
    public List<User> test2() {
        return userMapper.findAll();
    }
}
