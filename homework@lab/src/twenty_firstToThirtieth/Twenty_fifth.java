package twenty_firstToThirtieth;

import java.util.Scanner;

public class Twenty_fifth {      //二分查找
    public static void search(int m, int a[], int head, int end) {
    	int number = 1;
		int index = (head + end) / 2;
		if(head < end) {
			number++;
			if(m == a[index]) {
				System.out.println("查找成功!");
				System.out.println("共查找了" + number + "次!" + "a[" + number + "]" + "=" + m);
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
		System.out.println("请输入数组的长度:");
		int n = input.nextInt();
		int[] a = new int[n];
		System.out.println("请输入数组元素:");
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("请输入你想查找的元素:");
		int num = input.nextInt();
		search(num, a, 0, n - 1);
		input.close();
	}
}
//11 13 18 28 39 56 69 89 98 122
