class CodeWordChecker {
  private int minimum;
  private int maximum;
  private String exceptedString;

  public CodeWordChecker(int min, int max, String exception)
  {
    minimum = min;
    maximum = max;
    exceptedString = exception;
  }

  public CodeWordChecker(String exception)
  {
    minimum = 6;
    maximum = 12;
    exceptedString = exception; 
  }

  public boolean isValid(String input)
  {
    if(input.contains(exceptedString))
    {
      return false;
    }
    
    if(input.length() < minimum && input.length() > maximum)
    {
      return false;
    }

    return true;
  }
}
