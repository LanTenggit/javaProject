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
		character = new ShuGuoCharacter("����", 4, "����", 85);
		actor = new Player(character);
		System.out.println(actor);
		character = new WeiGuoCharacter("�ܲ�", 4, 45, "����");
		actor = new Player(character);
		System.out.println(actor);
		//character.fight();
		character.showMsg("�ܲ�", 4, "����");

		Initial.cardInit();
		Initial.showCard();
		Character caocao = new WeiGuoCharacter("�ܲ�", 4, "����");
		Actor player = new Player(caocao);
		player.givCard();
		player.showHandCard();
		
		Map<Integer, Character> allCharacter = new HashMap<Integer, Character>();
		Character zhaoyu = new ShuGuoCharacter("����", 4, "����", 85);
		Character caocao1 = new WeiGuoCharacter("�ܲ�", 4, "����");
		Character zhouyu = new WuGuoCharacter("���", 4, "����");
		allCharacter.put(zhaoyu.getId(), zhaoyu);
		allCharacter.put(caocao1.getId(), caocao1);
		allCharacter.put(zhouyu.getId(), zhouyu);
		Set<Integer>allIds=allCharacter.keySet();
		Iterator<Integer>it=allIds.iterator();
		while(it.hasNext()){
			Integer id=it.next();
			Character c =allCharacter.get(id);
			System.out.println("�佫"+c.getName()+",Ѫ��"+c.getHp()+",���ܣ�"+c.getSkillname());
			
		}
		
	
	}
	

}
