package eleventhToTwentieth;
import java.util.Scanner;
public class Nineteenth {     //ֱ�Ӳ�������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������10������");
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("ԭʼ˳��:");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 2; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	System.out.println("�������������˳��:");
	for(int element : arr){
		System.out.print(element+" ");
		}
	sc.close();
	}
}
