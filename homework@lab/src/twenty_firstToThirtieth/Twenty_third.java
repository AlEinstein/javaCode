package twenty_firstToThirtieth;

import java.util.Scanner;

public class Twenty_third {     //ѡ������
	public static void main(String[] args) {
		System.out.println("������10����:");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}	
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("������˳����:");
		for(int n: arr) {
			System.out.print(n + " ");
		}
		input.close();
	}
}
