package pragram1;

import java.util.Scanner;

public class herolist4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	  System.out.println("����ɱ��һ��������Ϊ����������");

	    System.out.println("���������ɱ��һ����JAVA�����Ŀ���̨��Ϸ����");	
		System.out.println("===========================================");	
		System.out.println("-----�佫�б�-------");
		Scanner sc=new Scanner(System.in);
		//String strText=sc.next();
		String [][]wujiang={{"����","4","�ʵ�"},{"����","4","����"},{"�ܲ�","4","����"},
				{"�ĺ","4","����"},{"��Ȩ","4","�ƺ�"},{"���","3","����"},};
		for (int i = 0; i < wujiang.length; i++) {
			System.out.println((++i)+"."+wujiang[i][0]+"\tѪ����"
					+wujiang[i][1]+"\t���ܣ�"+wujiang[i][2]);
		}
		
  System.out.print("������Ҫѡ����佫��ţ�");
  int num=sc.nextInt();
  
 String playname="";
 int playblood=4;

 for (int i = 0; i < wujiang.length; i++) {
	if (i+1==num) {
		System.out.println("��ѡ����"+wujiang[i][0]+"������Ϸ");
	}
}
 
 System.out.println("������ֱ�ţ�"); 
 
 int num1=sc.nextInt();
 for (int i = 0; i < wujiang.length; i++) {
	if (i+1==num1) {
		System.out.println("����ѡ��"+wujiang[i][0]+"������Ϸ");
	}
}
  
  String [][]cardarray=new String[104][2] ;
 
  for (int l = 0; l < 104; l++) {
 	if (l<42) {
 		if (l<21) {
 			cardarray[l][0]="���һ���";
		}
 		else{
 			cardarray[l][0]="��÷����";
 			
 		}
 		cardarray[l][1]="ɱ";
 	}
 	else if(l<42*2){
 		cardarray[l][0]="�����飩";
 		cardarray[l][1]="��";
 	}
 	else if(l<104){
 		cardarray[l][0]="�����ң�";
 		cardarray[l][1]="��";
 	}
 }
  
  
  System.out.println("====================================");
  System.out.println("���Ƹ������");
  int j=1;
  while (j<=4) {
	int ran=(int)(Math.random()*104);
	System.out.print("[����"+j+"]:"+cardarray[ran][0]+cardarray[ran][1]+"\t");
	j++;
}
  System.out.println("");
 System.out.println("���Ƹ�������"); 
 int k=1;
 do {
	 int ran=(int)(Math.random()*104);
		System.out.print("[����"+j+"]:"+cardarray[ran][0]+cardarray[ran][1]+"\t");
		k++;
	 
} while (k<=4);
 

 
 
}
}