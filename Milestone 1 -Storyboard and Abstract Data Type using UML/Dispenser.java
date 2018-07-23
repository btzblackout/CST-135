import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dispenser
{
    //Declare data types
    ArrayList<Product> selectedItems = new ArrayList<>();
    ArrayList<Product> inventory = new ArrayList<>();
    int numberProducts;
    int placeholder;
    double currentBalance;
    String adminPassword;
    Boolean outOfStock;

    public static void addProduct(Product product)
    {

    }
    public static void addProductarray(Product[] product)
    {

    }
    public Dispenser()
    {

    }
    public static void removeProduct(String name)
    {

    }
    public int getNumberProducts()
    {
        return placeholder;
    }
    public double getCurrentBalance()
    {
        return currentBalance;
    }
    public void setCurrentBalance(double currentBalance)
    {

    }
    public ArrayList getSelectedItems()
    {
        return selectedItems;
    }
    public ArrayList getCurrentInventory()
    {
        return inventory;
    }
    public static boolean checkPassword(String password)
    {
        if(password == "Password")
        {
            return true;
        }
        return false;
    }
    public void reStockProduct(Product product)
    {

    }
    public boolean checkOutOfStock(String name)
    {
        if(outOfStock == true)
        {
            return true;
        }
        return false;
    }
    public ArrayList checkOutOfStockArray()
    {
        return getCurrentInventory();
    }
    //For testing
    public static void main(String[]args)
    {
        //for testing the checkpassword method.
        String password = "Password";
        System.out.println(checkPassword(password));
        //creates the first Product object.
        Product firstproduct = new Product("Lays Chips", 1.00, 2, "123456", 100);
        //displays expected results.
        System.out.println("The first product is: \n Name: " + firstproduct.getName() + " Price: " + firstproduct.getPrice() + " Stock: " + firstproduct.getStock() + " UPC: " + firstproduct.getUPC() + " Calories: " + firstproduct.getCalories() );


    }


}
