package com.bs.run;

import com.bs.mod.vo.*;

public class CommunityMemberMain {
	public static void main(String[] args) {
		
		CommunityMember communitymember[] = new CommunityMember[2];	
		
		communitymember[0] = new CommunityMember("admin", "1224", "admin@admin.com", 55, "운동");
		communitymember[1] = new CommunityMember("user01", "1111", "user01@user01.com", 33, "운동");
		
		for (CommunityMember communityMember2 : communitymember) {
			System.out.println(communityMember2.infoCommunityMember());
		}
		
		CommunityMember board = new CommunityMember();
		
		String result = board.msgboard("첫번째 글", "나야나", "첫번째 글쓰다", "23/03/10");
		System.out.println(result);
		
		String result2 = board.msgboard("두번째 글", "너야나", "두번째 글쓰다.", "23/03/20");
		System.out.println(result2);
	}
	
	
	
}
