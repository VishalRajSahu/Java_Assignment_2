package assignment_2_22;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
/*		2) input:
				Searchstring s1="GeniusRajkumarDev";
				String s2="Raj";
				String s3="Dev";
   		   output:
        		Return 1 if s2 comes before s3 in searchstring else return 2
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a main string");
		String searchString = scanner.next();
		System.out.println("Enter first string to be search in main string");
		String string_1 = scanner.next();
		System.out.println("Enter second string to be search in main string");
		String string_2 = scanner.next();
		int flag = 0;
		if(searchString.indexOf(string_1) < searchString.indexOf(string_2))
			flag = 1;
		else
			flag = 2;
		System.out.println(flag);
		
		scanner.close();
	}

}
