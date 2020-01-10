package assignment_2_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_12 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
/*		12) arraylist1={ 1,2,3,4,5}
	    	arraylist2={ 6,7,8,9,10}
			size of both list should be same 
			output={6,2,8,4,10}
*/
		
		Assignment_12 classObject = new Assignment_12();
		System.out.println("Enter the size of array list");
		int size = scanner.nextInt();
		ArrayList<Integer> firstArrayList = new ArrayList<Integer>(size);
		ArrayList<Integer> secondArrayList = new ArrayList<Integer>(size);
		
		
		System.out.println("Enter "+size+" elements of first array list");
		classObject.addElements(firstArrayList, size);
		
		System.out.println("Enter "+size+" elements of second array list");
		classObject.addElements(secondArrayList, size);
		
		System.out.println("Array List 1:  "+firstArrayList);
		System.out.println("Array List 2:  "+secondArrayList);
		
		System.out.println("Output: ");
		for(int i=0; i<size; i++)
		{
			if(i%2 != 0)
				secondArrayList.set(i, firstArrayList.get(i));
		}
		System.out.println(secondArrayList);
		
	}
	public void addElements(ArrayList<Integer> arraylist, int size)
	{
		for(int i=0; i<size; i++)
			arraylist.add(scanner.nextInt());
	}
}
