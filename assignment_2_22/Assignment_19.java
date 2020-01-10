package assignment_2_22;

import java.util.Scanner;

public class Assignment_19 {

	public static void main(String[] args) {
/*		19) Take the word with a max length in the given sentence
	 		in that check for vowels if so count the no.of occurrences !
	  		Input  = "Bhavane is a good girl"
	  		Output = 3
	  		Input  = "Bhavanee is a good girl"
	  		Output = 4
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence ");
		String sentence = scanner.nextLine();
		String [] stringArray = sentence.split(" ");
		int maxLength = 0, vowels = 0;
		String longestString = null;
	      for (String str : stringArray) 
	      {
	    	  if (str.length() > maxLength) 
	    	  	{
	    		  	maxLength = str.length();
	    		  	longestString = str;
	    	  	}
	      }
	      System.out.println("Longest Word: "+longestString+"\nMaximum Length: "+maxLength);
	      
	      for(int i=0; i<maxLength; i++)
	      {
	    	  if(longestString.charAt(i) == 'a' || longestString.charAt(i) == 'A'
	    	  || longestString.charAt(i) == 'e' || longestString.charAt(i) == 'E'
			  || longestString.charAt(i) == 'i' || longestString.charAt(i) == 'I'
			  || longestString.charAt(i) == 'o' || longestString.charAt(i) == 'O'
			  || longestString.charAt(i) == 'u' || longestString.charAt(i) == 'U')
						vowels++;
	      }
	      System.out.println("No. of Vowels in '"+longestString+"' :"+vowels);
		
		scanner.close();
	}
}
