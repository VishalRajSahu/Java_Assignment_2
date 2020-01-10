package assignment_2_22;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
/*			4)  Input="xyzwabcd"
			    input_2 = 2;
			    input_3 = 4;
			    output=bawz
*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a strings");
		String inputString = scanner.next();
		StringBuilder revString = new StringBuilder();
		revString.append(inputString);
		revString = revString.reverse();
		
		System.out.println("Enter a position number");
		int position = scanner.nextInt();
		
		System.out.println("Enter number of characters do you want");
		int noOfChar = scanner.nextInt();
		
		char [] charArray = new char[noOfChar];
		
		revString.getChars(position, noOfChar+position, charArray, 0);
		System.out.println(charArray);
		scanner.close();
	}

}
