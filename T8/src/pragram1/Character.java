package pragram1;

public class Character {

	  
	    private String jineng;
		private String name;
		private int maxhp;//����Ѫ�������ޣ���3��4��
		private boolean skipUseCard;//�Ƿ��������ƣ�
		public void setHp(int hp) {
			this.hp = hp;
		}
		public int getHp() {
			return hp;
		}
		private int hp;//Ѫ��
		
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
   public void fight(){
	   System.out.println(name+"�ó���ĳ�ֵ��ν��в�ɱ");
	   
	   
   }
   public Character(){
	   
   }
 public Character(String name,int hp,int maxhp,String jineng){
	  
	 
	 this.name=name;
	 this.hp=hp;
	 this.maxhp=maxhp;
	 this.jineng=jineng;
   }
   
		
	}


