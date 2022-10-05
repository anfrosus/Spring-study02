package com.example.spring_hw.dto;

import com.example.spring_hw.entity.BoardEntity;
import lombok.Getter;

import java.util.List;

@Getter
public class BoardResponseDto {
    private boolean success;
    private List<BoardEntity> boardEntityList;
    private Long error;

    public BoardResponseDto(List<BoardEntity> boardEntityList) {
        this.success = true;
        this.boardEntityList = boardEntityList;
        this.error = ((boardEntityList.size() > 0) ? boardEntityList.get(0).getId() : "") != null ? null : 99L;
    }
}
