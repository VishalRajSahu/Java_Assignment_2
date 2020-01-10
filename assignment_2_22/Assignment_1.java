package assignment_2_22;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
/*		1) compare two strings, if the characters in string 1 are present in
	   	   string 2, then it should be put as such in output, else '+' should be
	       put in output...ignore case difference.
				input 1:"New York"
				input 2:"NWYR"
				output:N+w+Y+r+
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings");
		String string_1 = scanner.nextLine();
		String string_2 = scanner.nextLine();
		String outputString = "";
		
		for(int i=0; i<string_1.length(); i++)
			{ 	int flag = 0;
				for(int j=0; j<string_2.length(); j++)
				{
					if(Character.toLowerCase(string_1.charAt(i)) == Character.toLowerCase(string_2.charAt(j)))
						flag = 1;					
				}
				if(flag == 1)
					outputString += string_1.charAt(i);
				else
					outputString += "+";
			}
		System.out.println("Output String: "+outputString);
		scanner.close();
	}

}
