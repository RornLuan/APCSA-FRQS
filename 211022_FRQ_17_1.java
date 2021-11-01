class Main {
  public static void main(String[] args) {
    System.out.println(newLetter("G", "GXAD"));
    System.out.println(newLetter("D", "GXAD"));
    System.out.println(newLetter("Z", "GXAD"));
  }
  /** Returns the single-character String produced by applying the substitution rule to
  *  the given letter, as described in part (a)
  *  Precondition: letter consists of one uppercase letter.
  *  rule has at least 2 letters and all letters are uppercase and unique.
  */

  public static String newLetter(String letter, String rule)
  {
    if(letter.length() == 1 && rule.length() >= 2)
    {
      if(rule.contains(letter))
      {
        if(rule.indexOf(letter) != rule.length() - 1)
        {
          return rule.substring(rule.indexOf(letter) + 1, rule.indexOf(letter) + 2);
        }else
        {
          return rule.substring(0,1);
        }
      }else
      {
        return letter;
      }
    }
    return null;
  }
}
