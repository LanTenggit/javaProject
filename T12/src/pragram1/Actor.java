package pragram1;

import java.util.*;

public class Actor {
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	// �ж���ѡ���佫
	private Character character;

	public Actor() {

	}

	public Actor(Character character) {
		this.character = character;

	}
	private boolean isAttacker;//�Ƿ�Ϊ������
	//��������Ƿ���һЩɱ��
	private boolean hasSomeKill(){
		
	for (int i = 0; i < handcard.size(); i++) {
		Card card=handcard.get(i);
		if (card.getKey().equals("ɱ")) {
			return true;
		}
	}	
		
	return false;	
	}

	public String toString() {
		return "�佫" + getCharacter().getName() + "������Ѫ���ǣ�"
				+ getCharacter().getHp() + "�������ǣ�"
				+ getCharacter().getSkillname();

	}

	// �������Ƽ���δ����ĵ���
	private ArrayList<Card> handcard = new ArrayList<Card>();

	// ��ʼ����������
	public void giveCard() {
		if (this instanceof Player) {
			System.out.println("���Ƹ���ң�" + character.getName());
		} else if (this instanceof PlayerAI) {
			System.out.println("���Ƹ����֣�" + character.getName());
			for (int i = 0; i < 4; i++) {
				Card card = Initial.listCard.get(0);
				System.out.println("[����" + (i + 1) + "]" + "\t");
				handcard.add(card);
				Initial.listCard.remove(0);
			}
		}
	}

	// ��ʾ������Ϣ
	public void showHandCard() {

		for (Card card : handcard) {
			System.out.println(card.getColor() + card.getNum() + "["
					+ card.getKey() + "]");
		}

	}

	public void fetchCard(int num) {
		giveCard(2);
	}

	public void giveCard(int num) {
		System.out.print("�����" + num + "���ƺ�");

		for (int i = 0; i < num; i++) {
			Card card = Initial.listCard.get(0);
			handcard.add(card);
            Initial.listCard.remove(0);
		}

	}
	
	
	

}
