package com.mc.exception.custom;

// 예외 클래스를 직접 만들어보자.

// Checked Exception: Exception 클래스를 상속받은 클래스를 만들면, Checked Exception으로 사용할 수 있다.
// UnChecked Exception(Runtime Exception): RuntimeException을 상속받은 클래스를 만들면 UnChecked Exception으로 사용할 수 있다.
public class TimeOutException extends Exception{
	// 객체 직렬화시에 사용
	// 객체 직렬화: 통신에서 객체를 전달하기 위해 디지털신호로 표현하기 위한 2진값으로 변경
	// serialVersionUId: 직렬화 과정에서 클래스를 고유하게 식별하기 위한 ID
	//					 만약 작성하지 않을 경우, JVM에서 임의로 부여한다.
	private static final long serialVersionUID = 2013900590573124396L;	
	
	public TimeOutException() {
		super("상대방 서버의 응답이 너무 늦어 서버를 종료합니다.");
	}

	// message: 예외에 대한 안내
	public TimeOutException(String message) {
		// Exception의 생성자 매개변수로 message를 전달
		// getMessage()를 통해서 확인
		// stackTrace를 출력시 함께 출력됨
		super(message);
	}

	
	
	

}
