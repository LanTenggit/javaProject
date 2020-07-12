package pragram1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Actor actor=null;
		Character character=null;
		character=new ShuGuoCharacter("’‘‘∆", 4,"¡˙µ®",85);
		actor=new Player(character);
		System.out.println(actor);
		character =new WeiGuoCharacter("≤‹≤Ÿ", 4,45,"ºÈ–€");
		actor=new Player(character);
		System.out.println(actor);
		character.fight();
		character.showMsg("≤‹≤Ÿ", 4, "ºÈ–€");
	}

}
