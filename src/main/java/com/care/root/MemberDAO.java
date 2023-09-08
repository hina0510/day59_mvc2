package com.care.root;

import org.springframework.stereotype.Repository;

@Repository("d123")
public class MemberDAO {	
	public MemberDAO() {
		System.out.println("dao");
	}
	public void test() {
		System.out.println("dao test ¿¬µ¿");
	}
	public MemberDTO result() {
		MemberDTO dto = new MemberDTO();
		dto.setId("aaa");
		dto.setName("È«±æµ¿");
		return dto;
	}
}
