package com.example.spring_hw.controller;

import com.example.spring_hw.dto.BoardDto;
import com.example.spring_hw.dto.BoardResponseDto;
import com.example.spring_hw.dto.OneResponseDto;
import com.example.spring_hw.dto.PasswordDto;
import com.example.spring_hw.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/api/boards")
    public BoardResponseDto viewAll() {
        return boardService.findAll();
    }

    @GetMapping("/api/boards/{id}")
    public OneResponseDto viewOne(@PathVariable Long id) {
        return boardService.findById(id);
    }

    @PostMapping("/api/boards")
    public Long create(@RequestBody BoardDto boardDto) {
        return boardService.save(boardDto);
    }

    @PutMapping("/api/boards/{id}")
    public Long update(@PathVariable Long id, @RequestBody BoardDto boardDto) {
        return boardService.update(id, boardDto);
    }

    @PostMapping("/api/boards/{id}")
    public PasswordDto check2(@PathVariable Long id, @RequestBody BoardDto boardDto) {
        return new PasswordDto(boardService.check(id, boardDto));
    }

//    @PostMapping("/api/boards/{id}")
//    public boolean check(@PathVariable Long id, @RequestBody BoardDto boardDto) {
//        return boardService.check(id, boardDto);
//    }

    @DeleteMapping("/api/boards/{id}")
    public Long deleteOne(@PathVariable Long id) {
        return boardService.deleteById(id);
    }

}
