package pragram1;

public class PlayerAI extends Actor{
	
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
	private String type="对手";
  
	public PlayerAI(Character character){
		  super(character);
	}
 //重写父类Actor
    
    public String toString(){
    	return "对手选择了"+super.toString();
  }
    

}
