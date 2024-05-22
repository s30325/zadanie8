
public class Main {
    public static void main(String[] args) {
Car car1 = new Car("Opel", "gg", 2001, 210.4, 23.4);
Truck truck1 = new Truck("hh", "dd", 2011, 23.4, 343.3, 234.9);
car1.calculateFuelEfficiency();
truck1.calculateFuelEfficiency();
    }
}