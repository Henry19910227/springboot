package com.henry.repository.user;

import com.henry.model.user.FindInput;
import com.henry.model.user.ListInput;
import com.henry.model.user.Output;

import java.util.List;

public interface Repository {
    Output find(FindInput input);
    List<Output> list(ListInput input);
}
