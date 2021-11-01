class Main {
  public static void main(String[] args) {
    System.out.println(letterAndPattern("Z", "QUICK"));
  }
  /** Returns the String that results when letter and pattern are compared,
  *  as described in part (a)
  *  Precondition: letter consists of one uppercase letter.
  *  pattern has at least 2 letters and all letters are uppercase and unique.
  */

  public static String letterAndPattern(String letter, String pattern)
  {
    String newPattern = "";
    if(letter.length() == 1 && pattern.length() >= 2)
    {
      if(pattern.contains(letter))
      {
        return letter;
      }else
      {
        for(int i = pattern.length() - 1; i >= 0; i--)
        {
          newPattern += pattern.substring(i, i+1);
        }
        return newPattern;
      }
    }
    return null;
  }
}
