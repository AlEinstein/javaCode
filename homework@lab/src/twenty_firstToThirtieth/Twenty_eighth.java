package twenty_firstToThirtieth;

public class Twenty_eighth {      //ì³²¨ÄÇÆõÊıÁĞ
	public static void main(String[] args) {
		int[] arr = new int[30];
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2; i < 30; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for(int a: arr) {
			System.out.printf("%6d\t", a);
			if (a % 5 == 0) {
				System.out.println();
			}
		}
	}
}
