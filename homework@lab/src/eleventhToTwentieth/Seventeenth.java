package eleventhToTwentieth;

import math.Days;
import java.util.Scanner;

public class Seventeenth {  //打渔晒网问题
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年 月 日");
		int year = input.nextInt();
		int month = input.nextInt();
		int days = input.nextInt();
		
		int day = Days.days(year, month, days);
		if (day % 5 == 1 || day % 5 == 2 || day % 5 == 3) {
			System.out.print(year + "-" + month + "-" + days);
			System.out.println("打渔");
		} else {
			System.out.print(year + "-" + month + "-" + days);
			System.out.println("晒网");
		}
		input.close();
	} 
}
