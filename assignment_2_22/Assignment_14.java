package assignment_2_22;

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) {
/*		14) find the no.of characters,that has repeated 3 consecutive times
			input = "aaabbccc"
			output = 2;
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.next();
		System.out.println("How many Consecutive Character Do You Want");
		int cons_Char = scanner.nextInt();
		int flag = 0, counter = 0;
		
		for(int i=1; i<string.length(); i++)
		{
			if(string.charAt(i) == string.charAt(i-1))
				counter++;
			else
			{
				if(counter == cons_Char-1)
					flag++;
				counter = 0;
			}
			if(counter == cons_Char-1 && i == string.length()-1)
			flag++;
		}
		System.out.println("No. of Times Repeated "+cons_Char+" Consecutive Characters "+flag);
		scanner.close();
	}
}
