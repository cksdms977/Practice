package com.bs.run;

import com.bs.mod.vo.*;


//	회원정보를 저장하는 클래스를 만들고 
//3명의 회원을 등록하고 그 정보를 출력해보자
//기본생성자로 생성하고 setter/getter를 이용해서
//값을 넣고 출력해보자
//멤버변수 : 아이디, 패스워드, 이름, 나이, 이메일
//* 데이터는 아무거나 넣기
//
//게시글을 저장할 수 있는 클래스를 만들고 
//2개의 게시글을 저장하고 출력해보자.
//매개변수있는 생성자로 생성하고 get을 이용해서 
//출력하자

public class MemberMain {
	public static void main(String[] args) {
		
		Member mm = new Member();
		
		Member members[] = new Member[3];
		
		members[0] = new Member("cksdms", "1234", "김dd", 19, "gmail");
		members[1] = new Member("dfdff", "1455", "오dd", 29, "naver");
		members[2] = new Member("cksm", "35235", "sajdfkdsa", 32, "askdjf");
		
		for (Member member : members) {
			System.out.println(member.getId() + " " + member.getPassword() + " " + member.getName() + " " + member.getAge() + " " + member.getEmail());
		}
		
		String result = mm.member("메뉴", "게시글");
		System.out.println(result);
		
	}
}
