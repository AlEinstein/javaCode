package eleventhToTwentieth;
public class Fifteenth {      //�����ϵĻ���
	public static void main(String[] args) {
		for(char i='X';i<='Z';i++)
			for(char j='X';j<='Z';j++) {
				for(char k = 'X'; k <= 'Z'; k++)
					if(i != 'X' && k != 'X' && k != 'Z' && i != k && j != k && i != j) {
						System.out.println(i + " ���޸�  A");
						System.out.println(j + " ���޸�  B");
						System.out.println(k + " ���޸�  C");
						}
				}
		}
}

				
