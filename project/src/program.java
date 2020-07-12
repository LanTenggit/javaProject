import java.util.Scanner;


public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数值长度");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]str=new int[n];
		for (int i = 0; i < str.length; i++) {
			str[i]=sc.nextInt();
		}
		
for (int i = 0; i < str.length-1; i++) {
	for (int j = 0; j < str.length-i-1; j++) {
	if (str[j]>str[j+1]) {
		int a=0;
		a=str[j];
		str[j]=str[j+1];
		str[j+1]=a;
	}
		
	}
	
	
}
for (int b=0 ;b<str.length;b++) {
		System.out.println(str[b]);
	}
	}

}







