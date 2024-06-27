package com.henry.model.user;

import lombok.Data;

import java.util.List;


@Data
public class ListInput {
    public Integer id;
    public List<Integer> ids;
    public String nickname;
    public String email;
}
