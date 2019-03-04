package com.example.boardproject.repository;

import com.example.boardproject.domain.Board;
import com.example.boardproject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long> {

    Board findByUser(User user);
}
