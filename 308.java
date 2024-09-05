abstract class Vehicle {
  String name;
  abstract public String getName(String val);
  public String getName() {
    return "Vehicle name : " + name;
  }
}

class Car extends Vehicle {
  private String name;
  public Car(String val) {
    this.name = super.name = val;
  }
  public String getName(String val) {
    return "Car name : " + val;
  }
  public String gentName(byte[] val) {
    return "Car name : " + val;
  }
}
public class Test {
  public static void main(String[] args) {
    Vehicle v = new Car("BMW");
    System.out.println(v.getName());
    System.out.println(v.getName("Audi"));
    System.out.println(((Car)v).gentName(new byte[] {1, 2, 3}));
  }
}

//output
// Vehicle name : BMW
// Car name : Audi
// Car name : [B@15db9742
// Explanation: The Car class extends the Vehicle class and overrides the getName() method. The Car class also has a method named getName(String val) that is not present in the Vehicle class. The main method creates an object of the Car class and assigns it to a reference of the Vehicle class. The getName() method of the Vehicle class is called using the reference of the Vehicle class, which returns the name of the vehicle. The getName(String val) method of the Car class is called using the reference of the Vehicle class, which returns the name of the car. The gentName(byte[] val) method of the Car class is called using the reference of the Vehicle class, which returns the name of the car followed by the hash code of the byte array.
