public class CalendarStuff {

  /**
   * A listing of the days of the week, assigning numbers; Note that the week arbitrarily starts on Sunday
   */
   private static final int SUNDAY    = 0;
   private static final int MONDAY    = SUNDAY    + 1;
   private static final int TUESDAY   = MONDAY    + 1;
   private static final int WEDNESDAY = TUESDAY   + 1;
   private static final int THURSDAY  = WEDNESDAY + 1;
   private static final int FRIDAY    = THURSDAY  + 1;
   private static final int SATURDAY  = FRIDAY    + 1;
  // you can finish the rest on your own
  
  /**
   * A listing of the months of the year, assigning numbers; I suppose these could be ENUMs instead, but whatever
   */
   private static final int JANUARY    = 0;
   private static final int FEBRUARY   = JANUARY   + 1;
   private static final int MARCH      = FEBRUARY  + 1;
   private static final int APRIL      = MARCH     + 1;
   private static final int MAY        = APRIL     + 1;
   private static final int JUNE       = MAY       + 1;
   private static final int JULY       = JUNE      + 1;
   private static final int AUGUST     = JULY      + 1;
   private static final int SEPTEMBER  = AUGUST    + 1;
   private static final int OCTOBER    = SEPTEMBER + 1;
   private static final int NOVEMBER   = OCTOBER   + 1;
   private static final int DECEMBER   = NOVEMBER  + 1;
  // you can finish these on your own, too
  
  /**
   * An array containing the number of days in each month
   *  NOTE: this excludes leap years, so those will be handled as special cases
   *  NOTE: this is optional, but suggested
   */
   private static int[]    days        = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   private static int[] intdaysineachmonth =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /**
   * The constructor for the class
   */
   public class CalendarStuff() {
      System.out.println if ((int[2] == int 29) ? true : false);  
   }

  /**
   * A method to determine if the year argument is a leap year or not<br />
   *  Leap years are every four years, except for even-hundred years, except for every 400
   * @param    year  long containing four-digit year
   * @return         boolean which is true if the parameter is a leap year
   */
   public static boolean isLeapYear( long year ) {
       system.out,println if (CalendarStuff() == yes)? leap year : not a leap year
      

  /**
   * A method to calculate the days in a month, including leap years
   * @param    month long containing month number, starting with "1" for "January"
   * @param    year  long containing four-digit year; required to handle Feb 29th
   * @return         long containing number of days in referenced month of the year
   * notes: remember that the month variable is used as an indix, and so must
   *         be decremented to make the appropriate index value
   */
   public static long daysInMonth( long month, long year ) {
      return ( for (counter =1; counter <= 31; counter++) {
        system.out.println = counter;
      }

      }


  /**
   * A method to determine if two dates are exactly equal
   * @param    month1 long    containing month number, starting with "1" for "January"
   * @param    day1   long    containing day number
   * @param    year1  long    containing four-digit year
   * @param    month2 long    containing month number, starting with "1" for "January"
   * @param    day2   long    containing day number
   * @param    year2  long    containing four-digit year
   * @return          boolean which is true if the two dates are exactly the same
   */
   public static boolean dateEquals( long month1, long day1, long year1, long month2, long day2, long year2 ) {
      return (long month1 == long month2 )? true : false;
      return (long day1 == long day2)? true: false;
      return (long year1 == longyear2)? true : false;
   }

  /**
   * A method to compare the ordering of two dates
   * @param    month1 long   containing month number, starting with "1" for "January"
   * @param    day1   long   containing day number
   * @param    year1  long   containing four-digit year
   * @param    month2 long   containing month number, starting with "1" for "January"
   * @param    day2   long   containing day number
   * @param    year2  long   containing four-digit year
   * @return          int    -1/0/+1 if first date is less than/equal to/greater than second
   */
   public static int compareDate( long month1, long day1, long year1, long month2, long day2, long year2 ) {
      return  (long month 1 > long month 2)? true : false;
      return  (long day 1 > long day 2)? true : false;
      return  (long year 1 > long year 2)? true : false;
   }

  /**
   * A method to return whether a date is a valid date
   * @param    month long    containing month number, starting with "1" for "January"
   * @param    day   long    containing day number
   * @param    year  long    containing four-digit year
   * @return         boolean which is true if the date is valid
   * notes: remember that the month and day variables are used as indices, and so must
   *         be decremented to make the appropriate index value
   */
   public static boolean isValidDate( long month, long day, long year ) {
      return (long month == int)? true : false;
      return (long day == int)? true : false;
      return (long year == int)? true ; false;

  /**
   * A method to return a string version of the month name
   * @param    month long   containing month number, starting with "1" for "January"
   * @return         String containing the string value of the month (no spaces)
   */
   public static String toMonthString( int month ) {
      switch( month - 1 ) {
        case 1: (month 1 == January) {
          return "January"
        }
        case 2: (month 2 == February) {
          return "February"
        }
        case 3: (month 3 == March) {
          return "March"
        }
        case 4: (month 4 == April) {
          return "April"
        }
        case 5: (month 5 == May) {
          return "May"
        }
        case 6: (month 6 == June) {
          return "June"
        }
        case 7: (month 7 == July) {
          return "July"
        }
        case 8: (month 8 == August) {
          return "August"
        }
        case 9: (month 9 == September) {
          return "September"
        }
        case 10: (month 10 == October) {
          return "October"
        }
        case 11: (month 11 == November) {
          return "November"
        }
        case 12: (month 12 == December) {
          return "December"
        }

          }
         default: throw new IllegalArgumentException( "Illegal month value given to 'toMonthString()'." )

      }
   }

  /**
   * A method to return a string version of the day of the week name
   * @param    day int    containing day number, starting with "1" for "Sunday"
   * @return       String containing the string value of the day (no spaces)
   */
   public static String toDayOfWeekString( int day ) {
      switch( day - 1 ) {
         case 1: (day 1 == Monday) {
            return "Monday"
         }
         case 2: (day 2 == Tuesday) {
            return "Tuesday"
         }
         case 3: (day 3 == Wednesday) {
            return "Wednesday"
         }
         case 4: (day 4 == Thursday) {
             return Thursday
         }
         case 5: (day 5 == Friday) {
             return "Friday"
        }
         case 6: (day 6 == Saturday) {
             return "Saturday"
        }
        case 7: (day 7 == Sunday) {
            return "Sunday"
       }

       default : throw new IllegalArgumentException( "Illegal day value given to 'toDayOfWeekString()'." );
      }
   }

  /**
   * A method to return a count of the total number of days between two valid dates
   * @param    month1 long   containing month number, starting with "1" for "January"
   * @param    day1   long   containing day number
   * @param    year1  long   containing four-digit year
   * @param    month2 long   containing month number, starting with "1" for "January"
   * @param    day2   long   containing day number
   * @param    year2  long   containing four-digit year
   * @return          long   count of total number of days
   */
   public static long daysBetween( long month1, long day1, long year1, long month2, long day2, long year2 ) {
      long dayCount = 0;
      return dayCount;

   }

}