package pragram1;

public class Player extends Actor {
	
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	private Character  character;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	private int hp;
	private String type="���";
  
	public Player(Character character){
	  super(character);
}
 //��д����Actor
    
    public String toString(){
    	return "���ѡ����"+super.toString();
  }
    

}
