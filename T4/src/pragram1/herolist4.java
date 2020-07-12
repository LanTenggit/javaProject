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
		String [][]wujiang={{"刘备","4","仁德"},{"赵云","4","龙胆"},{"曹操","4","奸雄"},
				{"夏侯惇","4","刚烈"},{"孙权","4","制衡"},{"周瑜","3","反间"},};
		for (int i = 0; i < wujiang.length; i++) {
			System.out.println((++i)+"."+wujiang[i][0]+"\t血量："
					+wujiang[i][1]+"\t技能："+wujiang[i][2]);
		}
		
  System.out.print("请输入要选择的武将序号：");
  int num=sc.nextInt();
  
 String playname="";
 int playblood=4;

 for (int i = 0; i < wujiang.length; i++) {
	if (i+1==num) {
		System.out.println("你选择了"+wujiang[i][0]+"进行游戏");
	}
}
 
 System.out.println("输入对手编号："); 
 
 int num1=sc.nextInt();
 for (int i = 0; i < wujiang.length; i++) {
	if (i+1==num1) {
		System.out.println("对手选择"+wujiang[i][0]+"进行游戏");
	}
}
  
  String [][]cardarray=new String[104][2] ;
 
  for (int l = 0; l < 104; l++) {
 	if (l<42) {
 		if (l<21) {
 			cardarray[l][0]="（桃花）";
		}
 		else{
 			cardarray[l][0]="（梅花）";
 			
 		}
 		cardarray[l][1]="杀";
 	}
 	else if(l<42*2){
 		cardarray[l][0]="（方块）";
 		cardarray[l][1]="闪";
 	}
 	else if(l<104){
 		cardarray[l][0]="（红桃）";
 		cardarray[l][1]="逃";
 	}
 }
  
  
  System.out.println("====================================");
  System.out.println("发牌给：玩家");
  int j=1;
  while (j<=4) {
	int ran=(int)(Math.random()*104);
	System.out.print("[卡牌"+j+"]:"+cardarray[ran][0]+cardarray[ran][1]+"\t");
	j++;
}
  System.out.println("");
 System.out.println("发牌给：对手"); 
 int k=1;
 do {
	 int ran=(int)(Math.random()*104);
		System.out.print("[卡牌"+j+"]:"+cardarray[ran][0]+cardarray[ran][1]+"\t");
		k++;
	 
} while (k<=4);
 

 
 
}
}