package pragram1;

public class ShuGuoCharacter extends Character {
	
	public int getEmotion() {
		return emotion;
	}
	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}
	private int emotion;//����
public void fight(){
	System.out.println(getName()+"�ó���ɽ�ص��ν��в�ɱ");
	
	
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
	System.out.println("����Ϊ��"+name+"Ѫ����"+maxhp+"���ܣ�"+skillname); 
	   
	   
}









}