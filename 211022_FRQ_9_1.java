class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    compute("coop", "^^");
  }

  /** Returns an integer based on two input strings, as described in part (a)
  *   Precondition: input and op are not null.
  *   The length of input is even.
  *   op is either "$$", "^^", or "##".
  */

  public static int compute(String input, String op)
  {
    if(input.length() % 2 == 0 && input != null && op != null)
    {
      if(op.equals("$$") || op.equals("^^") || op.equals("##"))
      {
        int firstHalfValue = transform(input.substring(0, input.length()/2));
        int secondHalfValue = transform(input.substring(input.length()/2));

        if(op.equals("$$"))
        {
          return firstHalfValue + secondHalfValue;
        }
        else if(op.equals("^^"))
        {
          return firstHalfValue * secondHalfValue;
        }
        else if(op.equals("##"))
        {
          return firstHalfValue - secondHalfValue;
        }
      }
    }
    return 0;    
  }
}
