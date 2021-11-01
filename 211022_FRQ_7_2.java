class Main {
  public static void main(String[] args) {
    isValid(1592);
  }

  /** Returns true if numWithCheckDigit is valid, or false otherwise, as described in part (b).
  * Precondition: The number of digits in numWithCheckDigit is between two and seven, inclusive.
  * numWithCheckDigit >= 0
  */

  public static boolean isValid(int numWithCheckDigit)
  {
    String numString = String.valueOf(numWithCheckDigit);
    int checkDigit = Integer.parseInt(numString.substring(numString.length()-1));
    int otherDigits = Integer.parseInt(numString.substring(0, numString.length()-1));

    if(checkDigit == getCheck(otherDigits))
    {
      return true;
    }
    return false;
  }
}
