package ninthToTenth;

public class Ninth {    //Çó10!
	public static void main(String[] args) {
		float n = 1, i = 1;
		for (i = 1; i <= 10; i++) {
			n *= i;
		}
	System.out.printf("factorial of 10 is:%.6f", n);
	}
}
