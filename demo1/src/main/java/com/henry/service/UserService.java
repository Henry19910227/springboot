package com.henry.service;

import com.henry.mapper.UserMapper;
import com.henry.model.User;
import com.henry.model.user.Table;
import com.henry.model.user.find_user_by_id.Input;
import com.henry.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    public List<User> test() {
        List<User> list = jdbcTemplate.query("SELECT * FROM ssm.users", new BeanPropertyRowMapper<>(User.class));
        return list;
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public Table find(Table item) {
        return userMapper.findUser(item);
    }

    public void updateUser(Table item) {
        Table table = userMapper.findUser(item);
        if (!item.getNickname().isEmpty()) {
            table.setNickname(item.getNickname());
        }
        if (!item.getEmail().isEmpty()) {
            table.setEmail(item.getEmail());
        }
        table.setUpdateAt(DateUtil.currentTime());
        userMapper.updateUser(table);
    }
}
