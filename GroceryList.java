import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> s=new ArrayList<String>();

    public GroceryList(){

    }
    public GroceryList(ArrayList<String> s){
        this.s=s;
    }

    public void addItems(String item){
        s.add(item);
    }

    public void printList(){
        if(s.size()>0) {
            System.out.println("Items in list are: ");
            for (int i = 0; i < s.size(); i++) {
                System.out.println((i + 1) + ". " + s.get(i));
            }
        }
        else{
            System.out.println("NULL LIST");
        }
    }

    public void modifyGroceryItems(String item, String modified){
        s.set(s.indexOf(item),modified );
        System.out.println("Modified successfully, Update list is: ");
        printList();
    }

    public void modifyByPosition(String item,int position){
        s.set(position,item);
        System.out.println("Modified successfully, Update list is: ");
        printList();
    }


    public void removeGroceryItems(String item){
        s.remove(item);
        System.out.println("Removed successfully, Update list is: ");
        printList();
    }

    public void removeByPosition(int position){
        s.remove(position);
        System.out.println("Removed successfully, Update list is: ");
        printList();
    }

    public void findItems(String item) {
        int position = s.indexOf(item);
        if (position >= 0) {

            System.out.println("Item is at: " + (position + 1) + "th position");
            System.out.println("Item name:" + s.get(position));
        }
        else{
            System.out.println("Not in the list!");
        }
    }

}
