package com.demo.shop.member.service;

import com.demo.shop.member.constant.MemberMork;
import com.demo.shop.member.model.Member;
import com.demo.shop.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;


    public Member memberMork(){
        return  memberRepository.findById(MemberMork.MEMBER_MORK_BUYER.getId()).get();
    }

    public Member saveMembe(Member member){
        return memberRepository.save(member);
    }
}
