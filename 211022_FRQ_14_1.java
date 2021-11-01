class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Analyzes grades obtained from the getGrade method and returns the proportion
  *   of grades that are 90.0 and above, as described in part (a)
  */
  public static double gradeSimulation()
  {
    int currPassingGrade = 0;
    while(getGrade() != -1)
    {
      if(getGrade() >= 90)
      {
        currPassingGrade++;
      }
    }
    return currPassingGrade;
  }
}
