package eleventhToTwentieth;
import java.util.Scanner;
public class Eighteenth {      //�ж������ε�����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		if (a + b > c && a + c > b && c + b > a ) {
			float s = (a + b + c) / 2;         //���׹�ʽ
			float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));   //java.lang.Math.sqrt(double a) ������ȷ�����һ��doubleֵ����ƽ����
			System.out.printf("�����:%f\n", area);
		}
		if (a == b && b == c) {
			System.out.println("�ȱ�������");
		}
		if (a == b || a == c || b == c) {
			System.out.println("����������");
		}
		if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
			System.out.println("ֱ��������");
		sc.close();
	}
}
