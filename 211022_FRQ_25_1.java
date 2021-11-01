class StudyPractice {
  private int firstInt;
  private int initialSecondInt;

  public StudyPractice(int firstInteger, int secondInteger)
  {
    firstInt = firstInteger;
    secondInteger = initialSecondInt;
  }

  public String getProblem()
  {
    return firstInt + " TIMES " + initialSecondInt;
  }

  public void nextProblem()
  {
    initialSecondInt++;
  }
}
