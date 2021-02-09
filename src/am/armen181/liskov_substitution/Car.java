package am.armen181.liskov_substitution;

public class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    boolean isLocked() {
        return false;
    }
}
