class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Returns the check digit for num, as described in part (a).
  * Precondition: The number of digits in num is between one and six, inclusive.
  * num >= 0
  */

  public static int getCheck(int num)
  {
    int numLength = getNumberOfDigits(num);

    int numAnswer = 0;

    int numIndex = 7;

    for(int i = 1; i <= numLength; i++)
    {
      numAnswer += (getDigit(num, i) * numIndex);

      numIndex--;
    }

    return getDigit(numAnswer, getNumberOfDigits(numAnswer));
  }
}
