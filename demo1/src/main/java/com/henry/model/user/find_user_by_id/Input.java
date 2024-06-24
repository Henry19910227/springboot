package com.henry.model.user.find_user_by_id;

import jakarta.annotation.Nullable;
import lombok.Data;

@Data
public class Input {
    private int id;
    private String nickname;
    private String email;
}
