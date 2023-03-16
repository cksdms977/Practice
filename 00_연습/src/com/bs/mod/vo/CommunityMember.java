package com.bs.mod.vo;

public class CommunityMember {
	
//	1. 우리는 커뮤니티사이트를 만들기 위해
//	회원가입을 받으려고한다. 회원에 대한
//	정보를 저장할 객체를 만드세요!
//	 아이디, 비밀번호, 이메일, 나이, 취미의 정보가 
//	필요하다
//	admin 1234 admin@admin.com 55 운동,코딩
//	user01 1111 user01@user01.com 33 코딩
//	생성 후 출력하기
	
	private String id;
	private String password;
	private String emaile;
	private int age;
	private String hobby;
	
public CommunityMember() {}
	

//커뮤니티사이트에서 게시판을 운영
//할예정이다 게시판 정보를 받을 객체를
//생성하세요!
//게시판에는 제목, 글쓴이, 내용, 날짜가 
//들어가야한다.
//첫번째 글 나야나 첫번째 글쓰다 23/03/10
//두번째 글 너야나 두번째 글쓰다 23/03/20
//생성 후 출력하기
public String msgboard(String title, String writer, String content, String date) {
	return title + writer + content + date;
	
}


	
	public CommunityMember(String id, String password, String emaile, int age, String hobby) {
		this.id = id;
		this.password = password;
		this.emaile = emaile;
		this.age = age;
		this.hobby = hobby;
		
	
	}
	
	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmaile() {
		return emaile;
	}


	public void setEmaile(String emaile) {
		this.emaile = emaile;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public String infoCommunityMember() {
		return this.id + " " + this.password + " " + this.emaile + " " + this.hobby;
		
		
	}


	
	
	
	
	
	
	
}
