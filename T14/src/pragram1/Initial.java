package pragram1;

import java.util.*;

public class Initial {
	public static String[][] wujiangArray = new String[6][3];
	public static Player player = null;

	public static void StartGame() {

		System.out.println("========��ӭ�������������ɱ=======");
		Initial.line();
		System.out.println("����ɱ��һ��������Ϊ����������");

		System.out.println("���������ɱ��һ����JAVA�����Ŀ���̨��Ϸ����");
		System.out.println("===========================================");
		System.out.println("-----�佫�б�-------");

		wujiangArray[0][0] = "����";
		wujiangArray[0][1] = "4";
		wujiangArray[0][2] = "�ʵ�";

		wujiangArray[1][0] = "����";
		wujiangArray[1][1] = "4";
		wujiangArray[1][2] = "����";

		wujiangArray[2][0] = "�ܲ�";
		wujiangArray[2][1] = "4";
		wujiangArray[2][2] = "����";

		wujiangArray[3][0] = "�ĺ";
		wujiangArray[3][1] = "4";
		wujiangArray[3][2] = "����";

		wujiangArray[4][0] = "��Ȩ";
		wujiangArray[4][1] = "4";
		wujiangArray[4][2] = "�ƺ�";

		wujiangArray[5][0] = "���";
		wujiangArray[5][1] = "3";
		wujiangArray[5][2] = "����";

		wujiangArray[0][0] = "����";
		wujiangArray[0][1] = "4";
		wujiangArray[0][2] = "�ʵ�";

		Character[] characters = new Character[6];
		for (int i = 0; i < characters.length; i++) {
			characters[i] = new Character();
			characters[i].setName(wujiangArray[i][0]);
			characters[i].setMaxhp(Integer.parseInt(wujiangArray[i][1]));
			characters[i].setSkillname(wujiangArray[i][2]);
		}
		for (int i = 0; i < characters.length; i++) {
			System.out.println((i + 1) + "." + wujiangArray[i][0] + "\t"
					+ "Ѫ����" + wujiangArray[i][1] + "\t" + "���ܣ�"
					+ wujiangArray[i][2]);
		}

	}

	public static void line() {

		System.out.println("=====================================");

	}

	public static Actor[] selectwujiang() {
      Actor[]actors=new Actor[2];
		Initial.line();
		System.out.println("������Ҫѡ����佫��ţ�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Actor player=new Player(wujiang[num-1]);
		System.out.println("���ѡ����"+player.getCharacter().getName()+"������Ϸ");
		System.out.println("========================================");
		System.out.println("���������Ķ��֣����ԣ��佫��ţ�");
		sc = new Scanner(System.in);
		num = sc.nextInt();
		Actor playerAI=new PlayerAI(wujiang[num-1]);
		System.out.println("����ѡ����"+player.getCharacter().getName()+"������Ϸ");
		actors[0]=player;
		actors[1]=playerAI;
		return actors;
		
//		
//		for (int i = 0; i < wujiangArray.length; i++) {
//			if ((i + 1) == num) {
//				Character character = new Character();
//				character.setName(wujiangArray[i][0]);
//				character.setMaxhp(Integer.parseInt(wujiangArray[i][1]));
//				character.setSkillname(wujiangArray[i][2]);
//				// ��ʼ�����
//
//				player = new Player(character);
//				player.setCharacter(character);
//				player.setType("���");
//				player.setHp(character.getMaxhp());
//				System.out.println(player.getType() + "ѡ����"
//						+ player.getCharacter().getName() + "������Ϸ");
//
//			}
//		}

	}

	// �������飬��104
	public static Card[] card = new Card[104];

	// ���Ƽ���
	public static List<Card> listCard = new ArrayList<Card>();

	// ���Ƴ�ʼ��
	public static void cardInit() {
		for (int i = 0; i < 104; i++) {

			card[i] = new Card();
			if (i < 42) {
				card[i].key = "ɱ";
			} else if (i < 42 * 2) {
				card[i].key = "��";
			} else {
				card[i].key = "��";
			}
		}

		int tmp = 0;
		for (int k = 0; k < 2; k++) {// ������ѭ��
			for (int i = 0; i < 13; i++) {// ����ֵѭ��
				for (int j = 0; j < 4; j++) {// ��ɫѭ��
					switch (j) {
					case 0:
						card[tmp].setColor("����");
						break;
					case 1:
						card[tmp].setColor("����");
						break;
					case 2:
						card[tmp].setColor("÷��");
						break;
					case 3:
						card[tmp].setColor("����");
						break;
					}
					switch (i) {
					case 0:
						card[tmp].setNum("A");
						break;
					case 10:
						card[tmp].setNum("J");
						break;
					case 11:
						card[tmp].setNum("Q");
						break;
					case 12:
						card[tmp].setNum("K");
						break;
					default:
						card[tmp].setNum(java.lang.Integer.toString(i + 1));
						break;
					}
					listCard.add(card[j]);
					tmp++;
				}

			}
		}

		for (int i = 0; i < card.length; i++) {

			Random r = new Random();
			int index = r.nextInt(card.length);
			listCard.add(card[index]);
		}
	}

	public static void showCard() {

		for (Card card : listCard) {
			System.out.println(card.getColor() + card.getNum() + "["
					+ card.getKey() + "]");
		}

	}

	static Character[] wujiang = { new ShuGuoCharacter("����", 4, "�ʵ�", 98),
			new ShuGuoCharacter("����", 4, "����", 85),
			new WeiGuoCharacter("�ܲ�", 4, "����"),
			new WeiGuoCharacter("�ĺ", 4, "����"),
			new WuGuoCharacter("��Ȩ", 4, "�ƺ�"),
			new WuGuoCharacter("���", 4, "����")

	};

	public static void showwujiang() {

		System.err.println("�佫�б�");
		for (int i = 0; i < wujiang.length; i++) {
			System.out.print(i + 1 + "." + wujiang[i].getName() + ",Ѫ����"
					+ wujiang[i].getHp() + ",���ܣ�" + wujiang[i].getSkillname());
			if (wujiang[i] instanceof ShuGuoCharacter) {
				ShuGuoCharacter shuGuoCharacter = (ShuGuoCharacter) wujiang[i];
				System.out.print(",���壺" + shuGuoCharacter.getEmotion());
			}

			System.out.println();

		}
	}

}
