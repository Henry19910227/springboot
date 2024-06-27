package com.henry.repository.user.implement;

import com.henry.mapper.UserMapper;
import com.henry.model.user.FindInput;
import com.henry.model.user.ListInput;
import com.henry.model.user.Output;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository implements com.henry.repository.user.Repository {

    private final UserMapper userMapper;

    @Autowired
    public Repository(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Output find(FindInput input) {
        return userMapper.find(input);
    }

    @Override
    public List<Output> list(ListInput input) {

        return userMapper.list(input);
    }
}
