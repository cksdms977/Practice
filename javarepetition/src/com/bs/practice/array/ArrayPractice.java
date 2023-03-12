package com.bs.practice.array;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayPractice {
	public void practice1(){
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
		//순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
			System.out.print(number[i] + " ");
			
		}
	}
	
	public void practice2() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int number[] = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = 10 - i;
			
		}
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
	}
	
	public void practice3() {
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int su = sc.nextInt();
		
		int su2[] = new int[su];
		
		for (int i = 0; i < su2.length; i++) {
			su2[i] = i + 1;
			
		}
		for (int i = 0; i < su2.length; i++) {
			System.out.print(su2[i] + " ");
		
		}
		
	}
	
	public void practice4() {
		//길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후 
		//배열 인덱스를 활용해서 귤을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		String fruit[] = {"사과", "귤", "포도", "복숭아", "참외"}; 
			
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 
		//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char strArray[] = new char[str.length()];
		
		int count = 0;
		String indexsu = "";
		
		for (int i = 0; i < str.length(); i++) {
				strArray[i] =  str.charAt(i);
		}
		
		
		for (int i = 0; i < str.length(); i++) {
			if (strArray[i] == ch) {
				indexsu += i + " "; 
				count++;
			} 
		}
		System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + indexsu);
		System.out.println(ch + "의 개수 : " + count);
		
		//int count = 0;
		//for (int i = 0; i < strArray.length; i++) {
			//if (ch == strArray[i]) {
				//System.out.println(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + i);
				//count++;
			//}
		//}
		//System.out.println(ch + "의 개수 : " + count);
	
		}
	
	public void practice6() {
		//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		String month[] = {"월", "화", "수", "목", "금", "토", "일" };
		
		System.out.print("0~6사이 숫자 : ");
		int number = sc.nextInt();
		
		if (number < 0 || number > 6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(month[number]);
		}
		
	}
		
	public void practice7() {
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요. 
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : "); 
		int su = sc.nextInt();
		
		int index[] = new int[su];
		
		int indexlist = 0;
		int sum = 0;
		for (int i = 0; i < index.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			index[i] = sc.nextInt();
			sum += index[i];
				
		}
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}
		System.out.println( "/n" + "총합 : " + sum);
		
	}

	public void practice8() {
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 
//		다시 정수를 받도록 하세요.
		Scanner sc = new Scanner(System.in);
	
//		int su;
//		int num = 1; // 1부터 1씩증가하는 오름차순 값
//		while (true) {
//			System.out.print("정수 : ");
//			su = sc.nextInt();
//			
//			if (su % 2 == 0 || su < 3) {
//				System.out.println("다시 입력하세요");
//			}break;
//			
//		
//		
//		   int oddnumber[] = new int[su];
//		
//			for (int i = 0; i < oddnumber.length; i++) {
//				if (i < oddnumber.length / 2 ) {
//					oddnumber[i] = num ++;
//					
//				}else {
//					oddnumber[i] = num --;;
//				
//				}
//				
//			}
//			
//			for (int i = 0; i < su ; i++) {
//				System.out.print(oddnumber[i] + " ");
//			}
//			
//			}
		int su = 0;
        while (su < 3 || su % 2 == 0) {
            System.out.print("정수 : ");
            su = sc.nextInt();
            if (su < 3 || su % 2 == 0) {
                System.out.println("다시 입력하세요.");
            }
        }

        int[] arr = new int[su];
        

        // 오름차순으로 채우기
        int num = 1;
        for (int i = 0; i <= su / 2; i++) {
            arr[i] = num;
            num += 1;
        }

        // 내림차순으로 채우기
        num = su;
        for (int i = (su / 2) + 1; i < su; i++) {
            arr[i] = num;
            num -= 1 ;
        }

        // 출력
        for (int i = 0; i < su; i++) {
            System.out.print(arr[i] + " ");
        }
    }
	public void practic9() {
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		Scanner sc = new Scanner(System.in);
		
		String chickenname[] = {"페리카나", "호식이두마리치킨", "BBQ", "BHC" , "처갓집" , "후라이드참잘하는집", "호치킨", "굽네치킨", "교쵼치킨"};
		
		System.out.print("치킨 이름을 입력하세요 : "); 
		String chicken = sc.nextLine();
		
		for (int i = 0; i < chickenname.length; i++) {
			if (chickenname[i].equals(chicken)) {
				System.out.println(chicken + " 배달 가능");break;
			}else {
				System.out.println(chicken + " 치킨은 없는 메뉴입니다.");break;
			}
		}
		
	}
	
	public void practice10() {
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 
//		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String number = sc.nextLine();
		
		char arr[] = new char[number.length()];		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = number.charAt(i);
			
			}
		char copy[] = new char[number.length()];
		
		for (int i = 0; i < copy.length; i++) {
			if (i <= 7) {
				copy[i] = arr[i];
			}else {
				copy[i] = '*';
			}
		System.out.print(copy[i]);	
		}
		
		
		}
	
	public void practice11() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int su[] = new int[10];
		
		
		for (int i = 0; i < su.length; i++) {
			su[i] = (int) (Math.random()*10) +1;
			
			System.out.print(su[i] + " ");
		}
		
	}
	
	public void practice12() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		
		int su[] = new int[10];
		
		for (int i = 0; i < su.length; i++) {
			su[i] = (int) (Math.random()*10) + 1;
			
			System.out.print(su[i] + " ");
			
		}
		System.out.println();
		
		int max = su[0];
		int min = su[0];
		for (int i = 1; i < su.length; i++) {
			if (su[i] > max) {
				max = su[i];
			}if (su[i] < min) {
				min = su[i];
			}
		
		}
		System.out.print("최대값 : " + max + " ");
		System.out.print("최소값 : " + min);
		
		
	}
	
	public void practice13() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		
		int su[] = new int[10];
		
		for (int i = 0; i < su.length; i++) {
			su[i] = (int) (Math.random()*10) + 1;
		
			for (int j = 0; j < i; j++) {
			
				if (su[j] == su[i]) {
					i--;
			}
		}
		
		}
		
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");
		}
		
		
	}
	
	public void practice14() {
//		로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		int lotoo[] = new int[6];
		
		for (int i = 0; i < lotoo.length; i++) {
			lotoo[i] = (int) (Math.random()*45) + 1;
		
			for (int j = 0; j < i; j++) {
				if (lotoo[j] == lotoo[i]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotoo);
		
		for (int i = 0; i < lotoo.length; i++) {
			System.out.print(lotoo[i] + " ");
		}
	
		}
	
	public void practice15() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 
//		문자의 개수와 함께 출력하세요.
//		예)
//		문자열 : application
//		문자열에 있는 문자 : a, p, l, i, c, t, o, n 
//		문자 개수 : 8
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char ch[] = new char[str.length()];
		
		System.out.print("문자열에 있는 문자 : ");
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
			count++;
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + ", ");
		}
		System.out.print("문자 개수 : " + count);
	}
	
	
	}
	
	
	
	
	
	
		
		
			
	
		
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	

	
	
	
