package assignment_2_22;

import java.util.Scanner;

public class Assignment_10 {

	public static void main(String[] args) {
/*		10) Given an array find the largest 'span'(span is the number of elements between two same digits)
    		find their sum.
			a[]={1,4,2,1,4,1,5}
			Largest span=5
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int span = 0;
		int [] intArray = new int[size];
		System.out.println("Enter "+size+" elements of an array");
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<size; i++)
			{	
				for(int j=0; j<size; j++)
					{
						if(i != j)
						{
							if(intArray[i] == intArray[j])
							{
								if(j-i > span)
								span = j-i;
							}
						}		
					}	
			}
		
		System.out.println("Maximum Span: "+span);
		scanner.close();
	}

}