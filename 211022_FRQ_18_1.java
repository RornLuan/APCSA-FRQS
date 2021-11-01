class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
  /** Returns the nth mystery number starting with 1, as described in part (a)
  *  Precondition: 1 <= n
  *  There are at least n mystery numbers between 1 and
  *   Integer.MAX_VALUE.
  */

  public static int nthMysteryNumber(int n)
  {
    int numFound = 0;
    if(1 <= n)
    {
      for (int i = 1; i <= Integer.MAX_VALUE; i++)
      {
        if(isMystery(i))
        {
          numFound += 1;
        }

        if(numFound == n)
        {
          return i;
        }
      }
    }
    return 0;
  }
}
