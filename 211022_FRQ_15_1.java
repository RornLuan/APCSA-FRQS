class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Returns true if the input string passes validation and returns false otherwise, as
  *   described in part (a)
  *  Precondition: input is not null.
  */

  public static boolean isValid(String input)
  {
    int numTrue = 0;
    if(input != null)
    {
      if(input.length() % 3 != 0)
      {
        return false;
      }
      for(int i = 0; i < input.length(); i+=3)
      {
        if(hasProperty(input.substring(i, i+3)))
        {
          numTrue++;
        }
        if(i + 3 > input.length())
        {
          break;
        }
      }
      if(numTrue >= 2)
      {
        return true;
      }else if(numTrue < 2)
      {
        return false;
      }
    }
    return false;
  }
}
