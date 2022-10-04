package com.example.spring_hw.repository;

import com.example.spring_hw.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findByOrderByCreateAtDesc();
}
