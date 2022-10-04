package com.example.spring_hw.dto;

import com.example.spring_hw.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Component
public class OneResponseDto {


    private boolean success;
    private BoardEntity boardEntity;
    private Long error;

    public void setBoardEntity(BoardEntity boardEntity) {
        this.boardEntity = boardEntity;
        this.success = true;
    }

    public OneResponseDto(BoardEntity boardEntity) {
        this.success = true;
        this.boardEntity = boardEntity;
        this.error = boardEntity.getId() != null ? null : 90L;
    }


}
