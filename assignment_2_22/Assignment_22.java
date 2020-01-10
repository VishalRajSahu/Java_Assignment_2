package assignment_2_22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment_22 {

	public static void main(String[] args) throws ParseException {
/*		22) Number of days in a month in specific year
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter current date in Format(dd/MM/yyyy)");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = scanner.next();
		Date date = dateFormat.parse(dateString);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		
		boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0);
		
				if(month == 2)
					{
						if(isLeapYear)
							System.out.println("29 Days");
						else
							System.out.println("28 Days");
					}
				else if(month == 4 || month == 6 || month == 9 || month == 11)
					System.out.println("30 Days");
				else 
					System.out.println("31 Days");
			
		scanner.close();
	}
}
