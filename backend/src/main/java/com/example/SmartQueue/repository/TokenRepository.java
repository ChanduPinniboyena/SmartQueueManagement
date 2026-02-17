package com.example.SmartQueue.repository;

import com.example.SmartQueue.enums.TokenStatus;
import com.example.SmartQueue.model.Token;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    List<Token> findByUserIdAndStatus(Long userId, TokenStatus status);

    List<Token> findByServiceCounterIdAndStatus(Long counterId, TokenStatus status);

    int countByServiceCounterIdAndStatus(Long counterId, TokenStatus status);

    List<Token> findByServiceCounterIdAndStatusOrderByPriorityDescIssuedAtAsc(Long counterId, TokenStatus status);

    Optional<Token> findFirstByServiceCounterIdAndStatusOrderByPriorityDescIssuedAtAsc(Long counterId,
            TokenStatus status);

}
