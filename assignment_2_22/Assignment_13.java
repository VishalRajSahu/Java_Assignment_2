package assignment_2_22;

import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) {
/*		13) count the number of times the second word in second string occurs in first string-case sensitive
			input1 = hai hello hai where hai Hai;
			input2 = what hai
			output = 3;
*/
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter first string");
		String firstString = scanner.nextLine();
		String  stringArray[] = firstString.split(" "); 
		
		System.out.println("Enter second string");
		String secondString = scanner.nextLine();
		
		String secondWord = secondString.split("\\s+")[1];
		//Alternate of second word
		//String secondWord = secondString.substring(secondString.indexOf(" "));
		System.out.println("Searching Word: "+secondWord);
		
		for(int i=0; i<stringArray.length; i++)
		{
			if(secondWord.equals(stringArray[i]))
				counter++;				
		}
		System.out.println("No. of occurenece of word '"+secondWord+"' is: "+counter);
		
		scanner.close();
	}

}
