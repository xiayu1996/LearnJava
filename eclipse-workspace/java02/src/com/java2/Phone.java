package com.java2;

public class Phone {
	String brand;
	double price;
	String color;
	
	//һ�����ֶ�Ҫ�У���������ԣ�
	public Phone() {
		System.out.println("�����޲εĹ��캯����");
	}
	
	public Phone(String brand,double price,String color) {
		//ͨ�����췽������Ա�������г��Ի�
		this.brand = brand;
		this.color = color;
		this.price = price;
		System.out.println("�����вεĹ��캯����");
	}
	/*
	 * ��绰
	 */
	public void call() {
		System.out.println("");
	}
}	