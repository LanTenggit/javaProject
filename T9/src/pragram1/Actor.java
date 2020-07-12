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
	return "武将"+getCharacter().getName()+"，他的血量是：" +
			""+getCharacter().getHp()+"，技能是："+getCharacter().getSkillname();
	
	
}
	
}
