import java.util.Scanner;


public class program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二、定义一个三行两列的二维数组，要求动态的输入6个数字存入数组中，并要求计算出每行一维数组之和并输出。
		System.out.println("请输入六个数字");
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
