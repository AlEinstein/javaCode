package twenty_firstToThirtieth;

import java.util.Scanner;
public class Twenty_fourth {     //�鲢����
	public static void sort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("������10����:");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		sort(arr);
		System.out.println("������˳��:");
		for (int a: arr) {
			System.out.print(a + " ");
		}
		input.close();
	}
}
//695 458 362 789 12 15 163 23 2 986