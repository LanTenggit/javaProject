package pragram1;

import java.util.Scanner;

public class herolist2 {

	/**
	 * @param args
	 */
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
      System.out.println("请输入要选择的武将序号：");
      int num=sc.nextInt();
    if (num==1) {
	
	       System.out.println("你选择了刘备进行游戏");
	
       }
    else if(num==2){
    	   
    	   System.out.println("你选择了赵云进行游戏");
       }
    else if(num==3){
 	   
 	   System.out.println("你选择了曹操进行游戏");
    }
    else if(num==4){
 	   
 	   System.out.println("你选择了夏侯惇进行游戏");
    }
    else if(num==5){
 	   
 	   System.out.println("你选择了孙权进行游戏");
    }
    else if(num==6){
 	   
 	   System.out.println("你选择了周瑜进行游戏");
    }
    System.out.println("请输入你的对手（电脑）武将序号：");
    int num1=sc.nextInt();
    if (num1==1) {
    	
	       System.out.println("对手选择了刘备进行游戏");
	
    }
 else if(num1==2){
 	   
 	   System.out.println("对手选择了赵云进行游戏");
    }
 else if(num1==3){
	   
	   System.out.println("对手选择了曹操进行游戏");
 }
 else if(num1==4){
	   
	   System.out.println("对手选择了夏侯惇进行游戏");
 }
 else if(num1==5){
	   
	   System.out.println("对手选择了孙权进行游戏");
 }
 else if(num1==6){
	   
	   System.out.println("对手选择了周瑜进行游戏");
 }
    
	}

}
