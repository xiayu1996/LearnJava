package com.java1;

import java.util.Scanner;

/**
 * ����Ķ���
 * @author xiayu
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// ���峤��Ϊ5����������
		Scanner input = new Scanner(System.in);   //ctrl+shift+o ����
		int[] ages = new int[5];
		int sum = 0;
		for(int i =0;i<ages.length;i++) {
			System.out.println("�����������"+(i+1)+"���˵����䣺");
			ages[i] = input.nextInt();
			sum += ages[i];
		}
		int avg = sum / ages.length;
		System.out.println("ƽ��������"+avg+"��");
//		int[] array1 = new int[5];
//		System.out.println(array1[2]);
//		int[] array2 = {11,22,33,44,55};
	}

}
