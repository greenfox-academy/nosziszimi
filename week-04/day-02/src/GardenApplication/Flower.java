package GardenApplication;

/**
 * Created by Nóra on 2017. 04. 04..
 */
public class Flower extends Plant {

  public Flower() {
    this("unknown");
  }

  public Flower(String color) {
    super(color);
    needWater = (waterAmount < 5);
  }

  public void beingWatered(double amountOfWater) {
    waterAmount += amountOfWater*0.75;
    needWater = (waterAmount < 5);
  }

  public void info() {
    String waterState;
    if (needWater) {
      waterState = "needs";
    } else {
      waterState = "doesnt need";
    }
    System.out.println("The " + color + " Flower " + waterState + " water.");
  }

}
