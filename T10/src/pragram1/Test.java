package pragram1;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Actor actor = null;
		Character character = null;
		character = new ShuGuoCharacter("’‘‘∆", 4, "¡˙µ®", 85);
		actor = new Player(character);
		System.out.println(actor);
		character = new WeiGuoCharacter("≤‹≤Ÿ", 4, 45, "ºÈ–€");
		actor = new Player(character);
		System.out.println(actor);
		//character.fight();
		character.showMsg("≤‹≤Ÿ", 4, "ºÈ–€");

		Initial.cardInit();
		Initial.showCard();
		Character caocao = new WeiGuoCharacter("≤‹≤Ÿ", 4, "ºÈ–€");
		Actor player = new Player(caocao);
		player.givCard();
		player.showHandCard();
		
		Map<Integer, Character> allCharacter = new HashMap<Integer, Character>();
		Character zhaoyu = new ShuGuoCharacter("’‘‘∆", 4, "¡˙µ®", 85);
		Character caocao1 = new WeiGuoCharacter("≤‹≤Ÿ", 4, "ºÈ–€");
		Character zhouyu = new WuGuoCharacter("÷‹Ë§", 4, "∑¥º‰");
		allCharacter.put(zhaoyu.getId(), zhaoyu);
		allCharacter.put(caocao1.getId(), caocao1);
		allCharacter.put(zhouyu.getId(), zhouyu);
		Set<Integer>allIds=allCharacter.keySet();
		Iterator<Integer>it=allIds.iterator();
		while(it.hasNext()){
			Integer id=it.next();
			Character c =allCharacter.get(id);
			System.out.println("Œ‰Ω´"+c.getName()+",—™¡ø"+c.getHp()+",ººƒ‹£∫"+c.getSkillname());
			
		}
		
	
	}
	

}
