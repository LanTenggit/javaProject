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
		String lbname="����";
		int lbblood=4;
		String lbskill="�ʵ�";
		String zyname="����";
		int zyblood=4;
		String zyskill="����";
		String ccname="�ܲ�";
		int ccblood=4;
		String ccskill="����";
		
		String xhname="�ĺ";
		int xhblood=4;
		String xhskill="����";
		
		String sqname="��Ȩ";
		int sqblood=4;
		String sqskill="�ƺ�";
		
		String zhyname="���";
		int zhyblood=3;
		String zhyskill="����";
	int i=0;
	System.out.println((++i)+"."+lbname+"\tѪ����"+lbblood+"\t���ܣ�"+lbskill);
	System.out.println((++i)+"."+zyname+"\tѪ����"+zyblood+"\t���ܣ�"+zyskill);
	System.out.println((++i)+"."+ccname+"\tѪ����"+ccblood+"\t���ܣ�"+ccskill);
	System.out.println((++i)+"."+xhname+"\tѪ����"+xhblood+"\t���ܣ�"+xhskill);
	System.out.println((++i)+"."+sqname+"\tѪ����"+sqblood+"\t���ܣ�"+sqskill);
	System.out.println((++i)+"."+zhyname+"\tѪ����"+zhyblood+"\t���ܣ�"+zhyskill);
  System.out.print("������Ҫѡ����佫��ţ�");
  int num=sc.nextInt();
  switch(num){
  case 1:
  	System.out.println("��ѡ����"+lbname+"������Ϸ");
  	break;
  case 2:
  	System.out.println("��ѡ����"+zyname+"������Ϸ");
  	break;
  case 3:
  	System.out.println("��ѡ����"+ccname+"������Ϸ");
  	break;
  case 4:
  	System.out.println("��ѡ����"+xhname+"������Ϸ");
  	break;
  case 5:
  	System.out.println("��ѡ����"+sqname+"������Ϸ");
  	break;
  case 6:
  	System.out.println("��ѡ����"+zhyname+"������Ϸ");
  	break;
  
  }
  System.out.print("��������Ķ��֣����ԣ��佫��ţ�");
  int num1=sc.nextInt();
  switch(num1){
  case 1:
  	System.out.println("����ѡ����"+lbname+"������Ϸ");
  	break;
  case 2:
  	System.out.println("����ѡ����"+zyname+"������Ϸ");
  	break;
  case 3:
  	System.out.println("����ѡ����"+ccname+"������Ϸ");
  	break;
  case 4:
  	System.out.println("����ѡ����"+xhname+"������Ϸ");
  	break;
  case 5:
  	System.out.println("����ѡ����"+sqname+"������Ϸ");
  	break;
  case 6:
  	System.out.println("����ѡ����"+zhyname+"������Ϸ");
  	break;
  
  }
  
  System.out.println("====================================");
  System.out.println("���Ƹ������");
  int j=1;
  while (j<=4) {
	
	System.out.print("[����"+j+"]");
	j++;
}
  System.out.println("");
 System.out.println("���Ƹ�������"); 
 int k=1;
 do {
	
	 System.out.print("[����"+k+"]");
		k++;
	 
} while (k<=4);
 
}
}