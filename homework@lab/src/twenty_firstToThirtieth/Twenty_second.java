package twenty_firstToThirtieth;
import java.util.Scanner;

public class Twenty_second {     //快速排序
	public static void qusort(int arr[], int start, int end) {
		
		int temp = arr[start];    //设定为基准值
		
		if (start > end) {
			return;
		}
		int i = start; 
		int j = end;
		while(i < j) {
			while (i < j && arr[j] > temp) {
				j--;  //哨兵j左移至arr[j] <= temp时停止
			}
			while (i < j && arr[i] < temp) {
				i++;   //哨兵i右移至arr[j] >= temp时停止 
			}
			int a = arr[i];   //arr[i] 与 arr[j] 互换
			arr[i] = arr[j];
			arr[j] = a;
		}
		
		if (i == j) {   //i, j 哨兵相遇时, 该数与基准值互换
			int num = temp;
			temp = arr[i];
			arr[i] = num;
			end = i;
	}
	qusort(arr, start, i - 1);
	qusort(arr, i + 1, end);
	}
	
	public static void main(String[] args) {
		System.out.println("请输入10个数:");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		qusort(arr, 0, 9);
		
		System.out.println("排序后顺序:");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}	
		input.close();
	}
}
