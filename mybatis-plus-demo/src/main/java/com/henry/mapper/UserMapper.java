package com.henry.mapper;


import com.henry.model.user.Output;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    Output find(@Param("id") Integer id,
                @Param("nickname") String nickname,
                @Param("email") String email);
}
