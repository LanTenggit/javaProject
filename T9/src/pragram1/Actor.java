package pragram1;

public class Actor {
public Character getCharacter() {
	return character;
}
public void setCharacter(Character character) {
	this.character = character;
}
private Character character;
public Actor(){
	
}
public Actor(Character character){
	this.character=character;
	
}


public String toString(){
	return "�佫"+getCharacter().getName()+"������Ѫ���ǣ�" +
			""+getCharacter().getHp()+"�������ǣ�"+getCharacter().getSkillname();
	
	
}
	
}
