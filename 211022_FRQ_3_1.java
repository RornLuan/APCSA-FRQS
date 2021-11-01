class Main {
  private static String finalOutput;
  public static void main(String[] args) {
    System.out.println(buildString(1));
  }

  public static String convertToString(int num)
  {
    if(num == 1)
    {
      return "apple";
    }else if(num == 2)
    {
      return "orange";
    }else if(num == 3)
    {
      return "banana";
    }else
    {
      return "null";
    }
  }

  /** Returns a string based on an integer input value, as described in part (a)
  **  Precondition: input > 0
  */

  public static String buildString(int input)
  {
    String output = "";
    int currIndex = 0;
    if(input > 0)
    {
      String inputString = Integer.toString(input);
      for(int i = 0; i < inputString.length(); i++)
        {
          currIndex = Integer.parseInt((String)inputString.subSequence(i, i + 1));
          output += convertToString(currIndex);
        }  
   }
   finalOutput = output;
   return output;
  }
}
