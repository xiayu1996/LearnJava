package com.java2;
/**
 * 定义电脑类
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
		System.out.println("我在用"+price+"块的电脑看电影！");
	}
	public void playGame() {
		System.out.println("我在用"+price+"块的电脑打游戏！");
	}
}
