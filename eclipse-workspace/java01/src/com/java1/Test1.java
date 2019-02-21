package com.java1;

import java.util.Scanner;

/**
 * 数组的定义
 * @author xiayu
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// 定义长度为5的整型数组
		Scanner input = new Scanner(System.in);   //ctrl+shift+o 导包
		int[] ages = new int[5];
		int sum = 0;
		for(int i =0;i<ages.length;i++) {
			System.out.println("请输入年龄第"+(i+1)+"个人的年龄：");
			ages[i] = input.nextInt();
			sum += ages[i];
		}
		int avg = sum / ages.length;
		System.out.println("平均年龄是"+avg+"岁");
//		int[] array1 = new int[5];
//		System.out.println(array1[2]);
//		int[] array2 = {11,22,33,44,55};
	}

}
