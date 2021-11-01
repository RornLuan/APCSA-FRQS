class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Returns the value representing the day of the week for the given date
  *  (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
  *  and 6 denotes Saturday.
  *  Precondition: The date represented by month, day, year is a valid date.
  */

  public static int dayOfWeek(int month, int day, int year)
  {
    int firstDay = firstDayOfYear(year); 

    int currDayYear = dayOfYear(month, day, year);
    
    int dayWeek = (currDayYear % 7) + (firstDay - 1);
    return dayWeek;  
  }
  
}
