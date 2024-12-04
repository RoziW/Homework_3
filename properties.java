
package hw_3;

public class properties {
    
   private double area;
    private int rooms;
    private String neighborhood;
    private double price;

    public properties(double area, int rooms, String neighborhood, double price) {
        this.area = area;
        this.rooms = rooms;
        this.neighborhood = neighborhood;
        this.price = price;
    }

    public void display() {
        System.out.println("Area: " + area + " m2");
        System.out.println("Rooms: " + rooms);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Price: $" + price);
    }
    
    
    
}
