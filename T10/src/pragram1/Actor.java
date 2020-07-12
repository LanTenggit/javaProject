package pragram1;
import java.util.*;
public class Actor {
public Character getCharacter() {
	return character;
}
public void setCharacter(Character character) {
	this.character = character;
}
//行动者选择武将
private Character character;
public Actor(){
	
}
public Actor(Character character){
	this.character=character;
	
}


public String toString(){
	return "武将"+getCharacter().getName()+"，他的血量是：" +
			getCharacter().getHp()+"，技能是："+getCharacter().getSkillname();
	
	
}
//储存手牌集合未打出的的牌
private ArrayList<Card>hashcard=new ArrayList<Card>();

//初始化的四张牌
public void givCard(){
	if (this instanceof Player) {
		System.out.println("发牌给玩家："+character.getName());
	}else if (this instanceof PlayerAI) {
		System.out.println("发牌给对手："+character.getName());
		for (int i = 0; i < 4; i++) {
			Card card=Initial.listCard.get(0);
			System.out.println("[手牌"+(i+1)+"]"+"\t");
			hashcard.add(card);
			Initial.listCard.remove(0);
		}
	}
}
//显示手牌信息
public void showHandCard(){
	
	for ( Card card :hashcard ) {
		System.out.println(card.getColor()+card.getNum()+"["+card.getKey()+"]");
	}
	
	
}
}
