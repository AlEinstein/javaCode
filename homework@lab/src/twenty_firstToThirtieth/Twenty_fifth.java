package twenty_firstToThirtieth;

import java.util.Scanner;

public class Twenty_fifth {      //���ֲ���
    public static void search(int m, int a[], int head, int end) {
    	int number = 1;
		int index = (head + end) / 2;
		if(head < end) {
			number++;
			if(m == a[index]) {
				System.out.println("���ҳɹ�!");
				System.out.println("��������" + number + "��!" + "a[" + number + "]" + "=" + m);
			} else {
				if(m > a[index]) {
					search(m, a, index + 1, end);
				}
				if(m < a[index]) {
					search(m, a, head, index - 1);
				}
			}
		}
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������ĳ���:");
		int n = input.nextInt();
		int[] a = new int[n];
		System.out.println("����������Ԫ��:");
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("������������ҵ�Ԫ��:");
		int num = input.nextInt();
		search(num, a, 0, n - 1);
		input.close();
	}
}
//11 13 18 28 39 56 69 89 98 122
