package assignment_2_22;

import java.util.Scanner;

public class Assignment_18 {

	public static void main(String[] args) {
/*			18) String str = "a very fine day"
				Output : A Very Fine Day
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence ");
		String sentence = scanner.nextLine();
		char charArray[] = sentence.toCharArray(); 
        for (int i = 0; i < sentence.length(); i++) 
        { 
             if (i == 0 && charArray[i] != ' ' || charArray[i] != ' ' && charArray[i - 1] == ' ') 
            { 
                if (charArray[i] >= 'a' && charArray[i] <= 'z') 
                	{ 
                	charArray[i] = (char)(charArray[i] - 'a' + 'A'); 
                    } 
            } 
            else if (charArray[i] >= 'A' && charArray[i] <= 'Z')  
            	charArray[i] = (char)(charArray[i] + 'a' - 'A');             
        } 
        System.out.println("Sentence Case: ");
        for (int i = 0; i < sentence.length(); i++)
        	System.out.print(charArray[i]);
		scanner.close();
	}

}
