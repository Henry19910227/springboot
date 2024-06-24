package com.henry.mapper;

import com.henry.model.User;
import com.henry.model.user.Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    List<User> findAll();

    Table findUser(Table item);
    void updateUser(Table item);

}
