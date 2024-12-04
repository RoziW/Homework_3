
package hw_3;

public class furnishedapartment extends apartment {
    private int furnitureQuality;

    public furnishedapartment(double area, int rooms, String neighborhood, double price, int floor, boolean hasParking, int furnitureQuality) {
        super(area, rooms, neighborhood, price, floor, hasParking);
        this.furnitureQuality = furnitureQuality;
    }

    @Override
    public void display() {
        System.out.println("Type:  Furnished Apartment");
        super.display();
        System.out.println("Furniture Quality: " + furnitureQuality + " (1 = Best, 5 = Worst)");
        System.out.println("-------------------------------------\n");
    }
}
