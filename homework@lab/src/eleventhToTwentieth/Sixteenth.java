package eleventhToTwentieth;     //��Ԫ��ټ�
public class Sixteenth {
	public static void main(String[] args) {
		for (int a = 0; a < 20; a++)
			for (int b = 0; b < 34; b++)
				for (int c = 0; c < 100; c++)
					if (c % 3 == 0 && 5 * a + 3 * b + c / 3 == 100 && a + b + c == 100)
						System.out.println("����:" + a + " ĸ��:" + b + " С��:" + c);
	}
}
