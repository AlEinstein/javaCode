package twenty_firstToThirtieth;
import java.util.Scanner;

public class Twenty_second {     //��������
	public static void qusort(int arr[], int start, int end) {
		
		int temp = arr[start];    //�趨Ϊ��׼ֵ
		
		if (start > end) {
			return;
		}
		int i = start; 
		int j = end;
		while(i < j) {
			while (i < j && arr[j] > temp) {
				j--;  //�ڱ�j������arr[j] <= tempʱֹͣ
			}
			while (i < j && arr[i] < temp) {
				i++;   //�ڱ�i������arr[j] >= tempʱֹͣ 
			}
			int a = arr[i];   //arr[i] �� arr[j] ����
			arr[i] = arr[j];
			arr[j] = a;
		}
		
		if (i == j) {   //i, j �ڱ�����ʱ, �������׼ֵ����
			int num = temp;
			temp = arr[i];
			arr[i] = num;
			end = i;
	}
	qusort(arr, start, i - 1);
	qusort(arr, i + 1, end);
	}
	
	public static void main(String[] args) {
		System.out.println("������10����:");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		qusort(arr, 0, 9);
		
		System.out.println("�����˳��:");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}	
		input.close();
	}
}
