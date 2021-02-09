package am.armen181.liskov_substitution;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.getSpeed();
        vehicle = new Bus();
        vehicle.getCubicCapacity();
    }
}
