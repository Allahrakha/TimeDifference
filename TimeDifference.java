package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDifference {
	
	
	
	public static void main(String[] args)
	{
		try {
			
			
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			Date date = new Date();

			String frmtdDate = dateFormat.format(date);

			System.out.println("frmtdDate: " + frmtdDate);
			
		    String date1 = "26/02/2011";
		    String time1 = "11:00 AM";
		    String date2 = "27/02/2011";
		    String time2 = "12:15 AM";

		    String format = "dd/MM/yyyy hh:mm a";

		    SimpleDateFormat sdf = new SimpleDateFormat(format);

		    Date dateObj1 = sdf.parse(date1 + " " + time1);
		    Date dateObj2 = sdf.parse(date2 + " " + time2);
		    System.out.println(dateObj1);
		    System.out.println(dateObj2);

		    long diff = dateObj2.getTime() - dateObj1.getTime();
		    double diffInHours = diff / ((double) 1000 * 60 * 60);
		    System.out.println(diffInHours);
		    System.out.println("Hours " + (int)diffInHours);
		    System.out.println("Minutes " + (diffInHours - (int)diffInHours)*60 );

		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}

}
