package com.array.controller;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArrayController {
	public void basicArray() {
		//기본배열 활용하기
		//배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용을 한다.
		//배열의 저장구조는 선형구조임.
		//저장순서가 있고 저장소을 지칭하는 번호(인덱스)를 가진다.
		//배열 선언하기
		//배열 자료형-> 기본자료형[]
		int[] intArr;//배열을 저장할 수 있는 변수를 선언
		//intArr=10;안돼!!
		//원하는 크기만큼의 배열을 생성해서 할당을 해야한다.
		//배열생성하기 -> new연산자를 이용해서 생성!
		//new 자료형[원하는갯수(길이)]
		intArr=new int[3];
		//기본으로 생성했을때 각 저장소는 자료형의 기본값으로 초기화된다.
		//정수형(byte,short,int,long) : 0
		//실수형(float,double) : 0.0
		//문자열(String) : null
		//문자(char) : ' '
		
		//int a=0;
		//배열생성 후 각 저장공간활용하려면
		//인덱스번호로 각 저장공간을 불러올 수 있다.
		//인덱스번호는 선언한 길이에-1한 번호까지
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		//초과한 인덱스번호를 호출하면????? 에러가 발생함.
		//System.out.println(intArr[3]);
		//String a=100;
			
		//System.out.println(a);
		//배열에 값 저장하기
		intArr[0]=1;
		intArr[1]=200;
		intArr[2]=-5;
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		//친구이름 저장하기
		//친구 3명의 이름을 저장하는 배열을 만들고
		//자신의 스터디원을 저장 후 출력하기
		String[] names;
		names=new String[2];
		names[0]="김재훈";
		names[1]="외롭다..";
		//names[2]="인생은혼자지..은따인가...";
		System.out.println(names[0]);
		System.out.println(names[1]);
		//System.out.println(names[2]);
		names[0].length();
		names[0].charAt(0);
//		String name="유병승";
//		name.length();
		
		//for문과 같이 배열이용하기
		for(int i=0;i<3;i++) {
			System.out.println(intArr[i]);
		}
		//for문 이용해서 이름출력하기
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		//배열에서 저장소의 길이를 제공하는 변수가 있음.
		//배열변수명.length;
		System.out.println(intArr.length);
		System.out.println(names.length);
		
		
//		반복문을 이용해서 배열을 초기화
		//int형 배열 10개를 할당하고 각 저장공간에 1~10까지 수를 대입하기
		int[] numbers=new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=i+1;//i+1, i++
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//학생 5명의 키를 입력받아 저장하는 기능 구현하기
		//저장 후 출력하기
		//double h1,h2,h3,h4,h5;
		double[] heights=new double[3];
		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<heights.length;i++) {
//			System.out.print("학생 키 입력 : ");
//			heights[i]=sc.nextDouble();
//		}
//		for(int i=0;i<heights.length;i++) {
//			System.out.println(i+"학생 키 : "+heights[i]);
//		}
		
		
		//배열선언시에 대입할 값이 정해져있다면
		//배열선언과 동시에 값을 초기화할 수 있다.
		char[] alpha= {'a','b','c','d','e'};
		for(int i=0;i<alpha.length;i++) {
			System.out.println(i+" "+alpha[i]);
		}
		char[] alpha2=new char[] {'A','B','C','D'};
		for(int i=0;i<alpha2.length;i++) {
			System.out.println(i+" "+alpha2[i]);
		}
		
		//alpha= {'가','나','다','라'};
		alpha=new char[]{'가','나','다','라'};
		alpha2=new char[10];
		
		
		//배열은 한번 선언된 길이는 변경되지 않는다
		String[] names2=new String[3];
		names2[0]="유병승";
		names2[1]="홍길동";
		names2[2]="피카츄";
		//names2[3]="리자몽";//자동으로 길이가 증가하지 않는다.
		names2=new String[4];
		
		//배열은 저장된 데이터를 전체 순회해서 원하는 데이터를 찾을 수 있음;
		int[] numbers2= {10,20,30,40,50,60,70};
		
		//30이상인 값의 갯수를 구하는 기능
		int count=0;
		for(int i=0;i<numbers2.length;i++) {
			if(numbers2[i]>=30) {
				count++;
			}
		}
		System.out.println("30이상인 값 : "+count);
		
//		int n=10,n1=20,n3=30,n4=40,n5=40,n6=60,n7=100;
//		int count2=0;
//		if(n>=30) {
//			count2++;
//		}
//		if(n1>=30) {
//			count2++;
//		}
//		if(n3>=30) {
//			count2++;
//		}
//		if(n4>=30) {
//			count2++;
//		}
//		if(n5>=30) {
//			count2++;
//		}
//		if(n6>=30) {
//			count2++;
//		}
//		if(n7>=30) {
//			
//		}
		
		
		//저장된 학생이름 중 김씨 학생의 수를 구하는 기능
		//버전업 사용자가 요청한 성씨를 학생수를 구하는 기능
		String[] studentName= {"김현영","김찬은","김중근",
				"김재훈","김예린","강민기","윤지환","윤준호","윤나라",
				"나빈","이성진","이동제","이다영","조윤진","정상준","이은지"};
		count=0;
		System.out.print("찾을 학생 성씨 : ");
		char n=sc.next().charAt(0);
		for(int i=0;i<studentName.length;i++) {
			//if(studentName[i].charAt(0)=='김') {
			if(studentName[i].charAt(0)==n) {
				count++;
			}
		}
		System.out.println(n+"씨성을 가진 학생수 : "+count);
		
		
		//정수 10개를 램덤으로 저장하는 기능 만들기.
		//1~100수를 랜덤하게 저장
		
		int[] randomNum=new int[10];
		for(int i=0;i<randomNum.length;i++) {
			randomNum[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<randomNum.length;i++) {
			System.out.print(randomNum[i]+" ");
		}
		System.out.println();
		//최대값, 최소값을 찾아내기!!
//		int maxNum=0,minNum=0;
		int maxNum=randomNum[randomNum.length-1];
		int minNum=randomNum[randomNum.length-1];
		for(int i=0;i<randomNum.length;i++) {
			if(randomNum[i]>maxNum) {
				maxNum=randomNum[i];
			}
			if(randomNum[i]<minNum) {
				minNum=randomNum[i];
			}
		}
		System.out.println("최대값 : "+maxNum);
		System.out.println("최소값 : "+minNum);
		
		//배열은 선형구조로 순서가 있음.
		//순서는 인덱스번호를 기준으로 순서를 정함.
		//값을 정렬할 수 있다.
		//배열의 저장값 위치변경하기 -> swrap
		int[] testArr= {4,3,6,2,7,5,1};
		
		for(int i=0;i<testArr.length;i++) {
			System.out.print(testArr[i]+" ");
		}
		int temp=testArr[0];
		testArr[0]=testArr[1];
		testArr[1]=temp;
		System.out.println();
		for(int i=0;i<testArr.length;i++) {
			System.out.print(testArr[i]+" ");
		}
		
		for(int i=0;i<testArr.length;i++) {
			for(int j=0;j<i;j++) {
//				int pre=testArr[j];
//				int next=testArr[i];
				//if(testArr[i]<testArr[j]) {
				if(testArr[i]>testArr[j]) {
					int t=testArr[i];
					testArr[i]=testArr[j];
					testArr[j]=t;
				}
			}
		}
		System.out.println();
		for(int i=0;i<testArr.length;i++) {
			System.out.print(testArr[i]+" ");
		}
		
		Integer[] t=Arrays.stream(testArr).boxed()
				.toArray(Integer[]::new);
		
		Collections.sort(Arrays.asList(t),
				(pre,next)->next-pre);
		
		System.out.println();
		for(int i=0;i<testArr.length;i++) {
			System.out.print(testArr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(t));
		
		
		//배열 길이을 정하면 고정
		String[] oriName= {"유병승","홍길동","김유신"};
		oriName=new String[6];
		for(int i=0;i<oriName.length;i++) {
			System.out.println(oriName[i]);
		}
	}
	
	public void arraysCopyTest() {
		//배열의 복사를 알아보자.
		//배열을 복사
		//1. 얕은복사 : 원본값을 공유하는 방식
		//2. 깊은복사 : 별도의 저장공간을 생성해서 데이터를 따로 관리하는 방식
		int[] num= {1,2,3,4,5};
		//얕은복사 -> 주소를 복사해줌.
		int[] copynum=num;
		System.out.println(num);
		System.out.println("num "+Arrays.toString(num));
		System.out.println("copynum "+Arrays.toString(copynum));
		System.out.println("num[0] : "+num[0]);
		System.out.println("copynum[0] : "+copynum[0]);
		//주소값을 공유하기때문에 저장소가 한개!
		num[0]=100;
		System.out.println("num[0] : "+num[0]);
		System.out.println("copynum[0] : "+copynum[0]);
		
		//깊은복사 -> 값자체를 복사해서 새로운 저장소에 저장
		int[] deepcopy=new int[num.length];
		for(int i=0;i<num.length;i++) {
			deepcopy[i]=num[i];
		}
		System.out.println("num : "+Arrays.toString(num));
		System.out.println("deepcopy : "+Arrays.toString(deepcopy));
		num[1]=200;
		System.out.println("num : "+Arrays.toString(num));
		System.out.println("deepcopy : "+Arrays.toString(deepcopy));
		
		//java에서 제공하는 기능을 이용해서 깊은복사하기
		//Arrays클래스에서 제공하는 copyof()기능이용하기
		int[] copy2=Arrays.copyOf(num,2);
		System.out.println("copy2"+Arrays.toString(copy2));
//		copy2[3]=-100;
//		System.out.println("num"+Arrays.toString(num));
//		System.out.println("copy2"+Arrays.toString(copy2));
		
		
		//배열전체를 깊은복사할때는 clone()이용해도된다.;
		copy2=num.clone();
		System.out.println("copy2"+Arrays.toString(copy2));
		
		//System.arraycopy()이용하기
		//첫번째 : 원본배열
		//두번째 : 원본배열의 시작인덱스
		//세번째 : 복사될 배열
		//네번째 : 복사될배열의 시작인덱스
		//다섯번째 : 복사할 데이터 수(길이)
		String[] names= {"유병승","홍길동","김유신"};
		String[] extend=new String[names.length+5];
		System.arraycopy(names, 1, extend, 3, 2);
		for(int i=0;i<extend.length;i++) {
			System.out.print(extend[i]+" ");
		}
		System.out.println();
	}
	
	public void doubleArray() {
		//2차원배열에 대해 알아보자
		//배열저장소 두개가 연결되어있는 구조
		//저장소는 바둑판처럼 저장구조를 가지고 있음
		int[][] intArr;
		intArr=new int[3][3];
		System.out.println(intArr);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[0][0]);
		System.out.println(intArr[0][1]);
		System.out.println(intArr[0][2]);
		System.out.println(intArr[1][0]);
		System.out.println(intArr[1][1]);
		System.out.println(intArr[1][2]);
		
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr.length;j++) {
				System.out.print(intArr[i][j]);
			}
			System.out.println();
		}
		intArr[0][0]=1;
		intArr[0][1]=2;
		intArr[0][2]=3;
		intArr[1][0]=4;
		intArr[1][1]=5;
		intArr[1][2]=6;
		intArr[2][0]=7;
		intArr[2][1]=8;
		intArr[2][2]=9;
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j]);
			}
			System.out.println();
		}
//		int[] arr=new int[10];
//		arr.length;
//		String[][] names=new String[3][];
//		names[0]=new String[3];
//		names[1]=new String[5];
//		names[2]=new String[10];
//		for(int i=0;i<names.length;i++) {
//			for(int j=0;j<names[i].length;j++) {
//				System.out.print(names[i][j]);
//			}
//			System.out.println();
//		}
		//3*3 2차원 배열을 생성하고
		//123
		//123
		//123 을 각 인덱스에 저장하고 출력하기
		
		int[][] numbers2=new int[3][3];
		for(int i=0;i<numbers2.length;i++) {
			for(int j=0;j<numbers2[i].length;j++) {
				numbers2[i][j]=j+1;
			}
		}
		for(int i=0;i<numbers2.length;i++) {
			for(int j=0;j<numbers2[i].length;j++) {
				System.out.print(numbers2[i][j]);
			}
			System.out.println();
		}
		//1 2 3 4
		//5 6 7 8
		//9101112 를 저장하고 출력하기
		int[][] numbers3=new int[3][4];
		int count=0;
		for(int i=0;i<numbers3.length;i++) {
			for(int j=0;j<numbers3[i].length;j++) {
				numbers3[i][j]=++count;
			}
		}
		
		for(int i=0;i<numbers3.length;i++) {
			for(int j=0;j<numbers3[i].length;j++) {
				//System.out.printf("%-2d ",numbers3[i][j]);
				if(numbers3[i][j]<10) {
					System.out.print("0"+numbers3[i][j]+" ");
				}else {
					System.out.print(numbers3[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		//2차원배열의 선언과 동시에 초기화
		String[][] study= {
				{"김중근","홍승우","윤준호","김현영"},
				{"김찬은","홍성현","나빈","이성진"},
				{"김재훈","이다영","조장흠"},
				{"김예린","윤나라","최인호","최주영","이동제"},
				{"강민기","윤지환","최솔"},
				{"조윤진","정상준","최하리","이은지"}
				};
		for(int i=0;i<study.length;i++) {
			for(int j=0;j<study[i].length;j++) {
				System.out.print(study[i][j]+" ");
			}
			System.out.println();
		}
		
		//최주영의 조를 찾고 인원수 출력
		//최솔씨의 조를 찾고 인원수 출력
		//나빈씨의 조를 찾고 인원수 출력
		//이름을 입력받아서 찾으세요 없는 이름을 입력하면 없는 조원입니다. 를 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("찾을 팀원 : ");
		String searchName=sc.next();
		String msg="없는 조원입니다.";
		for(int i=0;i<study.length;i++) {
			for(int j=0;j<study[i].length;j++) {
				if(study[i][j].equals(searchName)) {
					//System.out.println((i+1)+"조 인원수 : "+study[i].length);
					msg=(i+1)+"조 인원수 : "+study[i].length;
					msg+=" "+Arrays.toString(study[i]);
					break;
				}
			}
		}
		System.out.println(msg);
		
	}
	//배열에 대한 배열 데이터에 순회할때 편리하게 해보자.
	public void extraTest() {
		int[] intArr= {1,2,3,4,5,6};
		//기본 for문 이용해서 각 인덱스에 접근함.
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		//forEach문을 이용해서 데이터 순회하기
		//for(자료형 변수명 : 배열명||CollectionFramework){ }
		System.out.println("forEach문을 이용해서 출력하기");
		for(int d : intArr) {
			if(d%2==0)
				System.out.println(d);
		}
		//forEach문은 배열에 있는 값을 수정할때는 사용할 수 없다.
		String[] hobby= {"농구","자전거","게임","코딩"};
		for(String h : hobby) {
			if(h.equals("코딩")) h="운동";
			//System.out.println(h);
		}
		for(String h : hobby) {
			System.out.println(h);
		}
			
		//배열에 중복값 없이 저장하기
		//임의의 정수 10개 저장하기
		//1~50
		int[] random=new int[10];
		for(int i=0;i<random.length;i++) {
			random[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(random[i]==random[j]) {
					i--;
					break;
				}
			}
		}
		for(int i:random) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		
		
		
	}
	
}
