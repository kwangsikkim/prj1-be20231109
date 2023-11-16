package com.example.prj1be20231109.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Member {
    private String id;
    private String nickName;
    private String password;
    private String email;
    private LocalDateTime inserted;
    private List<Auth> auth;

    public boolean isAdmin() {
        if (auth != null) {
            auth.stream()
                    .map(a->a.getName())
                    .anyMatch(n->n.equals("admin"));
        }
        return false;

    }


}
