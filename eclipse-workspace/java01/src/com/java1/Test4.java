package com.java1;

import java.util.Scanner;

/**
 * 二分查找
 * @author xiayu
 *
 */
public class Test4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = {1,2,3,4,5,6}; 
		int min = 0 ,max = numbers.length-1 ,mid;
		System.out.println("请输入想查找的数字：");
		int num = input.nextInt();
		int result = 0;
		while(min <= max ) {
			mid = (min+max)/2;
			if(numbers[mid] == num)
				{System.out.println("他的位置在第"+(mid+1)+"个");
				 result = 1;
				 break;
				}
			else if(numbers[mid] < num) {
				min = mid+1;
			}
			else {
				max = mid-1;
			}
		}
		if(result == 0)
		System.out.println("没有找到！");
	}
}
