import java.awt.*;


public class Product
{
    //Declare variables
    private String name;
    private String UPC;
    private double price;
    private int stock;
    private int calories;
    private Image productImage;

    //Constructor with no arguments
    public Product()
    {

    }

    //Constructor with arguments
    public Product(String name, double price, int stock, String UPC, int calories)
    {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.UPC = UPC;
        this.calories = calories;
    }
    public Product(String name, double price, int stock, String UPC, int calories, Image productImage)
    {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.UPC = UPC;
        this.calories = calories;
    }
    //Copy Constructor
    public Product(Product copyProduct)
    {
    }


    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public Image getProductImage() {
        return productImage;
    }

    public void setProductImage(Image productImage) {
        this.productImage = productImage;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    //Tostring method.
    @Override
    public String toString() {
        return super.toString();
    }

    //Main method for testing
    public static void main (String[] args)
    {

    }
}