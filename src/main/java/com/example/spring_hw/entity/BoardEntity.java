package com.example.spring_hw.entity;

import com.example.spring_hw.dto.BoardDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor      //아마도 TimeStamped 가 기본생성자를 가지고 있기 때문에 필요한듯.
public class BoardEntity extends TimeStamped{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String author;

    @JsonIgnore
    @Column(nullable = false)
    private int password;

    public BoardEntity (BoardDto boardDto) {
        this.author = boardDto.getAuthor();
        this.content = boardDto.getContent();
        this.password = boardDto.getPassword();
        this.title = boardDto.getTitle();
    }

    public void update(BoardDto boardDto) {
        this.author = boardDto.getAuthor();
        this.content = boardDto.getContent();
        this.password = boardDto.getPassword();
        this.title = boardDto.getTitle();
    }
}
