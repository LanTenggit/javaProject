package pragram1;

public class ShuGuoCharacter extends Character {
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	private int emotion;
public void fight(){
	System.out.println(getName()+"擅长于山地地形进行搏杀");
	
	
}

public ShuGuoCharacter(String name,int hp,int maxhp,String jineng){
	super(name,hp,maxhp,jineng);
	
}

public ShuGuoCharacter(String name,int hp,int maxhp,String jineng,int emotion ){
this(name,hp,maxhp,jineng);
this.emotion=emotion;
}
}