package com.java2;
/**
 * ��Ķ���
 * @author xiayu
 *
 */
public class Hero {
	//����
	String name;
	//Ѫ��
	int hp;
	//����
	int mp;
	//������
	int attackValue;
	/**
	 * ����
	 */
	public void attack() {
		System.out.println("Ӣ�����֣�"+name+"��ʼ��������");
	}
	/**
	 * ����
	 * @param enemy �з�Ӣ��
	 */
	public void attack(Hero enemy) {
		System.out.println(name+"������"+enemy.name);
		//��Ѫ
		enemy.hp -= attackValue;
		System.out.println("�з�Ӣ��ʣ��Ѫ����"+enemy.hp);
	}
	/**
	 * �ƶ�
	 */
	public void move() {
		System.out.println("Ӣ�����֣�"+name+"��ʼ�ƶ�����");
	}
	/**
	 * �س�
	 */
	public void tp() {
		System.out.println("Ӣ�����֣�"+name+"��ʼ�سǣ���");
	}
}
