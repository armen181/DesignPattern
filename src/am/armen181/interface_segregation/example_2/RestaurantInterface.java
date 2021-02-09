package am.armen181.interface_segregation.example_2;

public interface RestaurantInterface {
    void onlineOrder();
    void telephoneOrder();
    void payOnline();
    void payInPerson();
}
