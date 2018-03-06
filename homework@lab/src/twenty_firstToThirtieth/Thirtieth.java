package twenty_firstToThirtieth;

import java.util.Scanner;
public class Thirtieth {       //尼科彻斯定理
@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("请输入一个数:");
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		int input = scan.nextInt();
		int sum = input * input * input;
		System.out.println(input + "*" + input + "*" + input 
				+ "=" + sum + "=" +getResult(input));
		}
}
		
	public static String getResult(int n) {    //获取展开式的函数
		int a = n * n - n + 1;
		StringBuffer sb = new StringBuffer();
		sb.append(a);
		for(int i = 1;i < n;i++) {
			a = a + 2;
			sb = sb.append("+").append(a);
		}
		return sb.toString();
	}
//	public static void main(String[] args) {
//		System.out.println("请输入一个数:");
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		long m = n * n * n;
//		long i = m / 2;   //判断奇偶
//		if(i % 2 == 0) {   //当i为偶数时i值加1
//			i += 1;
//		}
//		int flag;
//		while(flag == 1 && i >= 1) {
//			int sum = 0;
//			int k = 0;
//			while() {
//				sum += (i - 2 * k);
//				k++;
//				if(sum == m) {
//					System.out.println(n + "*" + n + "*" + n + "=" + m + "=");
//				for(int l = 0; l < k - 1; l++) {
//					System.out.println(i - 1 * 2 + "+");
//				}
//				System.out.print(i - (k - 1) * 2);
//				flag = 0;
//				break;
//				}
//				if(sum > m) {
//					break;
//				}
//				i -= 2;
//			}
//		}
//		input.close();
//	}
}
