
package hw_3;

public class villa extends properties {
  private boolean hasPool;
    private int adjacentStreets;

    public villa(double area, int rooms, String neighborhood, double price, boolean hasPool, int adjacentStreets) {
        super(area, rooms, neighborhood, price);
        this.hasPool = hasPool;
        this.adjacentStreets = adjacentStreets;
    }

    @Override
    public void display() {
        System.out.println("Type:  Villa");

        super.display();
        System.out.println("Has Pool: " + (hasPool ? "Yes" : "No"));
        System.out.println("Adjacent Streets: " + adjacentStreets);
        System.out.println("-------------------------------------\n");
    }
}

