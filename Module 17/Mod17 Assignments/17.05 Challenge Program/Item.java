/*
 * Purpose: Satisty requirements of 17.05 Challenge Program.
 * 
 * @author Jing Cao
 * @version 11/10/19
 */

public class Item
{
    private String itemID, itemName;
    private int inStore;
    private double price;

    public Item(String itemID, String itemName, int inStore, double price) {
        
        this.itemID = itemID;
        this.itemName = itemName;
        this.inStore = inStore;
        this.price = price;
    
    }

    public String getItemID() {
        
        return itemID;
    
    }

    public String getItemName() {
    
        return itemName;
    
    }

    public int getInStore() {
    
        return inStore;
    
    }

    public double getPrice() {
    
        return price;
    
    }

    public String toString() {
        
        return String.format("%6s%2s%12s%2s%7s%4s%1s%1s%5.2f", itemID, " ", itemName, " ", inStore, " ", "$", " ", price);
    
    }
}