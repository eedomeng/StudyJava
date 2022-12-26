package com.mc.j_inner;

public class Run {

	public static void main(String[] args) {
		// Car 클래스의 inner instance 클래스를 인스턴스화
		// inner instance 클래스는 인스턴스를 통해서 생성
		// 권장되지 않음
		Car car = new Car();
		car.new Builder().name("차")
						 .price(100000)
						 .size("대형");	
		
		car.new Builder().name("car");
		
		System.out.println(car);
		
		// 1. 점층적 생성자 패턴
		// 매개변수가 있는 생성자를 사용해 객체를 초기화하는 객체 생성 패턴
		// ex) Book book = new Book("김필", 10000, "김훈");
		// 불변 객체 생성 가능
		// 객체를 초기화한 이후 속성값을 변경이 불가능한 객체를 생성할 수 있다. / setter를 안 만들면 수정이 불가능
		// 단점: 가독성이 좋지 않다. 어떤 속성에 어떤 값이 초기화되는지 코드를 보고 한눈에 파악하기 힘들다.
		
		// 2. 자바빈패턴
		// 기본 생성자로 객체를 생성하고 setter를 통해 값을 초기화
		// ex) Book book = new Book();
		//	   book.setTitle("김필");
		// 가독성이 좋다. 어떤 속성에 어떤 값이 초기화되는지 인스턴스화하는 코드상에서 알 수 있다.
		// 불변 객체 생성이 불가능
		// 초기화된 속성은 setter를 통해 언제든 변경이 가능
		
		// 3. builder 패턴
		// Book 클래스의 인스턴스를 생성하지 않더라도 inner static 클래스는 인스턴스화가 가능
		// 불변 객체 생성이 가능하다.
		// 가독성이 좋다.
		Book book = new Book.Builder().name(null).price(0).author("홍길동").hasStock(false).build();
		System.out.println(book);
	}

}
