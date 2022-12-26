package com.mc.f_array;

import java.util.Arrays;
import java.util.Iterator;

public class A_array {

	public static void main(String[] args) {
		// studyArray();			
		// studyArray2();		
		// studySwalloCopy();
		// studyDeepCopy();		
	}

	private static void studyDeepCopy() {
		// 배열 복사 후 값 변경
		String[] foodArr = {"치킨", "피자", "감튀", "떡볶이", "순대"};
		String[] copyArr = new String[foodArr.length];
		
		for(int i = 0; i < copyArr.length; i++) {
			copyArr[i] = foodArr[i];
		}
		System.out.println("==== 배열 복사 ====");
		System.out.println("copyArr: " + Arrays.toString(copyArr));
		System.out.println();
		
		System.out.println("==== 배열 복사 후 값 변경 ====");
		copyArr[2] = "보쌈";
		System.out.println("foodArr: " + Arrays.toString(foodArr));
		System.out.println("copyArr: " + Arrays.toString(copyArr));
	}

	private static void studySwalloCopy() {
		String[] foodArr = {"치킨", "피자", "감튀", "떡볶이", "순대"};
		String[] copyArr = foodArr;
		
		copyArr[2] = "장어덮밥";
		
		System.out.println("foodArr의 주소: " + System.identityHashCode(foodArr));
		System.out.println(Arrays.toString(foodArr));
		System.out.println("copyArr의 주소: " + System.identityHashCode(copyArr));
		System.out.println(Arrays.toString(copyArr));
		// 대입했기때문에 주소값이 넘어간다.
	}

	private static void studyArray2() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);
		
		int sumArr = 0;
		
		int[] iArr = {10, 20, 30, 40, 50};
		for(int i = 0; i < iArr.length; i++) {
			sumArr += iArr[i];
		}
		System.out.println(sumArr);
	}

	private static void studyArray() {
		// 배열: 같은 타입의 데이터들을 하나의 묶음으로 다루는 자료구조
		//		 배열에 저장된 각 데이터들은 해당 데이터에 접근할 수 있는 index 번호를 부여받는다.
		// 		 배열은 참조자료형으로 JVM heap 영역에 저장된다.
		// 		 참조형 변수(reference)를 통해 heap 영역의 배열에 접근 할 수 있고,
		//   	 index를 통해 배열안의 데이터에 접근할 수 있다.
		
		// 배열 생성 해보기
		// String 타입의 데이터를 5개 보관할 수 있는 배열 생성
		String[] sArr = new String[5];
		sArr[0] = "치킨";
		sArr[1] = "피자";
		sArr[2] = "탕수육";
		sArr[3] = "족발";
		sArr[4] = "미역국";		
		// 변수명.length: 배열의 크기
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		// 배열의 선언과 동시에 초기화
		// 크기가 5인 int[]을 선언하고 각 인덱스에 5, 4, 3, 2, 1 값을 초기화
		int[] iArr = new int[] {5, 4, 3, 2, 1};		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		// 배열 리터럴 초기화
		int[] iArr2 = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < iArr2.length; i++) {
			System.out.print(iArr2[i]);
		}
	}
}
