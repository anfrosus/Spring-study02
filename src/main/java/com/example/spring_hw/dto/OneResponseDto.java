package com.example.spring_hw.dto;

import com.example.spring_hw.entity.BoardEntity;
import lombok.Getter;

@Getter
public class OneResponseDto {

    private boolean success;
    private BoardEntity boardEntity;
    private Long error;

    public OneResponseDto(BoardEntity boardEntity) {
        this.success = true;
        this.boardEntity = boardEntity;
        this.error = boardEntity.getId() != null ? null : 90L;
    }


}
