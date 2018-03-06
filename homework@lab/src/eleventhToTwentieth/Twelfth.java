package eleventhToTwentieth;

public class Twelfth {    //ÑôÑôÂòÆ»¹û
	public static void main(String[] args) {
		int[] arr = new int[100];
		arr[0] = 2;
		float sum = (float)0.8 * arr[0];
		for (int n = 1; ; n++) {
			arr[n] = 2 * arr[n - 1];
			if (arr[n] > 100) {
				float average = sum / n;
				System.out.println("The result is " + average);
				break;
			}
			sum += (float) 0.8 * arr[n];
		}
	}
}
