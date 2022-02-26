package com.demo.shop.purchase.model;

import com.demo.shop.member.model.Member;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long purchaseId;
    @ManyToOne
    @JoinColumn(name = "member_member_id")
    private Member member;
    private double total;
    private int qty;
    @Column(name="createdAt", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;
}
