package eleventhToTwentieth;
import java.util.Scanner;
public class Thirteenth {      //任意次方后的最后三位
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数, x和 y(x^y)");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 1;
		for (int i = 0; i < y; i++) {
			sum *= x;
		}
		if (sum < 100) {
			System.out.println("error! please input a number not less than 100!");
		} else {
			int a = (int) (sum % 1000);
			a = a / 100;
			int b = (int) (sum % 100);
			b = b / 10;
			int c = (int) (sum % 10);
			System.out.print(x + "^" + y + "的最后三位是:");
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
		}
		sc.close();
	}
}
