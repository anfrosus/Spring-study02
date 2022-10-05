package com.example.spring_hw.service;

import com.example.spring_hw.dto.BoardDto;
import com.example.spring_hw.dto.BoardResponseDto;
import com.example.spring_hw.dto.OneResponseDto;
import com.example.spring_hw.dto.PasswordDto;
import com.example.spring_hw.entity.BoardEntity;
import com.example.spring_hw.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public BoardResponseDto findAll() {
        BoardResponseDto boardResponseDto = new BoardResponseDto(boardRepository.findByOrderByCreateAtDesc());
        return boardResponseDto;
    }

    @Transactional
    public OneResponseDto findById(Long id) {
        OneResponseDto oneResponseDto = new OneResponseDto(boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다.")
        ));
        return oneResponseDto;
    }

    @Transactional
    public Long save(BoardDto boardDto) {
        return boardRepository.save(new BoardEntity(boardDto)).getId();
    }

    @Transactional
    public Long update(Long id, BoardDto boardDto) {
        BoardEntity board1 = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));
        board1.update(boardDto);
        return board1.getId();
    }

    @Transactional
    public boolean check(Long id, BoardDto boardDto) {
        BoardEntity board1 = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글 존재하지 않습니다."));
        return boardDto.getPassword() == board1.getPassword() ? true : false;
    }


    @Transactional
    public Long deleteById(Long id) {
        boardRepository.deleteById(id);
        return id;
    }


}
