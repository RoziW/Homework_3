
package hw_3;

import java.util.ArrayList;
public class RealEstateAgency {
     private ArrayList<properties> properties;

    public RealEstateAgency() {
        properties = new ArrayList<>();
    }

    public void addProperty(properties property) {
        if (properties.size() < 100) {
            properties.add(property);
            System.out.println("Property added successfully!");
        } else {
            System.out.println("Maximum property limit reached!");
        }
    }

    public void removeProperty(int index) {
        if (index >= 0 && index < properties.size()) {
            properties.remove(index);
            System.out.println("Property removed successfully!");
        } 
        else if (properties.isEmpty()){
            System.out.println("You haven't nput any properties yet.");
        }
        else {
            System.out.println("Invalid index!");
        }
    }

    public void displayProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties available.");
        } else {
            for (int i = 0; i < properties.size(); i++) {
                System.out.println("Property " + (i + 1) + ":");
                properties.get(i).display();
                System.out.println();
            }
        }
    }
}

