class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Returns the number of leap years between year1 and year2, inclusive.
  *  Precondition: 0 <= year1 <= year2
  */

  public static int numberOfLeapYears(int year1, int year2)
  {
    int numLeapYear = 0;
    if(0 <= year1 && year1 <= year2)
    {
      for(int i = year1 + 1; i < year2; i++)
      {
        if(isLeapYear(i))
        {
          numLeapYear++;
        }
      }
    }
    return numLeapYear;
  }
}
