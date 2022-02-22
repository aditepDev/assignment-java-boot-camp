package com.demo.shop.user.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberId;
    private String memberName;
    private String memberAddress;
    private String memberTel;
}
