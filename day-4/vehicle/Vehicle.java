package vehicle;

public class Vehicle {

  private int fuelLevel = 100;

  void consumeFuel(int amount) {
    fuelLevel -= amount;
    System.out.println("Fuel left: " + fuelLevel);
  }

  void refillFuel() {
    fuelLevel = 100;
    System.out.println("Fuel Level: " + fuelLevel);
  }

  protected void engineSound() {
    System.out.println("Brrr Brrr");
  }

  public void startUp() {
    engineSound();
    consumeFuel(10);
  }
}
