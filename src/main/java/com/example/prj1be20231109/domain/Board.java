package com.example.prj1be20231109.domain;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Data
public class Board {
    private String title;
    private String content;
    private String writer;

}
