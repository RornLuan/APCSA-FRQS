class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
  /** Determines whether fewer than 10 percent of n words examined start with
  *  firstLetter and are less than maxLength characters, as described in
  *  part (a)
  *  Precondition: firstLetter.length() = 1, maxLength > 0
  */

  public static boolean wordChecker(String firstLetter, int maxLength, int n)
  {
    double numPassed = 0;
    String currWord;
    if(firstLetter.length() == 1 && maxLength > 0)
    {
      for(int i = 0; i < n; i++)
      {
        currWord = getWord();
        if(firstLetter.equals(currWord.substring(0,1)))
        {
          if(currWord.length() <= maxLength)
          {
            numPassed++;
          }
        }
      }
      if(numPassed/n < 0.1)
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
