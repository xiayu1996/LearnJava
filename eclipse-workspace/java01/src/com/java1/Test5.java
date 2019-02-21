package com.java1;

import java.util.Arrays;

/**
 * 使用arrays工具类
 * @author xiayu
 *
 */
public class Test5 {

	public static void main(String[] args) {
		int[] numbers = {11,33,22,55,12};
		Arrays.sort(numbers);
		for(int num : numbers)
			System.out.println(num);
		//二分查找
		int position = Arrays.binarySearch(numbers, 22);
		if(position < 0)
			System.out.println("没有找到");
		System.out.println("位置是："+position);
		int[] numbers2 = Arrays.copyOf(numbers, 10);
		for(int num : numbers2)
			System.out.println(num);
	}
}
