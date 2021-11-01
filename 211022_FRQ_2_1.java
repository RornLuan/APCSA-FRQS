import java.util.Scanner;

class Main {
  private static double apple;

  public static void main(String[] args) {
    System.out.println(bagApples(10, 0.5));
  }

  public static double getApple()
  {
    Scanner ask = new Scanner(System.in);

    System.out.print("Enter the weight: ");

    apple = ask.nextDouble();

    return apple;
    
  }

  /**
   * Returns the number of apples that are added to a bag, as described in part
   * (a) Precondition: 0 < allowedVariation < targetWeight
   */

  public static int bagApples(double targetWeight, double allowedVariation) {
    boolean overWeighted = false;
    int currentApple = 0;
    double currentWeight = 0;
    double addedWeight;

    if(0 < allowedVariation && allowedVariation < targetWeight)
    {
      while(!overWeighted)
      {
        addedWeight = getApple();
        if((currentWeight + addedWeight) <= (targetWeight - allowedVariation))
        {
          currentWeight += addedWeight;
          currentApple += 1;
        }else
        {
          return currentApple;
        }
      }
    }
    
    return currentApple;
  }
}
