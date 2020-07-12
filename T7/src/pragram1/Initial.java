package pragram1;

public class Initial {
public static	String [][]wujiangArray=new String[6][3]; 
public static play player=null;
	public static void StartGame(){
		 
		System.out.println("========欢迎来到迷你版三国杀=======");
		Initial.line();
	    System.out.println("三国杀是一款以三国为背景的桌游");

	    System.out.println("迷你版三国杀是一款以JAVA开发的控制台游戏程序");	
		System.out.println("===========================================");	
		System.out.println("-----武将列表-------");
		
		wujiangArray[0][0]="刘备";
		wujiangArray[0][1]="4";
		wujiangArray[0][2]="仁德";
		
		wujiangArray[1][0]="赵云";
		wujiangArray[1][1]="4";
		wujiangArray[1][2]="龙胆";
		
		wujiangArray[2][0]="曹操";
		wujiangArray[2][1]="4";
		wujiangArray[2][2]="奸雄";
		
		wujiangArray[3][0]="夏侯惇";
		wujiangArray[3][1]="4";
		wujiangArray[3][2]="刚烈";
		
		wujiangArray[4][0]="孙权";
		wujiangArray[4][1]="4";
		wujiangArray[4][2]="制衡";
		
		wujiangArray[5][0]="周瑜";
		wujiangArray[5][1]="3";
		wujiangArray[5][2]="反间";
		
		wujiangArray[0][0]="刘备";
		wujiangArray[0][1]="4";
		wujiangArray[0][2]="仁德";
		
		Character [] characters=new Character[6]; 
		for (int i = 0; i < characters.length; i++) {
			characters[i]=new Character();
			characters[i].setName(wujiangArray[i][0]);
			characters[i].setMaxhp(Integer.parseInt(wujiangArray[i][1]));
			characters[i].setJineng(wujiangArray[i][2]);
		}
		for (int i = 0; i < characters.length; i++) {
			System.out.println((i+1)+"."+wujiangArray[i][0]+"\t"+"血量："+wujiangArray[i][1]+"\t"+"技能："+wujiangArray[i][2]);
		}
		
		
		
}
	
	public static void line(){
		
		System.out.println("=====================================");
		
		
	}

}
