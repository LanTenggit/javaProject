package pragram1;

import java.util.Scanner;

public class Initial {
public static	String [][]wujiangArray=new String[6][3]; 
public static Player player=null;
	public static void StartGame(){
		 
		System.out.println("========��ӭ�������������ɱ=======");
		Initial.line();
	    System.out.println("����ɱ��һ��������Ϊ����������");

	    System.out.println("���������ɱ��һ����JAVA�����Ŀ���̨��Ϸ����");	
		System.out.println("===========================================");	
		System.out.println("-----�佫�б�-------");
		
		wujiangArray[0][0]="����";
		wujiangArray[0][1]="4";
		wujiangArray[0][2]="�ʵ�";
		
		wujiangArray[1][0]="����";
		wujiangArray[1][1]="4";
		wujiangArray[1][2]="����";
		
		wujiangArray[2][0]="�ܲ�";
		wujiangArray[2][1]="4";
		wujiangArray[2][2]="����";
		
		wujiangArray[3][0]="�ĺ";
		wujiangArray[3][1]="4";
		wujiangArray[3][2]="����";
		
		wujiangArray[4][0]="��Ȩ";
		wujiangArray[4][1]="4";
		wujiangArray[4][2]="�ƺ�";
		
		wujiangArray[5][0]="���";
		wujiangArray[5][1]="3";
		wujiangArray[5][2]="����";
		
		wujiangArray[0][0]="����";
		wujiangArray[0][1]="4";
		wujiangArray[0][2]="�ʵ�";
		
		Character [] characters=new Character[6]; 
		for (int i = 0; i < characters.length; i++) {
			characters[i]=new Character();
			characters[i].setName(wujiangArray[i][0]);
			characters[i].setMaxhp(Integer.parseInt(wujiangArray[i][1]));
			characters[i].setSkillname(wujiangArray[i][2]);
		}
		for (int i = 0; i < characters.length; i++) {
			System.out.println((i+1)+"."+wujiangArray[i][0]+"\t"+"Ѫ����"+wujiangArray[i][1]+"\t"+"���ܣ�"+wujiangArray[i][2]);
		}
		
		
		
}
	
	public static void line(){
		
		System.out.println("=====================================");
		
		
	}
	
	public static void selectwujiang(){
		
		Initial.line();
		
		System.out.println("������Ҫѡ����佫��ţ�");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 0; i < wujiangArray.length; i++) {
			if((i+1)==num){
				Character character=new Character();
				character.setName(wujiangArray[i][0]);
				character.setMaxhp(Integer.parseInt(wujiangArray[i][1]));
				character.setSkillname(wujiangArray[i][2]);
				//��ʼ�����
				
			 player=new Player(character);
			player.setCharacter(character);
			player.setType("���");
			player.setHp(character.getMaxhp());
			System.out.println(player.getType()+"ѡ����"+player.getCharacter().getName()+"������Ϸ");
			
			}
		}
		
		
	}

}