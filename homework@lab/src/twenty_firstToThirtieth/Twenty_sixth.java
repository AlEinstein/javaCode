package twenty_firstToThirtieth;

import java.util.Scanner;

public class Twenty_sixth {      //�ֿ����
	public Twenty_sixth() {
		int key;
		int start;
		int end;
	}
	
	public static void main(String[] args) {
		System.out.println("������15����:");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[15];
		for(int i = 0; i < 15; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("��������Ҫ���ҵ�Ԫ��:");
		int number = input.nextInt();
		
		Twenty_sixth index = new Twenty_sixth();
		for (int a: arr) {
			System.out.print(a + " ");
		}
		input.close();
	}
}
//11 12 18 28 39 56 69 89 96 122 135 146 156 256 298