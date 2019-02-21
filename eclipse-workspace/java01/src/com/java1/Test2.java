package com.java1;

public class Test2 {

	public static void main(String[] args) {
		int[] array1 = {11,22,33,44,55};
		//遍历数组 普通方式：
		for(int i=1;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		System.out.println("________________");
		//使用增强型for遍历数组,但不能修改：
		for(int num : array1) {
			System.out.println(num);
		}
	}

}
