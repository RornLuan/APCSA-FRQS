class Main {
  public static void main(String[] args) {
    System.out.println(propOfPrimes(5, 14));
  }
  /** Returns the proportion of numbers between start and end, inclusive, that are prime,
  *  as described in part (a)
  *  Precondition: 1 < start <= end <= Integer.MAX_VALUE
  */

  public static double propOfPrimes(int start, int end)
  {
    if(1 < start && start <= end && end <= Integer.MAX_VALUE)
    {
      double nonPrimes = 0;
      double totalNum = (end - start) + 1;
      for(int i = start; i <= end; i++)
      {
        for (int j = 2; j <= i / 2; ++j) {
          if (i % j == 0) {
            nonPrimes++;
            break;
          }
        }
      }
      return (totalNum - nonPrimes) / totalNum;
    }
    return 0;
  }
}
