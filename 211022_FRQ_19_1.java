class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
  /** Returns the number of times the dog was asked to sit, as described in part (a)
  *  Precondition: n >= 1
  */

  public static int numUntilObedient(int n)
  {
    int numTries = 0;
    int consecutiveNum = 0;
    if(n >= 1)
    {
      if(getResponse())
      {
        consecutiveNum++;
      }else
      {
        consecutiveNum = 0;
      }

      if(consecutiveNum >= n)
      {
        return numTries;
      }

      numTries++;
    }
    return 0;
  }
}
