package pragram1;

public class Herolist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("三国杀是一款以三国为背景的桌游");

		    System.out.println("迷你版三国杀是一款以JAVA开发的控制台游戏程序");	
			System.out.println("===========================================");	
			System.out.println("-----武将列表-------");
		
      Character lb=new Character();
		lb.setName("刘备");
		lb.setMaxhp(4);
		 Character zy=new Character();
			zy.setName("赵云");
			zy.setMaxhp(4);
	 Character cc=new Character();
		cc.setName("曹操");
		cc.setMaxhp(4);
		
		 Character xh=new Character();
			xh.setName("夏侯惇");
			xh.setMaxhp(4);
		 Character sq=new Character();
				sq.setName("孙权");
				sq.setMaxhp(4);
		 Character zhy=new Character();
		    zhy.setName("周瑜");
		   zhy.setMaxhp(3);
		   int i=0;
		   System.out.println(++i+"."+lb.getName()+"\t"+"血量：" +lb.getMaxhp()+"\t"+"技能：仁德");
		   System.out.println(++i+"."+zy.getName()+"\t"+"血量："  +zy.getMaxhp()+"\t"+"技能：龙胆");
		   System.out.println(++i+"."+cc.getName()+"\t"+"血量："  +cc.getMaxhp()+"\t"+"技能：奸雄");
		   System.out.println(++i+"."+xh.getName()+"\t" +"血量：" +xh.getMaxhp()+"\t"+"技能：刚烈");
		   System.out.println(++i+"."+sq.getName()+"\t" +"血量：" +sq.getMaxhp()+"\t"+"技能：制衡");
		   System.out.println(++i+"."+zhy.getName()+"\t"+"血量："  +zhy.getMaxhp()+"\t"+"技能：反间");
	}

}
