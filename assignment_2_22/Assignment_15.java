package assignment_2_22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment_15 {

	public static void main(String[] args) throws ParseException {
/*		 15) What will be the DAY of current date in next year
*/
			
			Scanner scanner = new Scanner(System.in);
			SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Enter current date (in Format of dd/MM/yyyy)");
			Date date = dateFormatter.parse(scanner.next());
			Calendar calender_date = Calendar.getInstance();
			calender_date.setTime(date);
			
			int year = calender_date.get(Calendar.YEAR)+1;
			int day = calender_date.get(Calendar.DAY_OF_WEEK);
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			System.out.println("DAY of current date in next year");
			if(isLeapYear)
				{
					day += 2;
					System.out.println("Day of Week: "+getDayName(day));
				}
			else
				{
					day += 1;
					System.out.println("Day of Week: "+getDayName(day));
				}
			scanner.close();
	}

	private static String getDayName(int dayofWeek) 
	{
		String dayName = null;
		switch (dayofWeek % 7)
		{
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 0:
			dayName = "Saturday";
			break;
		}
		return dayName;
	}
}
