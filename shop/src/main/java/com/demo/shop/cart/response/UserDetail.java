package com.demo.shop.cart.response;

import com.demo.shop.member.model.Member;
import lombok.Data;

@Data
public class UserDetail{
	private String userTel;
	private String userName;
	private String userAddress;

	public static UserDetail packUserDetail(Member member){
		UserDetail userDetail = new UserDetail();
		userDetail.setUserName(member.getMemberName());
		userDetail.setUserAddress(member.getMemberAddress());
		userDetail.setUserTel(member.getMemberTel());
		return userDetail;
	}
}