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
	System.out.println(getName()+"�ó���ɽ�ص��ν��в�ɱ");
	
	
}

public ShuGuoCharacter(String name,int hp,int maxhp,String jineng){
	super(name,hp,maxhp,jineng);
	
}

public ShuGuoCharacter(String name,int hp,int maxhp,String jineng,int emotion ){
this(name,hp,maxhp,jineng);
this.emotion=emotion;
}
}