package com.array.controller;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.FontUIResource;

public class ArrayController {
	public void basicArray() {
		// 기본배열 활용하기
		// 배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용을 한다.
		// 배열의 저장구조는 선형구조임.
		// 저장 순서가 있고, 저장소를 지칭하는 번호(인덱스)를 가진다.
		// 배열 선언하기
		// 배열 자료형 => 기본자료형[]  
		int [] intArr; // 배열을 저장할수 있는 변수를 선언
		// intArr = 10; 쓸수없다
		// 원하는 크기 만큼의 배열을 생성해서 할당을 해야한다.
		// 배열을 생성하기 -> new 연산자를 이용해서 생성
		// new 자료형[원하는 갯수(길이)를 입력한다]
		intArr = new int[3];
		// 기본으로 생성했을때 각 저장소는 자료형의 기본값으로 초기화된다.
		// 정수형(byte, short, int, long) : 0
		// 실수형(float, double) : 0.0
		// 문자열(String) : null
		// 문자(char) : ' '
		// 배열생성 후 각 저장공간활용하려면
		// 인덱스 번호로 각 저장공간을 불러올수 있다.
		// 인덱스번호는 선언한 길이에 -1한 번호까지
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		// 초과한 인덱스번호를 호출하면???
		//System.out.println(intArr[3]); 잘못접근한 index초과 그래서 접근하려면 위의 intArr = new int[3] ->[4]로 길이를 늘려준다.
		//배결에 값 저장하기
		intArr[0] = 1;		
		intArr[1] = 200;
		intArr[2] = -5;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		// 친구이름 저장하기
		// 친구 3명의 이름을 저장하는 배열을 만들고 
		// 자신의 스터디원을 저장 후 출력하기
//		String [] name;
//		name = new String[4];
		String name[]  = new String[4];
		
		name[0] = "홍길동";
		name[1] = "강백호";
		name[2] = "고길동";
		name[3] = "고융영";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		// for문과 같이 배열 이용하기
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		//for문을 이용해서 이름 출력하기
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
		}
		// 배열에서 저장소의 길이를 제공하는 변수가 있음.
		// 배열변수명.length;
		System.out.println(intArr.length);
		System.out.println(name.length);
	
		System.out.println("----------------------");
		// 반복문을 이용해서 배열을 초기화 
		// int 형 배열 10개를 할당하고 각 저장공간에 1~10까지 수를 대입하기
		
		int su[] = new int[10];
		
		for (int i = 0; i < su.length; i++) {
			su[i] = i + 1; // i +1 , i++이랑 다르다
			
		}
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
		System.out.println("-------------------------");
		// 학생 5명의 키를 입력받아 저장하는 기능 구현하기
		// 저장 후 출력하기
		Scanner sc = new Scanner(System.in);
//		
		
//		double height[] = new double[5];
//		
//		for (int i = 0; i < height.length; i++) {
//					System.out.print("학생키 입력 : ");
//					height[i] = sc.nextDouble();
//		}
//		for (int i = 0; i < height.length; i++) {
//			System.out.println(i + "학생키 : " + height[i]);
//		}
		
		System.out.println("--------------------------------");
		// 배열 선언시에 대입할 값이 정해져 있다면
		// 배열 선언과 동시에 값을 초기화할 수 있다.
//		char alpha[] = {'a', 'b', 'c', 'd', 'e'};
//		for (int i = 0; i < alpha.length; i++) {
//			System.out.println(i + " " + alpha[i]);
//		}
//		
//		char alpha2[] = new char[] {'A', 'B', 'C', 'D', 'E'};
//		for (int j = 0; j < alpha.length; j++) {
//			System.out.println(j + " " + alpha2[j]);
//		}
//		alpha = {'가', '나', '다','라'} 이렇게 하면 안됨 초기화 안됨.
//		alpha = new char[] {'가', '나', '다', '라'};
		

		// 배열은 한번선언된 길이는 변경되지 않는다
//		String names2[] = new String[3];
//		names2[0] = "유병승";
//		names2[1] = "홍길동";
//		names2[2] = "피카츄";
//		names2[3] = "리자몽"; // 자동으로 추가해도 증가하지 않음
	//		names2 = new String[4]; // 이렇게 다시 선언해줘도 앞에것들이 다 초기화 되고 다시 입력해야됨.
		
		// 배열은 저장된 데이터를 전체 순회해서 원하는 데이터를 찾을수 있음.
		int number2[] = {10, 20, 30, 40, 50, 60};
		int count = 0;
		// 30이상인 값의 갯수를 구하는 기능
			for (int i = 0; i < number2.length; i++) {
				if (number2[i] >= 30) {
					count++;
				}
			}
			System.out.println(count);
		
	
			// 저장된 학생이름 중 김씨 학생의 수를 구하는 기능
			// 버전업 사용자가 요청한 성씨를 학생수를 구하는 기능
			String studentName[] = {"김현엉", "김찬은", "김중근", "김재훈", "김예린", "강민기", "윤지환"
					, "윤준호", "윤나라", "나빈", "이성진", "이동제", "이다영", "조윤진", "정상준", "이은지"};
			

			int count2 = 0;
			for (int i = 0; i < studentName.length; i++) {
				if (studentName[i].charAt(0) == '김') {
					count2++;
				}
			}
			System.out.println("김씨성 가진 학생 수 : " + count2);
	
			System.out.println("학생이름 입력 : ");
			String name3 = sc.next();
			int count3 = 0;
			for (int i = 0; i < studentName.length; i++) {
				if (studentName[i].charAt(0) == '김') {
					count3++;
				}
			}
			
			
			// 정수 10개를 램덤으로 저장하는 기능 만들기.
			// 1~100수를 랜덤하게 저장
			
			int Su[] = new int[10];
		
			for (int i = 0; i < Su.length; i++) {
				Su[i] = (int) (Math.random()*100) + 1;
				
			}
			for (int i = 0; i < Su.length; i++) {
				System.out.print(Su[i] + " ");
			}
			System.out.println();
			
			// 위식에서 최대값, 최소값을 찾아내기!!
			int maxNum = Su[0];
			int minNum = Su[0];
			for (int i = 0; i < Su.length; i++) {
				if (Su[i] > maxNum) {
					maxNum = Su[i];
				}
			}
			System.out.println("최대값 : " + maxNum);
			
			for (int i = 0; i < Su.length; i++) {
				if (Su[i] < minNum) {
					minNum = Su[i]; 
				
				}
			}
			System.out.println("최소값 : " + minNum);
			
			// 배열은 선형구조로 순서가 있음 
			// 순서는 인덱스번호를 기준으로 순서를 정함
			// 값을 정렬할수 있다.
			// 배열의 저장값 위치변경하기 -> swrap
			
			int testArr [] = {4, 3, 6, 2, 7, 5, 1};
			for (int i = 0; i < testArr.length; i++) {
				System.out.print(testArr[i] + " ");
				
			}
			int temp = testArr[0];
			testArr[0] = testArr[1];
			testArr[1] = temp;
			for (int i = 0; i < testArr.length; i++) {
				System.out.print(testArr[i] + " ");
		
			}
			
			for (int i = 0; i < testArr.length; i++) {// 정력할때
				for (int j = 0; j < i; j++) {
					if (testArr[i] < testArr[j] ) {// 뒤에 있는값이 앞에 있는 값보다 작을때
						int t = testArr[i];
						testArr[i] = testArr[j];
						testArr[j] = t;
						
					}
				}
				
			}
			System.out.println();
			for (int j = 0; j < testArr.length; j++) {
				System.out.print(testArr[j] + " ");
			}
			
			
			
	}
	public void arrayCopyTest(){
		// 배열의 단점은 길이를 정하면 고정되어 있음 
		// 그래서 (배열복사)를 해야함 
		// 얕은 복사 : 원본값을 공유하는 방식
		// 깊은 복사 : 별도의 저장공간을 생성해서 데이터를 따로 관리하는 방식
		int num[] = {1, 2, 3, 4, 5};
		// 얕은 복사 -> 주소를 복사해줌. 
		
		int copynum[] = num;
		System.out.println(num);
		System.out.println("num " + Arrays.toString(num));
		System.out.println("copynum " + Arrays.toString(copynum));
		System.out.println("num[0] : " + num[0]);
		System.out.println("compynum[0] : " + copynum[0]);
//		주소값을 공유하기 때문에 저장소가 한개!
		num[0] = 100;
		System.out.println("num[0] : " + num[0]);
		System.out.println("copynum[0] : " + copynum[0]);
		
		//깊은 복사 -> 값 그 자체를 복사해서 새로운 저장소에 저장
		int deepcopy[] = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			deepcopy[i] = num[i];
		}
	System.out.println("num : " + Arrays.toString(num));
	System.out.println("deepcopy " + Arrays.toString(deepcopy));
	num[0] = 200;
	System.out.println("num : " + Arrays.toString(num));
	System.out.println("deepcopy " + Arrays.toString(deepcopy));
	
	// 자바에서 제공하는 기능을 이용해서 깊은복사하기
	// Arrays클래스에서 제공하는 copyof()기능이용하기
	int deepcopy2[] = Arrays.copyOf(num, num.length);
 	System.out.println("copy2 " + Arrays.toString(deepcopy2));
	deepcopy2[0] = -100;
//	System.out.println("num : " + Arrays.toString(num));
//	System.out.println("deepcopy2 " + Arrays.toString(deepcopy2));
	
	
	// 배열전체를 깊은복사할때는 clone()이용해도 된다.
	deepcopy2 = num.clone();
	System.out.println("deepcopy2 : " + Arrays.toString(deepcopy2));
	
	// System.arraycopy() 이용하기
	// 첫번째 : 원본배열
	// 두번째 : 원본배열의 시작인덱스
	// 세번째 : 복사될 배열
	// 네번째 : 복사될배열의 시작인덱스
	// 다섯번째 : 복사할 데이터 수 (길이)
	String names[] = {"유병승", "홍길동", "김유신"};

	String extend[] = new String[names.length + 5];
	
	System.arraycopy(names, 0, extend, 3, names.length);
	
	for (int i = 0; i < extend.length; i++) {
		System.out.print(extend[i] + " ");
		
	}
	System.out.println();
	
	}
	
	public void doubleArray() {
		// 2차원배열에 대해 알아보자
		// 배열저장소 두개가 연결되어있는 구조
		// 저장소는 바둑판처럼 저장구조를 가지고 있음
		int intArr[][];
		intArr = new int[3][3];
		System.out.println(intArr);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[0][0]);
		System.out.println(intArr[0][1]);
		System.out.println(intArr[0][2]);
		System.out.println(intArr[1][0]);
		
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j]);
		
			}		
			System.out.println();		
		}
//		intArr[0][0] = 1;
//		intArr[0][1] = 2;
//		intArr[0][2] = 3;
//		intArr[1][0] = 4;
//		intArr[1][1] = 5;
//		intArr[1][2] = 6;
//		intArr[2][0] = 7;
//		intArr[2][1] = 8;
//		intArr[2][2] = 9;
//		
//		for (int i = 0; i < intArr.length; i++) {
//			for (int j = 0; j < intArr[i].length; j++) {
//				System.out.print(intArr[i][j]);
//			}
//			System.out.println();
//		}
//		
		// 3*3 2차원 배열을 생성하고 // 1*1, 1*2, 1*3, 2*1, 2*2, 2*3, 3*1, 3*2, 3*3;
		// 123
		// 123
		// 123 을 각 인덱스에 저장하고 출력하기
		
		int su[][] = new int[3][3];
		
		for (int i = 0; i < su.length; i++) {
			
			for (int j = 0; j < su[i].length; j++) {
				
				su[i][j] = j+1;
			}
		
		}
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.print(su[i][j]);
				
			}
			System.out.println();
		}
		
		int numbers[][] = new int[3][4];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = ++count ;
				
				
			} 
			
			
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%-2d", numbers[i][j]);
			}
			System.out.println();
		}
		
	
		// 2차원배열의 선언과 동시에 초기화
		String study[][] = {
				{"김찬은"}, {"홍성현"}, {"나빈"}, {"이성진"}, 
				{"김재훈", "이다영", "조장흠"}, 
				{"김예린", "윤나라", "최인호", "최주영", "이동제"}, 
				{"강민기", "윤지환", "최솔"}, 
				{"조윤진", "정상준", "최하리", "이은지"}
				};// 선언함 동시에 선언
		
		// 최주영의 조를 찾고 인원수 출력
		// 최솔씨의 조를 찾고 인원수 출력
		// 나빈씨의 조를 찾고 인원수 출력
		
		int count1 = 0;
		for (int i = 0; i < study.length; i++) {
			for (int j = 0; j < study[i].length; j++) {
				System.out.print(study[i][j] + " ");
			}
				
			
			
			}
			System.out.println();
			Scanner sc = new Scanner(System.in);
			
			// 최주영의 조를 찾고 인원수 출력
			// 최솔씨의 조를 찾고 인원수 출력
			// 나빈씨의 조를 찾고 인원수 출력
			System.out.print("찾을 팀원 : ");
			String searchName = sc.next();
			String msg = "없는 조원입니다.";
			
			for (int i = 0; i < study.length; i++) {
				for (int j = 0; j < study[i].length; j++) {
					if (study[i][j].equals(searchName)) {
						//System.out.println((i + 1) + "조 인원수 : " + study[i].length);
						msg = (i + 1) + "조 인원수 : " + study[i].length;
						
						
						break;
					}
					
				}
			}
			System.out.println(msg);
		}
			
		public void extraTest() {
			int intArr[] = {1, 2, 3, 4, 5, 6};
			// 기본 for문을 입력했을 각 인덱스에 접근함.
			for (int i = 0; i < intArr.length; i++) {
				System.out.println(intArr);
			}
			// for each문을 이용해서 데이터 순회하기
			// for(자료형 변수명 : 배열명 || CollectionFramework) { }
			System.out.println("forEach문을 이용해서 출력하기");
			for (int i : intArr) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			// 대신에 foreach문을 사용할때 배열에 있는 값을 수정할때는 사용할 수 없다.
			String[] hobby = {"농구", "자전거", "게임", "코딩"};
			for(String h : hobby) {
				if (h.equals("코딩")) {
					System.out.println(h);
				}
			}
			
			
			}
			// 배열의 저장하는 중복값 없이 저장하기
			// 임의의 정수 10 개 저장하기
			// 1~10
				int[] su = new int[10];
						
				for (int i = 0; i < su.length; i++) {
					su[i] = (int) (Math.random()*10) +1;
				                
					
					
					
				}
					for (int i : su) {
						System.out.print(i + " ");
					
					}
					System.out.println();
					
					
					
					// 로또 만들기!!!
					// 1~45번호를 충복값없이 6자리 저장
					int lotto[] = new int[6];
 					
					for (int i = 0; i < lotto.length; i++) {
						lotto[i] = (int)(Math.random()*45) +1;
						for (int j = 0; j < i; j++) {
							if (lotto[i] == lotto[j]) {
								i--;
							}
							
						}
						
					}
					for (int i : lotto) {
						System.out.print(i + " ");
					}
					System.out.println();
					
					}
				
				
				
				
				
				
		}
		
		
	
	
	
	
	

	

	
	
	

	
	
	
	
			
