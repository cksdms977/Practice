package com.bs.practice.chap02.loop;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
		public void rockpaperscissors() {
//			1. 가위바위보게임
//			 설명 
//			 - 사용자에게 가위, 바위, 보 중 한개를 입력하도록하고(입력방식은 숫자)
//			 - 컴퓨터가 랜덤값으로 세개중 하나의 데이터를 대입
//			 - 컴퓨터의 값과 사용자의 값을 비교하여 다음의 결과출력
//			   같으면 비겼습니다. 출력 후 다시 사용자와 컴퓨터가 선택할 수 있도록 로직구성
//			   컴퓨터가 사용자에게 이기면 컴퓨터가 이겼습니다. 출력
//			   사용자가 컴퓨터에게 이기면 사용자가 있겼습니다. 출력   
		//
//			-  승자가 나왔으면 다시 하겠습니다 출력 
//			    다시하면 위에 로직 다시 실행
//			    종료하면 프로그램 종료
//			- 추가 : 만일 위내용을 쉽게 처리 했으면 프로그램 종료시 지금까지 전적을 출력
//			       컴퓨터 승 00번, 사용자 승 00번
			
			Scanner sc = new Scanner(System.in);
			
			
			boolean flag = true;
			int comwin = 0;
			int userwin = 0;
			
			
			while (flag) {
				System.out.println("1. 가위, 2. 바위, 3. 보, 4. 프로그램 종료 : ");
				int user = sc.nextInt();
				
				int computer = (int)Math.random()*3+1;
				for (int i = 1; i <= computer; i++) {
					
				if (user == computer) {
					System.out.println("비겼습니다.");flag = false;
				}else if (user > computer) {
					System.out.println("사용자가 이겼습니다. 다시하겠습니다."); 
					userwin++ ;
				}else if (user < computer) {
					System.out.println("컴퓨터가 이겼습니다. 다시하겠습니다.");
					comwin++;
				}
				
				}
			} System.out.println("프로그램 종료"); System.out.println("컴퓨터 승 " + userwin + "사용자 승 " + comwin ); 
			
//				switch (user) { //가위 일때
//				case 1 : switch (aicom) { case 1 : System.out.println("aicom : 1. 가위");
//												   System.out.println("user : 1. 가위");
//												   System.out.println("비김");
//												   same++;
//												   break;
//										  case 2 : System.out.println("aicom : 2. 바위");		   
//										  		   System.out.println("user : 1. 가위");		   
//										  		   lose++;
//										  		   break;
//										  case 3 : System.out.println("aicom : 3. 보");
//										  		   System.out.println("user : 1. 가위");
//										  		   win++;
//										  		   break;
//				 
//				} break;
//				
//				// 바위일때
//				case 2 :  switch (aicom) { case 1 : System.out.println("aicom : 1. 가위");
//				   									System.out.println("user : 2. 바위");
//				   									System.out.println("이김");
//				   									win++;
//				   									break;
//											case 2 : System.out.println("aicom : 2. 바위");		   
//													 System.out.println("user : 2. 바위");		   
//													 same++;
//													 break;
//											case 3 : System.out.println("aicom : 3. 보");
//													 System.out.println("user : 2. 바위");
//													 lose++;
//													 break;
//				
//				} break;
//				
//				// 보일때
//				case 3 :  switch (aicom) { case 1 : System.out.println("aicom : 1. 가위");
//													System.out.println("user : 3. 보");
//													System.out.println("이김");
//													lose++;
//													break;
//										   case 2 : System.out.println("aicom : 2. 바위");		   
//										   			System.out.println("user : 3. 보");		   
//										   			win++;
//										   			break;
//										   case 3 : System.out.println("aicom : 3. 보");
//										   	        System.out.println("user : 3. 보");
//										   	        same++;
//										   	        break;
//			
//			} break;
//			
//			default : System.out.println("프로그램 종료");
//					  System.out.println(win);
//			
//			
//			}
		
}
		
		
		
}
				
			
			
			
			
			
			
			
		
	
	


