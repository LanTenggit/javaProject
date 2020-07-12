package pragram1;

import java.util.*;

public  class Character {

	public static void setCount(int count) {
		Character.count = count;
	}

	public void setSkipUseCard(boolean skipUseCard) {
		this.skipUseCard = skipUseCard;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	private int id;
	private static int count;
	private String skillname;
	private String name;
	private int maxhp;// ����Ѫ�������ޣ���3��4��
	private boolean skipUseCard;// �Ƿ��������ƣ�

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	private int hp;// Ѫ��

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMaxhp(int hp) {
		this.maxhp = hp;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	public void fight() {
		System.out.println(name + "�ó���ĳ�ֵ��ν��в�ɱ");
	}

	public void showMsg(String name, int hp, String skillname) {

		System.out.println("����Ϊ��" + name + "Ѫ����" + hp + "���ܣ�" + skillname);

	}

	public Character() {

	}

	public Character(String name, int hp, int maxhp, String skillname) {

		this.name = name;
		this.hp = hp;
		this.maxhp = maxhp;
		this.skillname = skillname;
	}

	public Character(String name, int maxhp, String skillname) {
		this.name = name;
		this.maxhp = maxhp;
		this.hp = maxhp;
		this.skillname = skillname;
		count++;
		id = count;

	}
  
	
}
