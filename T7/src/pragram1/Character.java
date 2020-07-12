package pragram1;

public class Character {

	  
	    private String jineng;
		private String name;
		private int maxhp;//人物血量的上限，文3武4；
		private boolean skipUseCard;//是否跳过出牌；
		public String getName(){
			return name;
		}
       public void setName(String name){
			this.name= name;
		}
       public int getMaxhp(){
			return maxhp;
		}
      public void setMaxhp(int hp){
			this.maxhp=hp;
		}
      public String getJineng(){
			return jineng;
		}
    public void setJineng(String jineng){
			this.jineng=jineng;
		}
   
		
	}


