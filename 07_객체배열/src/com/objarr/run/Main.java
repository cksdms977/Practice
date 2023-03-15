package com.objarr.run;

import java.util.Scanner;

import com.objarr.controller.Animal;
import com.objarr.controller.Fruit;
import com.objarr.controller.Person;

public class Main {
		public static void main(String[] args) {
			// 객체배열 이용하기
			// 객체배열에 생성하기
			// Animal a, a1, a2, a3, a4;
			Animal[] animals; // 객체배열변수를 선언
			animals = new Animal[4]; // 배열 저장공간을 생성해서 대입
			
			animals[0] = new Animal();
			animals[1] = new Animal("고양이", "베리", 3, 6, '여');

			// 각 배열에 저장된 객체데이터 활용하기
			// 0번 인덱스에 저장된 동물의 이름을 가져오기
			System.out.println(animals[0]); // animals객체에 주소가 담겨있음
			String name = animals[0].getName();
			System.out.println(name); // 이름을 이렇게 가져올수 있다.
			animals[0].setName("햄찌");
			System.out.println(animals[0].getName()); // 이렇게 데이터를 저장하고 출력할수 있다.
			System.out.println(animals[1].getName());
		
			//Animal 을 3개 저장할수 있는 저장소를 만들고 
			// 원숭이 몽키 3 9 남
			// 돼지 꿀꿀이 1 30 여
			// 토끼 깡총이 2 2 여
		
			Animal animals2[] = new Animal[3];
			
			animals2[0] = new Animal();
			animals2[0].setType("원숭이");
			animals2[0].setName("몽키");
			animals2[0].setAge(3);
			animals2[0].setWeight(9);
			animals2[0].setGender('남');
			
			animals2[1] = new Animal();
			animals2[1].setType("돼지");
			animals2[1].setName("꿀꿀이");
			animals2[1].setAge(1);
			animals2[1].setWeight(30);
			animals2[1].setGender('여');
			
			animals2[2] = new Animal();
			animals2[2].setType("토끼");
			animals2[2].setName("깡총이");
			animals2[2].setAge(2);
			animals2[2].setWeight(2);
			animals2[2].setGender('여');
			
			
			
			
//			System.out.println(animals2[0].infoAnimal());
//			System.out.println(animals2[1].infoAnimal());
//			System.out.println(animals2[2].infoAnimal()); 밑에 for문을 사용할수 있도록 한다.
			
			for (int i = 0; i < animals2.length; i++) {
				System.out.println(animals2[i].infoAnimal());
			}
			
			
//			animals2[0] = new Animal("원숭이", "몽키", 3, 9, '남');
//			animals2[1] = new Animal("돼지", "꿀꿀이", 1, 30, '여');
//			animals2[2] = new Animal("토끼", "깡총이", 2, 2, '여');
//			
//			System.out.println(animals2[0].getType() + " " +  animals2[0].getName() + " " + 
//					animals2[0].getAge() + " " + animals2[0].getWeight() 
//					+ " " + animals2[0].getGender());
//			
//			System.out.println(animals2[1].getType() + " " +  animals2[1].getName() + " " + 
//					animals2[1].getAge() + " " + animals2[1].getWeight() 
//					+ " " + animals2[1].getGender());
//			
//			System.out.println(animals2[2].getType() + " " +  animals2[2].getName() + " " + 
//					animals2[2].getAge() + " " + animals2[2].getWeight() 
//					+ " " + animals2[2].getGender());
		
			// com.objarr.controller.Person만들기
						// 이름 나이 주소 전화번호
//						Person을 5명 저장할 수 있는 공간을 확보하고
//						-> 생성자는 기본 생성자만 생성
//						사용자가 입력한 값으로 Person을 생성 및 저장소에 저장 후
						// 저장된 사용자 모두를 출력하기
						// getter/setter사용하기
		
//		Person person[] = new Person[5];
////		person = new Person[5];		
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < person.length; i++) {
//			person[i] = new Person();// 이거 무조건 넣어주기
//			
//			System.out.print("이름 : ");
//			person[i].setName(sc.next());
//			
//			System.out.print("나이 : ");
//			person[i].setAge(sc.nextInt());
//			sc.nextLine();
//			
//			System.out.print("주소 : ");
//			person[i].setAddress(sc.nextLine());
//			
//			System.out.print("전화번호 : ");
//			person[i].setPhonenumber(sc.nextLine());
//			
//		}
//		
//		for (Person person2 : person) {
////			person2.setName("안녕"); 이렇게 해도 name을 바꿀수 있다. 인덱스 0번째 이름값을
//			System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getAddress() + " " + person2.getPhonenumber());
//		}
		
//		for (int i = 0; i < person.length; i++) {
//			Person person2 = person[i];
//			System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getAddress() + " " + person2.getPhonenumber());
//		} 위에 for문이랑 똑같은 값이 나온다. 대부분 배열나올때는 for each문을 쓰는걸 선호
		
		
		// 객체 배열 선언과 동시에 초기화 하기
//		Person ps[] = {new Person("유병승", 19, "경기도 시흥시", "0202"),
//					   new Person("이성진", 25, "서울시 노원구", "010123"),
//					   new Person("이동제", 25, "경기도 군포시", "010555"),
//					   new Person("이다영", 25, "경기도 광명시", "010233")};		
//		// 다수의 데이터를 저장하고 활용할때 객체배열
//		// 저장된 사람중 25살인 사람 조회하기
//		
//		
//		for (Person person2 : ps) {
//			if (person2.getAge() == 25) {
//				System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getAddress() + " " + person2.getPhonenumber());
//			}
//		}
		
//		for (int i = 0; i < ps.length; i++) {
//			ps[i] = new Person();
//			if (ps[i].getAge() == 25) {
//				System.out.println();
//			}
//		}
		
		
		// 과일을 저장할 수 있는 클래스를 만들고
		// 이름, 무게, 색상, 가격
		// 과일을 5개 저장할 수 잇는 저장소를 만들자
		// 과일 본인이 좋아하는 과일로 초기화 하고
		// 1. 초기화한 과일들 전체 출력하기
		//2. 입력된 과일중 무게가 3kg이상인 과일 출력하기
		// 3. 가격이 3000 이상인 과일 출력하기
		// 사과 5 빨강 10000
		//바나나 3 노랑 8000
		// 딸기 1.5 빨강 2500
		// 키위 2 초록 2800
		// 샤인머스켓 1.3 초록 40000
		
		Fruit fruit[] = new Fruit[5];
		
		fruit[0] = new Fruit("사과", 5, "빨강", 10000);
		fruit[1] = new Fruit("바나나", 3, "노랑", 8000);
		fruit[2] = new Fruit("딸기", 1.5, "빨강", 2500);
		fruit[3] = new Fruit("키위", 2, "초록", 2800);
		fruit[4] = new Fruit("샤인머스켓", 1.3, "초록", 40000);
		
		for (Fruit fr : fruit) {
			System.out.println(fr.infoFruit());
		}
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i].getWeight() >= 3) {
				System.out.println(fruit[i].infoFruit());
			}
		}
		for (Fruit fruit2 : fruit) {
			if (fruit2.getPrice() >= 3000) {
				System.out.println(fruit2.infoFruit());
			}
		}
		
		
		
		
		
		}
	
		
	

		
}
