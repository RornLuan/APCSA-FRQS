class Main {
  private static String getGuess = "same";
  public static void main(String[] args) {
    System.out.println(checkGuesses("sameget", 4));
  }
  /** Returns the proportion of guesses that appear in phrase, as described in part (a)
  *   Precondition: num > 0, phrase.length() > 0
  */

  public static double checkGuesses(String phrase, int num)
  {
    double appearedWords = 0;
    if(num > 0 && phrase.length() > 0)
    {
      for (int i = 0; i < num; i++)
      {
        if(phrase.contains(getGuess())
        {
          appearedWords++;
        }
      }
    }    
    return (appearedWords/num);
  }
}
