package pragram1;
import java.util.*;
public class Actor {
public Character getCharacter() {
	return character;
}
public void setCharacter(Character character) {
	this.character = character;
}
//�ж���ѡ���佫
private Character character;
public Actor(){
	
}
public Actor(Character character){
	this.character=character;
	
}


public String toString(){
	return "�佫"+getCharacter().getName()+"������Ѫ���ǣ�" +
			getCharacter().getHp()+"�������ǣ�"+getCharacter().getSkillname();
	
	
}
//�������Ƽ���δ����ĵ���
private ArrayList<Card>hashcard=new ArrayList<Card>();

//��ʼ����������
public void givCard(){
	if (this instanceof Player) {
		System.out.println("���Ƹ���ң�"+character.getName());
	}else if (this instanceof PlayerAI) {
		System.out.println("���Ƹ����֣�"+character.getName());
		for (int i = 0; i < 4; i++) {
			Card card=Initial.listCard.get(0);
			System.out.println("[����"+(i+1)+"]"+"\t");
			hashcard.add(card);
			Initial.listCard.remove(0);
		}
	}
}
//��ʾ������Ϣ
public void showHandCard(){
	
	for ( Card card :hashcard ) {
		System.out.println(card.getColor()+card.getNum()+"["+card.getKey()+"]");
	}
	
	
}
}
