package eleventhToTwentieth;
import java.util.Scanner;
public class Fourteenth {    //����ĳ���Ǹ���ĵڼ���
	public static void main(String[] args) {
		System.out.println("�������� �� ��");
		Scanner sc = new Scanner (System.in);
		int year = sc.nextInt();
		int mouth = sc.nextInt();
		int date = sc.nextInt();
		int[] arr = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int days = 0;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			if (mouth <= 2) {
				days = arr[mouth - 1] + date;
			} else {
				days = arr[mouth - 1] + date + 1;
			}
		} else {
			days = arr[mouth - 1] + date;
		}
		for (int i = 0; i < mouth - 1; i++) {
			days += arr[i];
		}
		System.out.println("��" + days + "��");
		sc.close();
	}
}
