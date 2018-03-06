package eleventhToTwentieth;
public class Fifteenth {      //婚礼上的谎言
	public static void main(String[] args) {
		for(char i='X';i<='Z';i++)
			for(char j='X';j<='Z';j++) {
				for(char k = 'X'; k <= 'Z'; k++)
					if(i != 'X' && k != 'X' && k != 'Z' && i != k && j != k && i != j) {
						System.out.println(i + " 将嫁给  A");
						System.out.println(j + " 将嫁给  B");
						System.out.println(k + " 将嫁给  C");
						}
				}
		}
}

				
