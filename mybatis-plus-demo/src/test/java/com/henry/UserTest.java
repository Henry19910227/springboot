package com.henry;

import com.henry.model.user.FindInput;
import com.henry.model.user.ListInput;
import com.henry.model.user.Output;
import com.henry.repository.user.Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class UserTest {
    @Autowired
    private Repository userRepo;
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
        FindInput input = new FindInput();
        input.id = 1;
        Output user = userRepo.find(input);
        System.out.println(user);
    }

    @Test
    public void test_list() {
        ListInput input = new ListInput();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        input.ids = ids;
        List<Output> users = userRepo.list(input);
        System.out.println(users);
    }
}
