package com.example.spring_hw.dto;

import com.example.spring_hw.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class BoardResponseDto {
    private boolean success;
    private List<BoardEntity> boardEntity;
    private Long error;

    @Autowired
    public BoardResponseDto(List<BoardEntity> boardEntity) {
        this.success = true;
        this.boardEntity = boardEntity;
        this.error = ((boardEntity.size() > 0) ? boardEntity.get(0).getId() : "") != null ? null : 99L;
    }
}
