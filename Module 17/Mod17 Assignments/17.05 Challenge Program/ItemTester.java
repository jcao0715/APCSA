/*
 * Purpose: Satisty requirements of 17.05 Challenge Program.
 * 
 * @author Jing Cao
 * @version 11/10/19
 */

public class ItemTester
{

    public static void main(String[] args)
    {

        groceries[0] = new Item("1011", "Bananas", 250, 2.99);
        groceries[1] = new Item("1034", "Apples", 60, 1.50);
        groceries[2] = new Item("1101", "Pears", 30, 4.50);
        groceries[3] = new Item("1600", "Tomatoes", 45, 2.50);
        groceries[4] = new Item("1500", "Lettuce", 40, 3.50);
        groceries[5] = new Item("1201", "Carrots", 50, 1.99);
        groceries[6] = new Item("2348", "Mangoes", 70, 3);
        groceries[7] = new Item("8235", "Cheese", 50, 2);
        groceries[8] = new Item("8237", "Peanuts", 25, 8);
        groceries[9] = new Item("2983", "Onions", 15, 4);

        System.out.println("\nOriginal Array: ");
        printInventory();

        System.out.println("\nSorted by ID: ");
        sortID();
        printInventory();

        System.out.println("\nSorted by Name: ");
        sortName();
        printInventory();

        System.out.println("\nSorted by inStore: ");
        sortInStore();
        printInventory();

        System.out.println("\nSorted by Price: ");
        sortPrice(0, groceries.length - 1);
        printInventory();

    }

    private static Item[] groceries = new Item[10];

    public static void sortName() {

        Item[] dest = new Item[groceries.length];

        for(int i = 0; i < groceries.length; i++) {
            
            Item next = groceries[i];
            int insertIndex = 0;
            int k = i;

            while(k > 0 && insertIndex == 0) {
                
                if(next.getItemName().compareTo(dest[k - 1].getItemName()) > 0) {
                    insertIndex = k;
                }

                else {
                    dest[k] = dest[k - 1];
                }

                k--;
            }

            dest[insertIndex] = next;
        }
        
        groceries = dest;
    }

    public static void sortInStore() {
        
        int o = 0;
        int i = 0;
        int max = 0;
        Item temp = new Item("", "", 0, 0);

        for(o = groceries.length-1; o >= 0; o--) {
            
            max = 0;
            
            for(i = 0; i <= o; in++) {
            
                if(groceries[in].getInStore() > groceries[max].getInStore()) {
            
                    max = in;
            
                }
            }

            temp = groceries[o];
            groceries[o] = groceries[max];
            groceries[max] = temp;
        }
    }

    public static void sortPrice(int low, int high) {
        
        if(low == high) {
            return;
        }
        
        int mid = (low + high) / 2;

        sortPrice(low, mid);
        sortPrice(mid + 1, high);
        mergePrice(low, mid, high);
    }

    public static void sortID() {

        Item[] dest = new Item[groceries.length];

        for(int i = 0; i < groceries.length; i++) {

            Item next = groceries[i];
            int insertIndex = 0;
            int k = i;

            while(k > 0 && insertIndex == 0) {
                if(next.getItemID().compareTo(dest[k - 1].getItemID()) > 0) {
                    insertIndex = k;
                }

                else {
                    dest[k] = dest[k - 1];
                }

                k--;
            }

            dest[insertIndex] = next;
        }
        
        groceries = dest;
    }

    public static void mergePrice(int low, int mid, int high) {
        Item[] temp = new Item[high - low + 1];

        int l = low;
        int m = mid + 1;
        int n = 0;

        while(l <= mid || m <= high) {
            
            if(l > mid) {
                temp[n] = groceries[m];
                m++;
            }

            else if(m > high) {
                temp[n] = groceries[l];
                l++;
            }

            else if(groceries[l].getPrice() > groceries[m].getPrice()) {
                temp[n] = groceries[l];
                l++;
            }

            else {
                temp[n] = groceries[m];
                m++;
            }

            n++;
        }

        for(int x = low; x <= high; x++) {
            
            groceries[x] = temp[x - low];
        
        }
    }

    public static void printInventory() {
        
        System.out.printf("\n%6s%2s%12s%2s%7s%4s%5s\n", "itemID", " ", "itemName", " ", "inStore", " ", "price");
        System.out.println("---------------------------------------------------");

        for(Item grocery : groceries)
            System.out.println(grocery.toString());
        
    }

}