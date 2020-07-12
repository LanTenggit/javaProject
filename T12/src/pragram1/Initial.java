package pragram1;

import java.util.*;

public class Initial {
	public static String[][] wujiangArray = new String[6][3];
	public static Player player = null;

	public static void StartGame() {

		System.out.println("========欢迎来到迷你版三国杀=======");
		Initial.line();
		System.out.println("三国杀是一款以三国为背景的桌游");

		System.out.println("迷你版三国杀是一款以JAVA开发的控制台游戏程序");
		System.out.println("===========================================");
		System.out.println("-----武将列表-------");

		wujiangArray[0][0] = "刘备";
		wujiangArray[0][1] = "4";
		wujiangArray[0][2] = "仁德";

		wujiangArray[1][0] = "赵云";
		wujiangArray[1][1] = "4";
		wujiangArray[1][2] = "龙胆";

		wujiangArray[2][0] = "曹操";
		wujiangArray[2][1] = "4";
		wujiangArray[2][2] = "奸雄";

		wujiangArray[3][0] = "夏侯惇";
		wujiangArray[3][1] = "4";
		wujiangArray[3][2] = "刚烈";

		wujiangArray[4][0] = "孙权";
		wujiangArray[4][1] = "4";
		wujiangArray[4][2] = "制衡";

		wujiangArray[5][0] = "周瑜";
		wujiangArray[5][1] = "3";
		wujiangArray[5][2] = "反间";

		wujiangArray[0][0] = "刘备";
		wujiangArray[0][1] = "4";
		wujiangArray[0][2] = "仁德";

		Character[] characters = new Character[6];
		for (int i = 0; i < characters.length; i++) {
			characters[i] = new Character();
			characters[i].setName(wujiangArray[i][0]);
			characters[i].setMaxhp(Integer.parseInt(wujiangArray[i][1]));
			characters[i].setSkillname(wujiangArray[i][2]);
		}
		for (int i = 0; i < characters.length; i++) {
			System.out.println((i + 1) + "." + wujiangArray[i][0] + "\t"
					+ "血量：" + wujiangArray[i][1] + "\t" + "技能："
					+ wujiangArray[i][2]);
		}

	}

	public static void line() {

		System.out.println("=====================================");

	}

	public static Actor[] selectwujiang() {
      Actor[]actors=new Actor[2];
		Initial.line();
		System.out.println("请输入要选择的武将序号：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Actor player=new Player(wujiang[num-1]);
		System.out.println("玩家选择了"+player.getCharacter().getName()+"进行游戏");
		System.out.println("========================================");
		System.out.println("请输入您的对手（电脑）武将序号：");
		sc = new Scanner(System.in);
		num = sc.nextInt();
		Actor playerAI=new PlayerAI(wujiang[num-1]);
		System.out.println("对手选择了"+player.getCharacter().getName()+"进行游戏");
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
//				// 初始化玩家
//
//				player = new Player(character);
//				player.setCharacter(character);
//				player.setType("玩家");
//				player.setHp(character.getMaxhp());
//				System.out.println(player.getType() + "选择了"
//						+ player.getCharacter().getName() + "进行游戏");
//
//			}
//		}

	}

	// 卡牌数组，共104
	public static Card[] card = new Card[104];

	// 卡牌集合
	public static List<Card> listCard = new ArrayList<Card>();

	// 卡牌初始化
	public static void cardInit() {
		for (int i = 0; i < 104; i++) {

			card[i] = new Card();
			if (i < 42) {
				card[i].key = "杀";
			} else if (i < 42 * 2) {
				card[i].key = "闪";
			} else {
				card[i].key = "桃";
			}
		}

		int tmp = 0;
		for (int k = 0; k < 2; k++) {// 两副牌循环
			for (int i = 0; i < 13; i++) {// 牌面值循环
				for (int j = 0; j < 4; j++) {// 花色循环
					switch (j) {
					case 0:
						card[tmp].setColor("黑桃");
						break;
					case 1:
						card[tmp].setColor("红桃");
						break;
					case 2:
						card[tmp].setColor("梅花");
						break;
					case 3:
						card[tmp].setColor("方块");
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

	static Character[] wujiang = { new ShuGuoCharacter("刘备", 4, "仁德", 98),
			new ShuGuoCharacter("关羽", 4, "龙胆", 85),
			new WeiGuoCharacter("曹操", 4, "奸雄"),
			new WeiGuoCharacter("夏侯惇", 4, "刚烈"),
			new WuGuoCharacter("孙权", 4, "制衡"),
			new WuGuoCharacter("周瑜", 4, "反间")

	};

	public static void showwujiang() {

		System.err.println("武将列表");
		for (int i = 0; i < wujiang.length; i++) {
			System.out.print(i + 1 + "." + wujiang[i].getName() + ",血量："
					+ wujiang[i].getHp() + ",技能：" + wujiang[i].getSkillname());
			if (wujiang[i] instanceof ShuGuoCharacter) {
				ShuGuoCharacter shuGuoCharacter = (ShuGuoCharacter) wujiang[i];
				System.out.print(",情义：" + shuGuoCharacter.getEmotion());
			}

			System.out.println();

		}
	}

}
