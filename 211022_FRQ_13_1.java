class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    generateID("deskdoorlion");
  }

  /** Returns an identifier string based on an input string, as described in part (a)
  *  Precondition: input is not null.
  */

  public static String generateID(String input)
  {
    int currValue = 0;

    if(input != null)
    {
      if(input.length() % 4 != 0)
      {
        return "error";
      }

      for(int i = 0; i < input.length(); i+=4)
      {
        currValue += encodeToNumber(input.substring(i, i+4));
        if(i + 4 > input.length())
        {
          break;
        }
      }
      if(currValue > 100)
      {
        return input + "3";
      }else
      {
        return input + "X";
      }
    }
    return input + "X";
  }
}
