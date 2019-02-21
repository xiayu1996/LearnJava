package com.java2;
/**
 * 类的定义
 * @author xiayu
 *
 */
public class Hero {
	//名字
	String name;
	//血量
	int hp;
	//蓝量
	int mp;
	//攻击力
	int attackValue;
	/**
	 * 攻击
	 */
	public void attack() {
		System.out.println("英雄名字："+name+"开始攻击！！");
	}
	/**
	 * 攻击
	 * @param enemy 敌方英雄
	 */
	public void attack(Hero enemy) {
		System.out.println(name+"攻击了"+enemy.name);
		//扣血
		enemy.hp -= attackValue;
		System.out.println("敌方英雄剩余血量："+enemy.hp);
	}
	/**
	 * 移动
	 */
	public void move() {
		System.out.println("英雄名字："+name+"开始移动！！");
	}
	/**
	 * 回城
	 */
	public void tp() {
		System.out.println("英雄名字："+name+"开始回城！！");
	}
}
