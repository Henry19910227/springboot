package com.henry.mapper;


import com.henry.model.user.FindInput;
import com.henry.model.user.ListInput;
import com.henry.model.user.Output;
import com.henry.model.user.Table;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    Output find(FindInput input);
    List<Output> list(ListInput input);
}
