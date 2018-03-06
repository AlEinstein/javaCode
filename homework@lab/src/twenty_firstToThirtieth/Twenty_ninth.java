package twenty_firstToThirtieth;

public class Twenty_ninth {          //¸çµÂ°ÍºÕ²ÂÏë
	public static int judge(int i) {
		int flag = 0;
		if(i <= 1) {
			flag = 0;
		}
		if(i == 2) {
			flag = 1;
		}
		for(int j = 2; j < i; j++) {
			if(i % j == 0) {
				flag = 0;
			}
			else if(i != j + 1) {
				continue;
			} else {
				flag = 1;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int n = 0;
		for(int i = 4; i < 100; i += 2) {
			for (int k = 2; k <= i / 2; k++) {
				int j = i - k;
				if (judge(k) == 1) {
					if (judge(j) == 1) {
						System.out.printf("%3d=%3d+%3d", i, k, j);
						n++;
						if(n % 5 == 0) {
							System.out.println();
						}
					}
				}
			}
			System.out.println();
		}
	}

}
