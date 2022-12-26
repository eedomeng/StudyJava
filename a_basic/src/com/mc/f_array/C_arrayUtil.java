package com.mc.f_array;

import java.util.Arrays;
import java.util.Iterator;

public class C_arrayUtil {

	public static void main(String[] args) {
//		int[] iArr = {1, 2, 3, 4, 5};
//		desc(iArr);
//		System.out.println("내림차순: " + Arrays.toString(iArr));

//		int[] iArr = {5, 4, 3, 2, 1};
//		asc(iArr);
//		System.out.println("오름차순: " + Arrays.toString(iArr));

//		int[] iArr = {3, 5, 4, 6, 7};
//		int[] bigArr = add(iArr , 100);
//		System.out.println(Arrays.toString(bigArr));

//		int[] data = {1,2,3,4,5};
//		int[] data2 = {6,7,8,9,0};
//		int[] bigArr = merge(data, data2);
//		System.out.println(Arrays.toString(bigArr));	
		
//		int[] data = {1,2,3,4,5};
//		int[] iArr = remove(data, 2);
//		System.out.println(Arrays.toString(iArr));
		
		int[] data = {1,2,3,4,5};
		int[] iArr = subArr(data, 0, 2);
		System.out.println(Arrays.toString(iArr));
	}
	
	public static int[] subArr(int[] iArr, int start, int end) {
		// 기능 : 원하는 인덱스 구간의 데이터를 잘라내는 메서드
		// 인덱스 구간 : 시작 인덱스 ~ 끝 인덱스의 앞 인덱스까지의 데이터
		// 첫번째 매개변수 : 배열
		// 두번째 매개변수 : 시작 인덱스
		// 세번째 매개변수 : 끝 인덱스
		// 메서드 명 : subArr
		// ex)
		// int[] data = {1,2,3,4,5}
		// subArr(data,0,2); -> [1,2]
		int[] cutArr = new int[end - start];
		for(int i = start; i < cutArr.length; i++) {
			cutArr[i] = iArr[start + i];
		}
				
		return cutArr;
	}

	public static int[] remove(int[] iArr, int num) {
		// 기능: 원하는 인덱스의 데이터를 삭제하는 메서드
		// 첫번째 매개변수: 배열
		// 두번째 매개변수: 인덱스
		// 메서드 명 : remove
		// ex)
		// int[] data = {1,2,3,4,5};
		// remove(data,2) -> [1,2,4,5]
		int[] removeArr = new int[iArr.length - 1];
		int tidx = 0;
		for (int i = 0; i < iArr.length; i++) {
			if (i == num) continue;
			removeArr[tidx] = iArr[i];
			tidx++;
		}

		return removeArr;
	}
				
	public static int[] merge(int[] arr1, int[] arr2) {
		// 기능 : 매개변수로 넘어온 두 int배열을 하나의 배열로 합쳐주는 메서드
		// 메서드 이름 : merge
		// 메서드를 작성하고 테스트까지 완료 해주세요.
		// ex)
		// int[] data = {1,2,3,4,5}
		// int[] data2 = {6,7,8,9,0}
		// merge(data,data2) -> [1,2,3,4,5,6,7,8,9,0]

		// 매개변수로 전달받은 두 배열의 크기를 합친 크기의 새로운 배열을 생성
		int[] bigArr = new int[arr1.length + arr2.length];

		// 두 배열에 있는 값들을 새로운 배열에 밀어넣는다.
		for (int i = 0; i < arr1.length; i++) {
			bigArr[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			bigArr[arr1.length + i] = arr2[i];
		}
		// 새로운 배열을 반환한다.

		return bigArr;
	}

	public static int[] add(int[] iArr, int num) {

		int[] bigArr = new int[iArr.length + 1];
		for (int i = 0; i < iArr.length; i++) {
			bigArr[i] = iArr[i];
		}

		bigArr[bigArr.length - 1] = num;
		return bigArr;
	}

	public static void asc(int[] iArr) {

		for (int i = 0; i < iArr.length; i++) {
			boolean flg = true;

			for (int j = 0; j < iArr.length - 1 - i; j++) {
				if (iArr[j] > iArr[j + 1]) {
					int tmp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = tmp;
					flg = false;
				}
			}
			if (flg)
				break;
		}
	}

	public static void desc(int[] iArr) {

		for (int i = 0; i < iArr.length; i++) {
			boolean flg = true;

			for (int j = 0; j < iArr.length - 1 - i; j++) {
				if (iArr[j] < iArr[j + 1]) {
					int tmp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = tmp;
					flg = false;
				}
			}
			if (flg)
				break;
		}
	}
}
