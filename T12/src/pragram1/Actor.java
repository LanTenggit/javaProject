package pragram1;

import java.util.*;

public class Actor {
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	// 行动者选择武将
	private Character character;

	public Actor() {

	}

	public Actor(Character character) {
		this.character = character;

	}
	private boolean isAttacker;//是否为攻击；
	//检查手中是否有一些杀牌
	private boolean hasSomeKill(){
		
	for (int i = 0; i < handcard.size(); i++) {
		Card card=handcard.get(i);
		if (card.getKey().equals("杀")) {
			return true;
		}
	}	
		
	return false;	
	}

	public String toString() {
		return "武将" + getCharacter().getName() + "，他的血量是："
				+ getCharacter().getHp() + "，技能是："
				+ getCharacter().getSkillname();

	}

	// 储存手牌集合未打出的的牌
	private ArrayList<Card> handcard = new ArrayList<Card>();

	// 初始化的四张牌
	public void giveCard() {
		if (this instanceof Player) {
			System.out.println("发牌给玩家：" + character.getName());
		} else if (this instanceof PlayerAI) {
			System.out.println("发牌给对手：" + character.getName());
			for (int i = 0; i < 4; i++) {
				Card card = Initial.listCard.get(0);
				System.out.println("[手牌" + (i + 1) + "]" + "\t");
				handcard.add(card);
				Initial.listCard.remove(0);
			}
		}
	}

	// 显示手牌信息
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
		System.out.print("玩家摸" + num + "张牌后，");

		for (int i = 0; i < num; i++) {
			Card card = Initial.listCard.get(0);
			handcard.add(card);
            Initial.listCard.remove(0);
		}

	}
	
	
	

}
