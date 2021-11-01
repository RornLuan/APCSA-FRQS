class Main {
  public static void main(String[] args) {
    System.out.println(countRepeat("BAAB", "AA"));
    System.out.println(countRepeat("AAAAA", "AA"));
    System.out.println(countRepeat("AABABABAA", "AA"));
    System.out.println(countRepeat("ABBAABB", "ABA"));
  }

  /** Returns a count of how many times smallStr occurs in largeStr,
  *  as described in part (a)
  *  Precondition: largeStr is not null; smallStr is not null.
  *  The length of smallStr is less than the length of largeStr.
  */

  public static int countRepeat(String largeStr, String smallStr)
  {
    if(largeStr != null && smallStr != null && smallStr.length() < largeStr.length())
    {
      if(largeStr.contains(smallStr))
      {
        if(largeStr.indexOf(smallStr) == largeStr.lastIndexOf(smallStr))
        {
          return 1;
        }else
        {
          return 2;
        }
      }else
      {
        return 0;
      }
    }
    return 0;
  }
}
