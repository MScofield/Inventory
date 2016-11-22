package IronYard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
	// write your code here
        //Create a class with a main method
        //Create a variable to store the invetnroy items
        //print out the inventory items then list the options
        //If the user enters 1 let the create a new item by entering its name
        //if the user enters 2 let them remove an item by its number
        //if the user enters 3 let them update the quantity of that item
        //optional: create a login system witha few hard-coded usernames and passwords

        ArrayList<InventoryItems> inventoryItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        //do {
            do {
                int inventoryOptions;
                System.out.println("The options for this inventory are as follows [1/2/3/4]");
                System.out.println("Key [1] to create a new inventory item.");
                System.out.println("Key [2} to remove an item");
                System.out.println("Key [3] to update the quantity of an item.");
                System.out.println("key [4] to list all items in inventory.");
                inventoryOptions = Integer.parseInt(scanner.nextLine());

                switch (inventoryOptions) {
                    case 1:
                        System.out.println("Enter the name if the item you would like added to the list: ");
                        String itemName = scanner.nextLine();
                        InventoryItems itemAdd = new InventoryItems(itemName, 1);
                        inventoryItems.add(itemAdd);
                        break;
                    case 2:
                        System.out.println("Enter the number of the item to remove");
                        int itemRemove = Integer.parseInt(scanner.nextLine());
                        inventoryItems.remove(itemRemove - 1);
                        break;
                    case 3:
                        System.out.println("Enter the number of the item you would like to update: ");
                        int itemUpdate = Integer.parseInt(scanner.nextLine());
                        InventoryItems itemCall = (inventoryItems.get(itemUpdate - 1));
                        System.out.println("Enter the new quantity value: ");
                        int newQuantity = Integer.parseInt(scanner.nextLine());
                        itemCall.quanTITy = newQuantity;

                        break;
                    case 4:
                        int i = 1;
                        for (InventoryItems itemList : inventoryItems) {
                            System.out.println(i + ". " + itemList.itemName);
                            {
                                i++;
                            }
                        }
                        break;
                }
            //}while (logOut);

        }while (true) ;
    }
}
