package pragram1;

import java.util.Scanner;

public class herolist4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	  System.out.println("三国杀是一款以三国为背景的桌游");

	    System.out.println("迷你版三国杀是一款以JAVA开发的控制台游戏程序");	
		System.out.println("===========================================");	
		System.out.println("-----武将列表-------");
		Scanner sc=new Scanner(System.in);
		//String strText=sc.next();
		String lbname="刘备";
		int lbblood=4;
		String lbskill="仁德";
		String zyname="赵云";
		int zyblood=4;
		String zyskill="龙胆";
		String ccname="曹操";
		int ccblood=4;
		String ccskill="奸雄";
		
		String xhname="夏侯惇";
		int xhblood=4;
		String xhskill="刚烈";
		
		String sqname="孙权";
		int sqblood=4;
		String sqskill="制衡";
		
		String zhyname="周瑜";
		int zhyblood=3;
		String zhyskill="反间";
	int i=0;
	System.out.println((++i)+"."+lbname+"\t血量："+lbblood+"\t技能："+lbskill);
	System.out.println((++i)+"."+zyname+"\t血量："+zyblood+"\t技能："+zyskill);
	System.out.println((++i)+"."+ccname+"\t血量："+ccblood+"\t技能："+ccskill);
	System.out.println((++i)+"."+xhname+"\t血量："+xhblood+"\t技能："+xhskill);
	System.out.println((++i)+"."+sqname+"\t血量："+sqblood+"\t技能："+sqskill);
	System.out.println((++i)+"."+zhyname+"\t血量："+zhyblood+"\t技能："+zhyskill);
  System.out.print("请输入要选择的武将序号：");
  int num=sc.nextInt();
  switch(num){
  case 1:
  	System.out.println("你选择了"+lbname+"进行游戏");
  	break;
  case 2:
  	System.out.println("你选择了"+zyname+"进行游戏");
  	break;
  case 3:
  	System.out.println("你选择了"+ccname+"进行游戏");
  	break;
  case 4:
  	System.out.println("你选择了"+xhname+"进行游戏");
  	break;
  case 5:
  	System.out.println("你选择了"+sqname+"进行游戏");
  	break;
  case 6:
  	System.out.println("你选择了"+zhyname+"进行游戏");
  	break;
  
  }
  System.out.print("请输入你的对手（电脑）武将序号：");
  int num1=sc.nextInt();
  switch(num1){
  case 1:
  	System.out.println("对手选择了"+lbname+"进行游戏");
  	break;
  case 2:
  	System.out.println("对手选择了"+zyname+"进行游戏");
  	break;
  case 3:
  	System.out.println("对手选择了"+ccname+"进行游戏");
  	break;
  case 4:
  	System.out.println("对手选择了"+xhname+"进行游戏");
  	break;
  case 5:
  	System.out.println("对手选择了"+sqname+"进行游戏");
  	break;
  case 6:
  	System.out.println("对手选择了"+zhyname+"进行游戏");
  	break;
  
  }
  
  System.out.println("====================================");
  System.out.println("发牌给：玩家");
  int j=1;
  while (j<=4) {
	
	System.out.print("[卡牌"+j+"]");
	j++;
}
  System.out.println("");
 System.out.println("发牌给：对手"); 
 int k=1;
 do {
	
	 System.out.print("[卡牌"+k+"]");
		k++;
	 
} while (k<=4);
 
}
}