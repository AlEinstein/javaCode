package eleventhToTwentieth;
import java.util.Scanner;

public class Twentieth {
	public static void main(String[] args) {      //ϣ������
		
		System.out.println("������10����:");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		
		int half = arr.length;
		while (half >= 1) {
			for (int i = 2; i < arr.length; i++) {
				int temp = arr[i];
				for (int j = 0; j < i; j++) {
					if (arr[j] > arr[i]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				half = half / 2;
			}
		}
		
		System.out.println("������˳����:");
		for (int n: arr) {     //����arr�ı������
			System.out.print(n + " ");
		}
		input.close();
	}
}
