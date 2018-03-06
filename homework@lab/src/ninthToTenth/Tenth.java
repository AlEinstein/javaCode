package ninthToTenth;
import java.util.Scanner;
public class Tenth {  //三个数从小到大排序
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a,b,c:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (a >= c) {
			int temp = a;
			a = b;
			b = c;
			c = temp;
		} else {
			if (b > c) {
				int temp = b;
				b = c;
				c = temp;
			}
		}
		System.out.println("The order of the number is:");
		System.out.println(a + "," + b + "," + c );
		sc.close();
	}
}
