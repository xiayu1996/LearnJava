package com.java2;
/**
 * Ӣ�۲�����
 * @author xiayu
 *
 */
public class TestHero {

	public static void main(String[] args) {
		// ����Hero����
		Hero hero = new Hero();
		// ��������
		hero.name = "EZ";
		hero.hp = 500;
		hero.mp = 100;
		hero.attackValue = 60;
		//������һ��Ӣ��
		Hero hero2 = new Hero();
		hero2.name = "Timo";
		hero2.hp = 400;
		hero2.mp = 200;
		hero2.attackValue = 55;
		//ez��timo
		hero.attack(hero2);
		//timo��ez
		hero2.attack(hero);
		hero.move();
		hero2.move();
		hero.tp();
		hero2.tp();
		
	}

}
