class Main {
  final static int goal = 200;

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Analyzes sales for numDays days obtained from the getSales method and returns
  * the total bonus earned by the salesperson, in dollars, as described in part (a)
  * Precondition: goal > 0, numDays > 0
  */

  public static int calculateBonus(int numDays)
  {
    if(goal > 0 && numDays > 0)
    {
      for (int i = 0; i < numDays; i++)
      {
        if(getSales() >= (0.8 * goal) && getSales() < goal)
        {
          return 50;
        }else if(getSales() <= (0.8 * goal))
        {
          return 0;
        }else if(getSales() >= goal)
        {
          return 75;
        }
      }
    }
  }
}
