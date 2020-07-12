package pragram1;

public class ShuGuoCharacter extends Character {
	
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	private int emotion;//情义
public void fight(){
	System.out.println(getName()+"擅长于山地地形进行搏杀");
	
	
}

public ShuGuoCharacter(String name,int maxhp,String skillname){
	setName(name);
	setMaxhp(maxhp);
	setHp(maxhp);
	setSkillname(skillname);
	
}

public ShuGuoCharacter(String name,int maxhp,String skillname,int emotion ){
this(name,maxhp,skillname);
this.emotion=emotion;
}

public void showMsg(  String  name,int maxhp,String skillname){
	setName(name);
	setMaxhp(maxhp);
	setHp(maxhp);
	setSkillname(skillname);
	System.out.println("名字为："+name+"血量："+maxhp+"技能："+skillname); 
	   
	   
}









}