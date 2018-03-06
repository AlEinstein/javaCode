package eleventhToTwentieth;
public class Eleventh {    //ºï×Ó³ÔÌÒ
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[9] = 1;
		for (int n = 9; n > 0; n--) {
			arr[n - 1] = 2 * (arr[n] + 1);
		}
		System.out.println("the total is " + arr[0]);
	}
}
