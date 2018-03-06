package twenty_firstToThirtieth;

import java.util.Scanner;

public class Twenty_first {     //冒泡排序
	public static void main(String[] args) {
		System.out.println("请输入10个数:");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length -1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
			}
		}
		
		System.out.println("排序后的顺序是:");
		for(int n: arr) {
			System.out.print(n + " ");
		}
		input.close();
	}
}
