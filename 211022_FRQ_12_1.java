class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /** Simulates a frog attempting to reach the goal as described in part (a). * Returns true if the frog successfully reached or passed the goal during the simulation; * false otherwise. */

  public boolean simulate()
  {
    int currHop = 0;
    for(int i =0; i < maxHops; i++)
    {
      currHop += hopDistance();
    }
    if(currHop < hopDistance)
    {
      return false;
    }else
    {
      return true;
    }
  }

  /** Runs num simulation and returns to proportion of similations in which the frog successfully reached or passed the goal*/

  public double runSimulations(int num)
  {
    double passedCase = 0;
    if(num > 0)
    {
      for(int i = 0; i < num; i++)
      {
        if(simulate())
        {
          passedCase++;
        }
      }

    }
    return (passedCase/num);
  }
}
