package com.demo.shop.user.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "member_wallet")
public class MemberWallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberWalletId;
    private double wallet;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
