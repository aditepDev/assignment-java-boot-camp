package com.demo.shop.user.repository;

import com.demo.shop.user.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
