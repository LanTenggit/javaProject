package pragram1;

public class Herolist2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("����ɱ��һ��������Ϊ����������");

		    System.out.println("���������ɱ��һ����JAVA�����Ŀ���̨��Ϸ����");	
			System.out.println("===========================================");	
			System.out.println("-----�佫�б�-------");
			String [][]wujiangArray=new String[6][3]; 
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
				characters[i].setJineng(wujiangArray[i][2]);
			}
			for (int i = 0; i < characters.length; i++) {
				System.out.println((i+1)+"."+wujiangArray[i][0]+"\t"+"Ѫ����"+wujiangArray[i][1]+"\t"+"���ܣ�"+wujiangArray[i][2]);
			}
			
			
			
			
			
	}

}
