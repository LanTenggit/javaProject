package pragram1;

 public abstract class Character {

	  
	    private String skillname;
		private String name;
		private int maxhp;//人物血量的上限，文3武4；
		private boolean skipUseCard;//是否跳过出牌；
		public void setHp(int hp) {
			this.hp = hp;
		}
		public int getHp() {
			return hp;
		}
		private int hp;//血量
		
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
      public String getSkillname(){
			return skillname;
		}
    public void setSkillname(String skillname){
			this.skillname=skillname;
		}
   public void fight(){
	   System.out.println(name+"擅长于某种地形进行搏杀");
   }
   public void showMsg(  String name,int hp,String skillname){
	 
	   System.out.println("名字为："+name+"血量："+hp+"技能："+skillname); 
	   
	   
   }
   
   public Character(){
	   
   }
 public Character(String name,int hp,int maxhp,String skillname){
	  
	 
	 this.name=name;
	 this.hp=hp;
	 this.maxhp=maxhp;
	 this.skillname=skillname;
   }
   
		
	}


