package com.java1;
/**
 * —°‘Ò≈≈–Ú	
 * @author xiayu
 *
 */
public class Test3 {

	public static void main(String[] args) {
		int[] array1 = {22,55,33,66,11};
		for(int i=0;i<array1.length-1;i++) {
			int min =i;
			for(int j=i;j<array1.length;j++) {
				if(array1[j] < array1[min]) {
					min=j;
				}
			}
			if(i != min) {
				int temp = array1[i];
				array1[i] = array1[min];
				array1[min] = temp;				
			}
		}
		for(int num : array1)
			System.out.println(num);
	}

}
