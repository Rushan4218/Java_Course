import vehicle.Car;
import vehicle.Garage;
import vehicle.Vehicle;

class Main {
  public static void main(String[] args) {
    Vehicle bike = new Vehicle();
    bike.startUp();

    Car tesla = new Car();
    tesla.startUp();
    tesla.honk();

    Garage garage = new Garage();
    garage.refillFuel(bike);
    garage.refillFuel(tesla);
  }
}
