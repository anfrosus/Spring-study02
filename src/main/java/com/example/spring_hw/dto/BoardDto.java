package com.example.spring_hw.dto;

import com.example.spring_hw.entity.BoardEntity;
import lombok.Getter;

@Getter
public class BoardDto {

    private String title;

    private String content;

    private String author;

    private int password;

}
