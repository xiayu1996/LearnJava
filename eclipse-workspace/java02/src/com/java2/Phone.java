package com.java2;

public class Phone {
	String brand;
	double price;
	String color;
	
	//一般两种都要有，增加灵活性！
	public Phone() {
		System.out.println("这是无参的构造函数！");
	}
	
	public Phone(String brand,double price,String color) {
		//通过构造方法给成员变量进行初试化
		this.brand = brand;
		this.color = color;
		this.price = price;
		System.out.println("这是有参的构造函数！");
	}
	/*
	 * 打电话
	 */
	public void call() {
		System.out.println("");
	}
}	