package pragram1;

public class Herolist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("����ɱ��һ��������Ϊ����������");

		    System.out.println("���������ɱ��һ����JAVA�����Ŀ���̨��Ϸ����");	
			System.out.println("===========================================");	
			System.out.println("-----�佫�б�-------");
		
      Character lb=new Character();
		lb.setName("����");
		lb.setMaxhp(4);
		 Character zy=new Character();
			zy.setName("����");
			zy.setMaxhp(4);
	 Character cc=new Character();
		cc.setName("�ܲ�");
		cc.setMaxhp(4);
		
		 Character xh=new Character();
			xh.setName("�ĺ");
			xh.setMaxhp(4);
		 Character sq=new Character();
				sq.setName("��Ȩ");
				sq.setMaxhp(4);
		 Character zhy=new Character();
		    zhy.setName("���");
		   zhy.setMaxhp(3);
		   int i=0;
		   System.out.println(++i+"."+lb.getName()+"\t"+"Ѫ����" +lb.getMaxhp()+"\t"+"���ܣ��ʵ�");
		   System.out.println(++i+"."+zy.getName()+"\t"+"Ѫ����"  +zy.getMaxhp()+"\t"+"���ܣ�����");
		   System.out.println(++i+"."+cc.getName()+"\t"+"Ѫ����"  +cc.getMaxhp()+"\t"+"���ܣ�����");
		   System.out.println(++i+"."+xh.getName()+"\t" +"Ѫ����" +xh.getMaxhp()+"\t"+"���ܣ�����");
		   System.out.println(++i+"."+sq.getName()+"\t" +"Ѫ����" +sq.getMaxhp()+"\t"+"���ܣ��ƺ�");
		   System.out.println(++i+"."+zhy.getName()+"\t"+"Ѫ����"  +zhy.getMaxhp()+"\t"+"���ܣ�����");
	}

}
