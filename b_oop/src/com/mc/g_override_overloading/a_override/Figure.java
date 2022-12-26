package com.mc.g_override_overloading.a_override;

public class Figure {
	// Override: 부모클래스로부터 상속받은 메서드를 제정의
	//			 부모클래스에 선언된 메서드의 접근제한자보다 넓은 범위의 접근제한자로 변경할 수 있다.
	//			 하지만 좁은 범위의 접근제한자로 변경하는 것은 불가능하다.
	// 		     - 부모클래스에서 throw하고 있는 예외클래스를 해당 예외클래스의 선조클래스로 바꿔 throw하는 것은 가능하다.
	// 			 - private 메서드는 private필드변수와 마찬가지로 상속되지 않기 때문에 Override 할 수 없다.
	//			 - static 메서드는 상속이 안된다. 따라서 Override도 할 수 없다.
	private String privateTest = "private 상속이 안됩니다";
	
	public double calArea() {
		return 0.0;
	}
	
	private void testExtends() {
		System.out.println("private은 상속이 안됩니다.");
	}
	
	public static void testStaticExtends() {
		System.out.println("static은 상속이 안됩니다.");
	}

}
