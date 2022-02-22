package com.demo.shop.user.repository;

import com.demo.shop.user.model.MemberWallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberWalletRepository extends JpaRepository<MemberWallet,Long> {
}
