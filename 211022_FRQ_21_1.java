class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    ratioOfCubeSumsToSquareSums(5, 30);
  }
  /** Returns the ratio of the sum of all the perfect cubes between start and end, inclusive,
  *  to the sum of all the perfect squares between start and end, inclusive,
  *  as described in part (a)
  *  Precondition: 1 <= start <= end <= Integer.MAX_VALUE
  *  There is at least one perfect square between start and end, inclusive.
 */

  public static double ratioOfCubeSumsToSquareSums(int start, int end)
  {
    double sumSquared = 0;
    double sumCubed = 0;
    if(1 <= start && start <= end && end <= Integer.MAX_VALUE)
    {
      for(double i = start; i <= end; i++)
      {
        if(Math.cbrt(i) == (int)Math.cbrt(i))
        {
          sumCubed += i;
        }

        if(Math.sqrt(i) == (int)Math.sqrt(i))
        {
          sumSquared += i;
        }
      }
    }
    return sumCubed/sumSquared;
  }
}
