class StepTracker {
  private int minSteps;
  private int totalActiveDays = 0;
  private int totalDays = 0
  private int currStep = 0;

  public StepTracker(int steps)
  { 
    minSteps = steps;
  }

  public void addDailySteps(int step)
  {
    if(step >= minSteps)
    {
      totalActiveDays++;
    }
    currStep += step;
    totalDays++;
  }

  public int activeDays()
  {
    return totalActiveDays;
  }

  public double averageSteps()
  {
    return currStep/totalDays;
  }
}
