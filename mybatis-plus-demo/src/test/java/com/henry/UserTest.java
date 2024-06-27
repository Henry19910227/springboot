package com.henry;

import com.henry.mapper.UserMapper;
import com.henry.model.user.Output;
import com.henry.utils.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test_selectList() {
//        List<Users> tables = userMapper.selectList(null);
//        System.out.println(tables);
    }

    @Test
    public void test_insert() {
//        Users user = new Users();
//        user.setNickname("Gina");
//        user.setEmail("Gina@gmail.com");
//        user.setCreateAt(DateUtil.currentTime());
//        user.setUpdateAt(DateUtil.currentTime());
//        int row = userMapper.insert(user);
//        System.out.println(row);
    }

    @Test
    public void test_find() {
        Output user = userMapper.find(1, null, null);
        System.out.println(user);
    }
}
