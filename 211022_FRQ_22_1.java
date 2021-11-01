class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Analyzes sampleSize values obtained using the getInt method, as described in
  *  part (a)
  *   Precondition: sampleSize is a positive even integer.
  */

  public static boolean runSimulation(int sampleSize)
  {
    if(sampleSize >= 0 && sampleSize % 2 == 0)
    {
      int firstHalfPassed = 0;
      int secondHalfPassed = 0;
      for(int i = 0; i < sampleSize / 2; i++)
      {
        if(getInt() >= 0 && isTarget(getInt()))
        {
          firstHalfPassed++;
        }
      }

      for(int i = 0; i < sampleSize / 2; i++)
      {
        if(getInt() >= 0 && isTarget(getInt()))
        {
          secondHalfPassed++;
        }
      }

      if(firstHalfPassed > secondHalfPassed)
      {
        return true;
      }else
      {
        return false;
      }
    }
    return false;
  }
}
