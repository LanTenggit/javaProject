package pragram1;

public class WeiGuoCharacter extends Character {
	public int getEmotion() {
		return emotion;
	}

	public void setEmotion(int emotion) {
		this.emotion = emotion;
	}

	private int emotion;

	public void fight() {
		System.out.println(getName() + "�ó���ƽԭ���ν��в�ɱ");

	}

	public WeiGuoCharacter(String name, int hp, int maxhp, String skillname) {
		super(name, hp, maxhp, skillname);

	}
	public WeiGuoCharacter(String name,int maxhp,String skillname){
		setName(name);
		setMaxhp(maxhp);
		setHp(maxhp);
		setSkillname(skillname);
		
	}
	

}
