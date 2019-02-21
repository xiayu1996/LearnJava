package com.java2;
/**
 * 英雄测试类
 * @author xiayu
 *
 */
public class TestHero {

	public static void main(String[] args) {
		// 创建Hero对象
		Hero hero = new Hero();
		// 调用属性
		hero.name = "EZ";
		hero.hp = 500;
		hero.mp = 100;
		hero.attackValue = 60;
		//创建另一个英雄
		Hero hero2 = new Hero();
		hero2.name = "Timo";
		hero2.hp = 400;
		hero2.mp = 200;
		hero2.attackValue = 55;
		//ez打timo
		hero.attack(hero2);
		//timo打ez
		hero2.attack(hero);
		hero.move();
		hero2.move();
		hero.tp();
		hero2.tp();
		
	}

}
