import java.util.Scanner;


public class program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������һ���������еĶ�ά���飬Ҫ��̬������6�����ִ��������У���Ҫ������ÿ��һά����֮�Ͳ������
		System.out.println("��������������");
		int[][]a=new int[3][2];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				 a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = 0; j < a[i].length; j++) {
			sum+=a[i][j];
			}
			System.out.println(sum);
		}
		
		
		
        
	}

}
