class Main {
  public static void main(String[] args) {
    System.out.println(changeKey("A", "GXAD"));
  }

  /** Returns a String based on a key and a letter, as described in part (a)
  *   Precondition: letter consists of one uppercase letter.
  *   key has at least 2 letters and all letters are uppercase and unique.
  */

  public static String changeKey(String letter, String key)
  {
    if(Character.isUpperCase(letter.charAt(0)))
    {
      if(letter.length() == 1 && key.length() >= 2)
      {
        if(key.contains(letter))
        {
          return key.replace(letter, "");
        }else
        {
          return letter;
        }
      }
    }
    return "None";
  }  
}
