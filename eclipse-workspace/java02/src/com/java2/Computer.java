package com.java2;
/**
 * ���������
 * @author xiayu
 *
 */
public class Computer {
	String cpu;
	double price;
	String memory;
	String displayCard;
	
	public Computer() {}
	
	public Computer(String cpu,double price,String memory,String displayCard) {
		this.cpu = cpu;
		this.price = price;
		this.memory = memory;
		this.displayCard = displayCard;
	}
	
	public void watchMovie() {
		System.out.println("������"+price+"��ĵ��Կ���Ӱ��");
	}
	public void playGame() {
		System.out.println("������"+price+"��ĵ��Դ���Ϸ��");
	}
}
