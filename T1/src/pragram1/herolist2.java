package pragram1;

import java.util.Scanner;

public class herolist2 {

	/**
	 * @param args
	 */
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
      System.out.println("������Ҫѡ����佫��ţ�");
      int num=sc.nextInt();
    if (num==1) {
	
	       System.out.println("��ѡ��������������Ϸ");
	
       }
    else if(num==2){
    	   
    	   System.out.println("��ѡ�������ƽ�����Ϸ");
       }
    else if(num==3){
 	   
 	   System.out.println("��ѡ���˲ܲٽ�����Ϸ");
    }
    else if(num==4){
 	   
 	   System.out.println("��ѡ�����ĺ������Ϸ");
    }
    else if(num==5){
 	   
 	   System.out.println("��ѡ������Ȩ������Ϸ");
    }
    else if(num==6){
 	   
 	   System.out.println("��ѡ������褽�����Ϸ");
    }
    System.out.println("��������Ķ��֣����ԣ��佫��ţ�");
    int num1=sc.nextInt();
    if (num1==1) {
    	
	       System.out.println("����ѡ��������������Ϸ");
	
    }
 else if(num1==2){
 	   
 	   System.out.println("����ѡ�������ƽ�����Ϸ");
    }
 else if(num1==3){
	   
	   System.out.println("����ѡ���˲ܲٽ�����Ϸ");
 }
 else if(num1==4){
	   
	   System.out.println("����ѡ�����ĺ������Ϸ");
 }
 else if(num1==5){
	   
	   System.out.println("����ѡ������Ȩ������Ϸ");
 }
 else if(num1==6){
	   
	   System.out.println("����ѡ������褽�����Ϸ");
 }
    
	}

}
