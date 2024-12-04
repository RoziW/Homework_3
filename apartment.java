
package hw_3;

public class apartment extends properties {
  private int floor;
    private boolean hasParking;

    public apartment(double area, int rooms, String neighborhood, double price, int floor, boolean hasParking) {
        super(area, rooms, neighborhood, price);
        this.floor = floor;
        this.hasParking = hasParking;
    }

    @Override
    public void display() {
        System.out.println("Type: Apartment");
        super.display();
        System.out.println("Floor: " + floor);
        System.out.println("Has Parking: " + (hasParking ? "Yes" : "No"));
        System.out.println("-------------------------------------\n");
    }
}

