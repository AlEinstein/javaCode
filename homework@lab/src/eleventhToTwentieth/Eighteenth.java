package eleventhToTwentieth;
import java.util.Scanner;
public class Eighteenth {      //判断三角形的类型
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		if (a + b > c && a + c > b && c + b > a ) {
			float s = (a + b + c) / 2;         //海伦公式
			float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));   //java.lang.Math.sqrt(double a) 返回正确舍入的一个double值的正平方根
			System.out.printf("面积是:%f\n", area);
		}
		if (a == b && b == c) {
			System.out.println("等边三角形");
		}
		if (a == b || a == c || b == c) {
			System.out.println("等腰三角形");
		}
		if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
			System.out.println("直角三角形");
		sc.close();
	}
}
