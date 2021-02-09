package am.armen181.liskov_substitution;

public class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    String GetEmergencyExitLoc() {
        return "Emergency Exit Location";
    }
}
