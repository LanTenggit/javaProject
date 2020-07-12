package pragram1;

public class WuGuoCharacter extends Character{
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	private int emotion;
public void fight(){
	System.out.println(getName()+"擅长于水域地形进行搏杀");
	
	
}

public WuGuoCharacter(String name,int hp,int maxhp,String skillname){
	super(name,hp,maxhp,skillname);
	
}

public WuGuoCharacter(String name,int hp,int maxhp,String skillname,int emotion ){
this(name,hp,maxhp,skillname);
this.emotion=emotion;
}

}
