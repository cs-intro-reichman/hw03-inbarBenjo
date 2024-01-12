public class Calendar {


public static void main(String[] args)
{

int year = Integer.parseInt(args[0]);
int lastyear = year -1 ; 
System.out.println(advanceAll(lastyear)) ;
advance(lastyear, year);


}

 private static void advance(int lastyear, int year) 
 { 
	  int dayweek = advanceAll(lastyear) + 1 ;
	 /* not good, didn't need so many for loops, see official solution*/
      for (int countYear = year; countYear <= year; countYear++)
       {

           for ( int countMonth=1; countMonth <=12; countMonth++)
           {
                for ( int countDay = 1; countDay <= nDaysInMonth(countMonth, countYear); countDay++ )
                {
                       if (dayweek == 1)
                       {
                         System.out.println(countDay +"/"+ countMonth + "/" + countYear + " Sunday");
                       }
                       else {
                        	System.out.println(countDay +"/"+ countMonth + "/" + countYear);
                       }

                       if (dayweek <7)
                       {
                       	   dayweek ++; 
                       }
                          else
                          {
                          	dayweek =1; 
                          }                                          
                }
                	
           }
       }
   }

 	 public static int advanceAll(int lastyear) 
	 { 

	  int dayweek = 2;
       /* copy-past , big no-no in programming*/
       for (int countYear = 1900; countYear <= lastyear; countYear++)
       {
           for ( int countMonth=1; countMonth <=12; countMonth++)
           {
                for ( int countDay = 1; countDay <= nDaysInMonth(countMonth, countYear); countDay++ )
                {
                       if (dayweek <7)
                       {
                       	   dayweek ++; 
                       }
                          else
                          {
                          	dayweek =1; 
                          }                                                
                }
           }
       }
       return dayweek; 

	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	     boolean theYearIs;
         theYearIs= ((year%400)== 0);
         theYearIs= theYearIs || (((year%4)==0) && ((year%100) != 0));
		 return theYearIs;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int num = 0; 
		if ( month == 4 || month ==6 || month == 11 || month == 9 )
		{
			num = 30; 
		}
		   else 
		   {
             if ( month == 2)
             {
             	if ( isLeapYear(year) == true)
             	{
                    num = 29; 
             	}
             	else {
             		num = 28; 
             	}
             }
                 else {
             	   num = 31;
                }

		   }
		return num;
	}
}
