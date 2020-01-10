package assignment_2_22;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment_3 {

	
	public static void main(String[] args) throws ParseException {
/*		3)  months between two dates
*/
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter First Date in Format of dd/MM/yyyy");
	    Date firstDate = dateFormatter.parse(scanner.next());
	    System.out.println("Enter Second Date in Format of dd/MM/yyyy");
	    Date secondDate = dateFormatter.parse(scanner.next());
	    //getYear and getMonth method depreciated
//	    int yearDifference, monthDifference;
//	    yearDifference = Math.abs(secondDate.getYear() - firstDate.getYear());
//	    monthDifference = Math.abs(yearDifference * 12 + (secondDate.getMonth() - firstDate.getMonth()));
//	    System.out.println("Months between two dates:  "+monthDifference);
   
		
        Calendar calender_date1 = Calendar.getInstance();
        Calendar calender_date2 = Calendar.getInstance();
        int yearDifference = 0; 
        int monthDifference = 0;
         
          	  calender_date1.setTime(firstDate);
              calender_date2.setTime(secondDate);
              yearDifference = calender_date2.get(Calendar.YEAR) - calender_date1.get(Calendar.YEAR);
              monthDifference = (yearDifference*12) + (calender_date2.get(Calendar.MONTH)) - ((calender_date1.get(Calendar.MONTH)));
              
        System.out.println("Months between two dates:  "+monthDifference);
	
	    scanner.close();
	}

}
