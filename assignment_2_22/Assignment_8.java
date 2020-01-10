package assignment_2_22;

import java.util.Scanner;

public class Assignment_8 {

	public static void main(String[] args) {
/*		 8) Given array of string check whether all the elements contains only digits not any alphabets.
			if condition satisfied print 1 else -1.
			Input:{"123","23.14","522"}
			output:1
			Input1:{"asd","123","42.20"}
			output:-1

*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int counter = 0;
		String [] stringArray = new String[size];
		System.out.println("Enter "+size+" elements of an array");
		for(int i=0; i<size; i++)
			stringArray[i] = scanner.next();

		for(int i=0; i<size; i++)
			{
				if(stringArray[i].matches("^[0-9]*\\.?[0-9]+$"))
					counter++; 							
			}
				
		if(size == counter)
			System.out.println("None of Array elements are alphabet: 1");
		else
			System.out.println("Array element/s contains character: -1");
		scanner.close();
	}

}
/*Note:
^         #  the beginning of the string
[0-9]*    #  any character of: '0' to '9' (0 or more times)
\.?       #  '.' (optional)
[0-9]+    #  any character of: '0' to '9' (1 or more times)
$         #  before an optional \n, and the end of the string
*/