package com.demo.shop.member.model;

import javax.persistence.*;

import com.demo.shop.item.model.ItemImage;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import java.util.List;

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

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberWallet> memberWallet;

}
