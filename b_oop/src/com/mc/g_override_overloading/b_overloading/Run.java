package com.mc.g_override_overloading.b_overloading;

public class Run {

	public static void main(String[] args) {
		// 반지름이 5인 원의 넓이를 구하시오.
		Circle circle = new Circle();

		circle.setRadius(5);
		double circleArea = AreaCalculator.calArea(circle);
		System.out.println("원의 넓이: " + circleArea);

		// 너비가 4 높이가 7인 직각사각형의 넓이를 구하시오.
		Rectangle rectangle = new Rectangle();

		rectangle.setWidth(4);
		rectangle.setHeight(7);
		double rectangleArea = AreaCalculator.calArea(rectangle);
		System.out.println("직각사각형의 넓이: " + rectangleArea);

	}

}
