package assignment_2_22;

import java.util.Scanner;

public class Assignment_20 {

	public static void main(String[] args) {
/*		20) for the given string display the middle 2 value, 
			case satisfies only if string is of even length.
			Input: java
			Output: av
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String of Even Length");
		String string = scanner.next();
		int length = string.length();
		if(length % 2 == 0)
			{
				System.out.println("Middle two characters: "+string.substring((length/2)-1, (length/2)+1));
			}
		else
			System.out.println("Entered String is not of Even Length");
		
		scanner.close();
	}

}
