import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dispenser
{
    //Declare data types
    ArrayList<Product> selectedItems = new ArrayList<>();
    ArrayList<Product> inventory = new ArrayList<>();
    ArrayList<Product> outOfStockItems = new ArrayList<>();
    int numberProducts;
    double currentBalance;
    String adminPassword= "admin";
    Boolean outOfStock;
    //add one product to the list
    public void addProduct(Product product)
    {
        inventory.add(product);
    }
    //add multiple products to the list
    public void addProductarray(Product[] products)
    {
        for(Product a: products){
            inventory.add(a);
        
    }
    }
    //default constructor
    public Dispenser()
    {

    }
    //dispenser constructor for default items
    public Dispenser(int a){
        Product product1= new Drink("Cola", 1.00, 5, "001", 120, 12.00, true, "Drink");
        Product product2=new Gum("Juicy Fruit", 0.5, 10, "002", 5, 1, false, "Tropical", true, "Gum");
        Product product3= new Candy("Snickers", 1.25, 25, "003", 200, 10, true, true, false, false, true, "Candy");
        Product product4= new Chips("Cheetos", 1.00, 2, "004", 150, 5.00, true, "Cheese", true, false, "Chips");
        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);
        inventory.add(product4);
    }
    //remove product by name
    public  void removeProduct(String name)
    {
        for(Product a: inventory){
            if (a.getName().equals(name)){
                inventory.remove(a);
            }
        }
    }
    //get total number of products in the dispenser
    public int getNumberProducts()
    {
        return numberProducts;
    }
    //get current amount owed
    public double getCurrentBalance()
    {
        return currentBalance;
    }
    
    //set current amount owed
    public void setCurrentBalance(double currentBalance)
    {
            this.currentBalance=currentBalance;
    }
    
    //get selected items
    public ArrayList getSelectedItems()
    {
        return selectedItems;
    }
    
    //get current products in the dispenser inventory
    public ArrayList getCurrentInventory()
    {
        return inventory;
    }
    
    //check password to login
    public boolean checkPassword(String password)
    {
        if(password.equals(adminPassword))
        {
            return true;
        }
        return false;
    }
    
    //restock a product
    public void reStockProduct(Product product, int number)
    {
        product.setStock(number);
    }
    
    //check if a product is out of stock by product
    public boolean checkOutOfStock(Product product)
    {
        if(product.getStock() == 0)
        {
            outOfStock = true;
        }
        else{
            outOfStock = false;
        }
        return outOfStock;
    }
    
    //return all items that are out of stock
    public ArrayList checkOutOfStockArray()
    {
        outOfStockItems.clear();
        for(Product a: inventory){
            if(a.getStock()==0){
                outOfStockItems.add(a);
            }
        }
        return outOfStockItems;
    }
  
    public String displayItems(){
        String displayItems = "";
        for(Product a: inventory){
            displayItems += "\n" + a.toString();
        }
        return displayItems;
    }



}