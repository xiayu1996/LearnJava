package com.java1;

public class Test2 {

	public static void main(String[] args) {
		int[] array1 = {11,22,33,44,55};
		//�������� ��ͨ��ʽ��
		for(int i=1;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		System.out.println("________________");
		//ʹ����ǿ��for��������,�������޸ģ�
		for(int num : array1) {
			System.out.println(num);
		}
	}

}
