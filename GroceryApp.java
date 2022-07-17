import java.util.Scanner;


public class GroceryApp {
    private static GroceryList g=new GroceryList();
   private static Scanner sc=new Scanner(System.in);

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 to print the choice options");
        System.out.println("\t 1 to print the grocery list");
        System.out.println("\t 2 to add an item to the list");
        System.out.println("\t 3 to modify an item in the list by name");
        System.out.println("\t 4 to modify an item in the list by position");
        System.out.println("\t 5 to remove an item from the list by name");
        System.out.println("\t 6 to remove an item from the list by position");
        System.out.println("\t 7 to search for an item in the list");
        System.out.println("\t 8 to quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        g.addItems(sc.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter previous item:");
        String pi=sc.nextLine();
        String modified=sc.nextLine();
        g.modifyGroceryItems(pi,modified);
    }

    public static void modifyItemByPositon(){
        System.out.println("Enter previous item:");
        int position=sc.nextInt();
        String modified=sc.nextLine();
        g.modifyByPosition(modified,position);
    }

    public static void removeItems(){
        String removed_item=sc.nextLine();
        g.removeGroceryItems(removed_item);
    }

    public static void removeItemsByPosition(){
        int removed_item=sc.nextInt();
        g.removeByPosition(removed_item);
    }

    public static void findItem(){
        String item=sc.next();
        g.findItems(item);
    }

    public static void main(String[] args){
        int choice=0;
        printInstructions();
        boolean quit=false;
        while(!quit){
            System.out.println("Enter Your choice");
            int option=sc.nextInt();
            switch(option){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    g.printList();
                    break;
                case 2:
                    addItem();
                    sc.nextLine();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    modifyItemByPositon();
                    break;
                case 5:
                    removeItems();
                    break;
                case 6:
                    removeItemsByPosition();
                    break;
                case 7:
                    findItem();
                    break;
                case 8:
                    quit=true;
                    System.out.println("App closed!");
                    break;
            }

        }

    }
}
