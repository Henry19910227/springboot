package com.henry.controller;

import com.henry.mapper.UserMapper;
import com.henry.model.User;
import com.henry.model.user.Table;
import com.henry.model.user.find_user_by_id.Input;
import com.henry.service.UserService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("test")
    public List<User> test() {
        return userService.test();
    }


    @GetMapping("users")
    public List<User> users() {
        return userService.findAll();
    }

    @GetMapping("user/{id}")
    public Object getUser(@PathVariable(value = "id") int id) {
        Table item = new Table();
        item.setId(id);
        Table table = userService.find(item);
        Map<String, Object> data = new HashMap<>();
        data.put("code", 200);
        data.put("data", table);
        return data;
    }

    @PutMapping("user/{id}")
    public Object updateUser(@PathVariable(value = "id") int id,
                             @Nullable String nickname,
                             @Nullable String email) {
        Table user = new Table();
        user.setId(id);
        user.setNickname(nickname);
        user.setEmail(email);
        userService.updateUser(user);
        return "success!";
    }
}
