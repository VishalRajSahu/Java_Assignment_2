package assignment_2_22;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
/*				input1="abc2012345"
				input2="abc2112660"
				input3=4
			here "abc**" refers to customer id.
			12345 refers to last month eb reading and 12660 refers to this month eb reading
			find the difference between two readings and multiply it by input3
			ie., output=(12660-12345)*4
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter last month electricity bill reading (in Format of abc2012345)");
		String lastReading = scanner.next();
		System.out.println("Enter current month electricity bill reading (in Format of abc2012345)");
		String currentReading = scanner.next();
		System.out.println("Enter unit rate of electricity bill");
		int rate = scanner.nextInt();
		int intLastReading = Integer.parseInt(lastReading.substring(5));
		int intCurrentReading = Integer.parseInt(currentReading.substring(5));
		System.out.println("Total Electricity Bill: "+(intCurrentReading-intLastReading)*rate);
		scanner.close();
	}

}