class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Analyzes n values obtained from the getInt method and returns the proportion of
  *  these values that meet the criteria described in part (a)
  *  Precondition: max > 0, n > 0
  */

  public static double analyzeInts(int max, int n)
  {
    int passedCase;
    if(max > 0 && n > 0)
    {
      for(int i = 0; i < n; i++)
      {
        if(getInt() > 0 && getInt() < max && getInt % 3 == 0)
        {
          passedCase++;
        }
      }
    }
    return passedCase/n;
  }  
}
