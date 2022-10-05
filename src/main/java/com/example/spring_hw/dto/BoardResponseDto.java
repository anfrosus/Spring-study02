package com.example.spring_hw.dto;

import com.example.spring_hw.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Component
public class BoardResponseDto {
    private boolean success;
    private List<BoardEntity> boardEntityList;
    private Long error;

    @Autowired
    public BoardResponseDto(List<BoardEntity> boardEntityList) {
        this.success = true;
        this.boardEntityList = boardEntityList;
        this.error = ((boardEntityList.size() > 0) ? boardEntityList.get(0).getId() : "") != null ? null : 99L;
    }
}
