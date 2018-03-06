package math;

public class Days {
	private int year;
	private int month;
	private int date;
	
	public Days() {}
	
	public static int days(int year, int month, int date) {
		int[][] arr = new int[][] {{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30}
									, {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30}};
		
		int days = 0;
		int record = 0;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			record = 1;
		} else {
			record = 0;
		}
		
		for (int i = 1; i < month; i++) {
			days += arr[record][i];
		}
		return days;
	}
}
