package com.henry.repository.course;

import com.henry.model.user.ListInput;
import com.henry.model.user.Output;

import java.util.List;

public interface Repository {
    List<Output> list(ListInput input);
}
