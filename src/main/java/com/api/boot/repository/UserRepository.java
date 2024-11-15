package com.api.boot.repository;

import com.api.boot.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities")    // 쿼리 수행시 Eager조회 > authorities 정보도 함께 가져옴
    Optional<User> findOneWithAuthoritiesByUsername(String username);   // 권한정보도 가져오는 메소드
}
