package com.example.spring_hw.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PasswordDto {

    private boolean success;

    private boolean data;

    private Long error;

    public PasswordDto(boolean data) {
        this.success = true;
        this.data = data;
        this.error = null;
    }
}
