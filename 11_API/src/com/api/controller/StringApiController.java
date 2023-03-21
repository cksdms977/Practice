package com.api.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.api.model.vo.Person;

public class StringApiController {
	// 자바에서 문자열에 대한 클래스는 3가지가 있음
	// String, StringBuffer, StringBuilder
	// String : 클래스지만 기본자료형처럼 사용하게 설정되어 있음
	// StringBuffer, StringBuilder : 클래스를 사용방식으로 문자열을 다룰수 있음
	// String은 불변의 문자열 -> 수정이 불가능함
	// StringBuffer, StringBuider : 가변의 문자열 -> 수정이 가능함
	
	public static void main(String[] args) {
		
		String str = "유병승";
		System.out.println(str);
		
		System.out.println("------------------------");
		StringBuffer sb = new StringBuffer("유병승"); // 이렇게 출력해야함.
		System.out.println(sb);
		
		System.out.println("수정전 " + str.hashCode()); // 최초의 str이 가지고 있는 주소값을 출력해줌
		System.out.println("------------------------");
		//String은 불변이다. // 원래 있던 것들에 더해서 주는게 아니라 새로 유병승 선생님이라는 하나 더 만들어 주는것이다.
		str += " 선생님"; // 기본자료형 처럼 사용가능 
		System.out.println(str);
		System.out.println("수정 후  " + str.hashCode());
		
		System.out.println("------------------------");
		// StringBuffer의 데이터를 수정하려면 제공하는 메소드를 이용해야한다. 이게 더 효율적이다.
		System.out.println("sb 수정전 " + sb.hashCode());
		sb.append(" 선생님"); // 기본자료형으로 사용 불가능
		System.out.println(sb);
		System.out.println("sb 수정후 " + sb.hashCode());
		
		System.out.println("------------------------");
		// String 클래스가 제공하는 유용한 메소드
		//1. String에서 접근해서 사용하는 String.concat("문자열 값") : 두개의 문자열을 합쳐주느 메소드
		String test = "GDJ64";
		test = test.concat(" 아자아자 파이팅!"); // += 이라는 연산과 동일하다.
		System.out.println(test);
		
		System.out.println("------------------------");
		//2. boolean String.contains("문자열") : 문자열에 매개변수로 전달된 문자열이 포함되어있는지 확인해주는 기능
		if(test.contains("64")) {
			System.out.println("응 64 포함됨");
		}
		
		System.out.println("------------------------");
		//3. int indexOf("문자열) : 문자열에 매개변수로 전달된 문자가 있는지 확인하고 그 자리수 (인덱스번호)를 반환해줌
		System.out.println(test.indexOf("D"));
		System.out.println(test.indexOf("팅"));
		System.out.println(test.indexOf("아자"));
		// 단독으로 사용하는 경우는 많이 없다. 다른 메소드와 연결해서 많이 사용
		System.out.println(test.indexOf("유병승"));
		// lastIndexOf("문자열");
		System.out.println(test.lastIndexOf("아자"));
		// 파일명에 대한 확장자를 찾을때 많이 사용됨
		// date.txt, test.exe
		test = "date.test.exe";
		System.out.println(test.lastIndexOf("."));
		System.out.println(test.indexOf(".", 5)); // 5번째부터 찾아라는 뜻
		System.out.println(test.indexOf(".", test.indexOf(".") + 1));
		
		System.out.println("------------------------");
		// 4. String[] split(String) : 특정구분자(기호)로 구분할 수 있는 문자열을 구분해서 배열로 만드는것.
		test = "유병승,19,경기도시흥시,남";
		String[] result = test.split(","); // 쉼표 앞에 0번인덱스, 1번인덱스,,,, 이렇게 짤려서 알려줌
		for (String d : result) {
			System.out.println(d);
		}
		
		test = "유병승,19,경기도시흥시,남\n최솔,29,경기도안양시,여\n김현영,26,서울구로구,여";
		String[] persons = test.split("\n");
		Person[] personObj = new Person[persons.length];
		
		int i = 0;
		for (String p : persons) {
			String[] person = p.split(",");
			Person pobj = new Person(person[0], Integer.parseInt(person[1]), person[2], person[3].charAt(0));
			personObj[i++] = pobj;
			
			System.out.println("이름 : " + person[0]);
			System.out.println("나이 : " + person[1]);
			System.out.println("주소 : " + person[2]);
			System.out.println("성별 : " + person[3]);
		}
		
		for (Person p : personObj) {
			System.out.println(p);
		}
		
		
		System.out.println("------------------------");
		
		// 5. String replace("찾을값", "대체할 값") : 특정문구를 대체문구로 대체
		test = "나는 코딩을 정말 못해";
		
//		String teststr = test.replace("못해", "잘해");// 이렇게는 안됨
		
		test = test.replaceAll("못해", "잘해");
		System.out.println(test);
//		System.out.println(teststr);// 이건 안됨
		
		System.out.println("------------------------");
		
		// 6. String String.join("구분자", 배열) : 배열을 특정구분자로 문자열을 만들어줌
		String [] testArr = {"유병승", "윤지환", "윤나라", "나빈"};
		test = String.join("-", testArr);
		System.out.println(test);
		
		System.out.println("------------------------");
		
		//7. String substring(시작인덱스, [,끝인덱스번호]) : 시작인덱스부터 끝인덱스까지 문자열을 잘라내는 기능
		test = "수업 좀 잘하세요";
		str = test.substring(4);
		System.out.println(str);
		str = test.substring(2, 4);
		System.out.println(str);
		str = test.substring(test.indexOf("잘"));
		System.out.println(str);
		
		test= "test.png";
		str = test.substring(test.indexOf(".") + 1);
		System.out.println(str);
		
		str = test.substring(0, test.indexOf("."));
		System.out.println(str);
		
		System.out.println("------------------------");

		// 8. toUpperCase()/ toLowerCase()
		test = "AbdDefG";
		str = test.toUpperCase();
		System.out.println(str);
		str = test.toLowerCase();
		System.out.println(str);
		// 사용 예시
//		Scanner sc = new Scanner(System.in);
//		System.out.println("계속하시겠습니까? (y/n)");
//		String cho = sc.next();
//		if (cho.toLowerCase().equals("y")) {
//			System.out.println("계속하자");
//		}else if (cho.toLowerCase().equals("n")) {
//			System.out.println("중단하자");
//		}
		
		System.out.println("------------------------");
		
		// 9. trim() : 문자열의 양쪽 공백을 제거해주는 메소드
		test = "       안녕하세요";
		System.out.println(test);
		str = test.trim();
		System.out.println(str);
		
		System.out.println("------------------------");
		
		// valudOf() : 기본자료형을 String으로 변환해주는 기능
		int age = 19;
		
//		test = (String) age; // 이렇게 변경할수 없음
		test = String.valueOf(age); // 이렇게 사용해야함
		System.out.println(test);
		test = String.valueOf(180.5);
		System.out.println(test);
		
		System.out.println("------------------------");

		// StringBuffer이용하기
		// 데이터를 수정, 저장하기 * 원본값을 수정함.
		
		//1. append("문자열") : 문자열을 추가하는 메소드
		StringBuffer testsb = new StringBuffer();
		
		System.out.println(testsb);
		System.out.println(testsb.length());
		testsb.append("여러분 한시간 남았어요!");
		System.out.println(testsb);
		System.out.println(testsb.length());
		testsb.append(" 우리 힘냅시다! 보강은 어떻게 할까요?");
		System.out.println(testsb);
		System.out.println(testsb.length()); // 이렇게 원본값에 계속 수정해서 더하는 것임
		
		System.out.println("------------------------");

		// 2. insert(인덱스번호, 문구) : 특정위치에 문구를 추가하는 것
		testsb.insert(3, " 곧");
		System.out.println(testsb);
		
		testsb.insert(testsb.indexOf("!"), " ????");
		System.out.println(testsb);
		
		System.out.println("------------------------");
		
		// 3. delete(시작인덱스, 끝인덱스) : 해당위치에 있는 값을 삭제
		testsb.delete(3, 5); // 지우기
		System.out.println(testsb); 
		
		testsb.delete(0, 3);
		System.out.println(testsb);
		
		// deleteCharAt(인덱스번호) : 한글자만 삭제하는 기능
		testsb.deleteCharAt(1); // 한글자 삭제하고 한칸식 땡김
		System.out.println(testsb);
		
		System.out.println("------------------------");

		//4. setCharAt(인덱스번호, "수정할 문자") : 해당인덱스번호의 문자를 수정.
		testsb.setCharAt(1, '공'); // 한글자씩 수정가능함
		System.out.println(testsb);

		System.out.println("------------------------");
		
		//5. length() 문자열의 길이를 출력 
		System.out.println(testsb.length());
		
		System.out.println("------------------------");

		// String에서 제공하는 유사한 유용한메소드를 제공
		// substring, indexOf, resplace 등등등
		String result1 = testsb.substring(5);
		System.out.println(result1);
		
		System.out.println("------------------------");
		
		// replace(시작번호, 끝번호, "변경할 문구") 원본값 수정
		testsb.replace(0, 3, "여러분 힘내요!!");
		System.out.println(testsb);
		
		testsb.reverse();
		System.out.println(testsb);
		
		System.out.println("------------------------");
		
		// StringBuffer == StringBuilder 동일함. 차이점은 스레드세이프티 
		StringBuffer testsb2 = new StringBuffer();
		testsb2.append("테스트");
		System.out.println(testsb2);
		
		System.out.println("------------------------");

		// String 과 StringBuffer의 호환성
		
		System.out.println(testsb);
		test = new String(testsb);
		System.out.println(test);
		testsb = new StringBuffer(test);
		System.out.println(testsb);
		
		System.out.println("------------------------");

		// StringTokenizer 클래스 이용하기
		// String에서 제공하는 split() 메소드와 유사한 기능
		
		test = "유병승,최주영,이동제,최인호";
		test = "java,oracle,html/css/javascript/jquery,servlet,jsp";
		
		StringTokenizer st = new StringTokenizer(test, ",");
		
//		StringTokenizer st = new StringTokenizer(test, ",");
//		System.out.println(st.nextElement()); // 하나씩 가져옴
//		System.out.println(st.nextElement());
//		System.out.println(st.nextElement());
//		System.out.println(st.nextElement());
		// 이래서 대부분 반복문을 돌림
		while(st.hasMoreElements()) {
			
			String name = st.nextToken(); // 이렇게 변수를 하나 설정해서 받아서 사용해야함
			if (name.equals("유병승")) {
				System.out.println(name + " 선생");

			}else {
				System.out.println(name);
			}
//			System.out.println(st.nextElement());
		}
		
		
		
 	}
	
	
	
	
	
}
