package pragram1;

public class MyPet {
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	private String food;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name; 
	public MyPet(String name,String food){
		this.food=food;
		this.name=name;
		
	}
	public MyPet(){
		
		
	}
	
	
  public void eat(int i){
		
		System.out.println(name+"ÿ���"+i+"�ͷ�");
		
	}
  public void eat(String food){
		
		System.out.println(name+"ϲ����"+food);
		
	}



}
