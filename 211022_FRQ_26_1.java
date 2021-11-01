public class AirTravel {

  /** Returns the number of miles traveled in a simulated flight. Assume the value returned
  *  is greater than 0.
  */
  public static int milesTraveled()
  {
    return 100;
  }
 

  /** Returns the total number of points earned for numFlights flights, as described in
  *  part (a)
  *  Precondition: 0 < numFlights
  */

  public static int totalPointsEarned(int numFlights)
  {
    int totalPoints = 0;
    int totalMiles = 0;
    if(0 < numFlights)
    {     
      for (int i = 0; i < numFlights; i++)
      {
        totalMiles += milesTraveled();
        if(milesTraveled() <= 1000)
        {
          totalPoints += milesTraveled();
        }
        if(totalMiles > 1000 && totalMiles <= 10000)
        {
          totalPoints += (2*(milesTraveled() - 1000)) + 1000;
        }
        if(totalMiles > 10000)
        {
          totalPoints += (2*(milesTraveled() - 1000)) + 1000;
          totalPoints += (5*(milesTraveled() - 10000));
        }
      }
    }
    return totalPoints;
  }

}
