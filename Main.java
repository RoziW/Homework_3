
package hw_3;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        RealEstateAgency agency = new RealEstateAgency();
        boolean exit = false;

        while (exit != true) {
            System.out.println("\nReal Estate Management System:");
            System.out.println("1. Add Property");
            System.out.println("2. Remove Property");
            System.out.println("3. Display Properties");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 :
                    
                    System.out.println("First enter information:\t");
                    System.out.print("Enter Area (m2): ");
                    double area = input.nextDouble();
                    System.out.print("Enter Number of Rooms: ");
                    int rooms = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.print("Enter Neighborhood: ");
                    String neighborhood = input.nextLine();
                    System.out.print("Enter Price: ");
                    double price = input.nextDouble();
                    System.out.println("\nInformation added successfully!\n");
                    System.out.println("\nChoose Property Type:");
                    System.out.println("1. Villa");
                    System.out.println("2. Apartment");
                    System.out.println("3. Furnished Apartment");
                    System.out.print("Enter your choice: ");
                    int type =input.nextInt();
                    switch (type) {
                        case 1 :
                            System.out.println("\tVilla\t");
                            System.out.print("Has Pool (true/false): ");
                            boolean hasPool = input.nextBoolean();
                            System.out.print("Number of Adjacent Streets: ");
                            int adjacentStreets = input.nextInt();
                            agency.addProperty(new villa(area, rooms, neighborhood, price, hasPool, adjacentStreets));
                        break;
                        case 2 :
                            System.out.println("\tApartment\t");
                            System.out.print("Enter Floor: ");
                            int floor = input.nextInt();
                            System.out.print("Has Parking (true/false): ");
                            boolean hasParking = input.nextBoolean();
                            agency.addProperty(new apartment(area, rooms, neighborhood, price, floor, hasParking));
                        break;
                        case 3 :
                            System.out.println("\tFurnished Apartment\t");
                            System.out.print("Enter Floor: ");
                            floor = input.nextInt();
                            System.out.print("Has Parking (true/false): ");
                            hasParking = input.nextBoolean();
                            System.out.print("Enter Furniture Quality (1 = Best, 5 = Worst): ");
                            int furnitureQuality = input.nextInt();
                            agency.addProperty(new furnishedapartment(area, rooms, neighborhood, price, floor, hasParking, furnitureQuality));
                        break;
                        default :
                            System.out.println("Invalid Property Type!");
                        
                                        System.out.println("\n\n1. Add Property");
                                        System.out.println("2. Remove Property");
                                        System.out.println("3. Display Properties");
                                        System.out.println("4. Exit");
                                        System.out.print("Choose an option: ");
                                        choice = input.nextInt();
                                        break;
                    }
                    break;
                
                case 2 :
                    System.out.print("Enter the property index to remove: ");
                    int index = input.nextInt();
                    agency.removeProperty(index - 1);
                    
               break;
                case 3 : agency.displayProperties();
                break;
                case 4 :
                              System.out.println("You have exited the program.");
                    exit = true;
                break;
                default : System.out.println("Invalid choice! Please try again.");
                break;
            }
            
        }
        
    }
}

