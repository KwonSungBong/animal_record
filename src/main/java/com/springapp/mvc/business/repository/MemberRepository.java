package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByUsername(String username);
}
