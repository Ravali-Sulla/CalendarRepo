/*
  Simple Java Calendar Example to display current date and time. 
*/

package calendarapp;
import java.util.Calendar;
public class SimpleCalendar {
	public static void main(String[] args) {
	    
	    //use getInstance() method to get object of java Calendar class
	    Calendar cal = Calendar.getInstance();
	    
	    //use getTime() method of Calendar class to get date and time
	    System.out.println("Today is : " + cal.getTime());   
	  }
	

}
