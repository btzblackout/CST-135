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
    private String type;

    //Constructor with no arguments
    public Product()
    {

    }

    //Constructor with arguments
    public Product(String name, double price, int stock, String UPC, int calories, String type)
    {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.UPC = UPC;
        this.calories = calories;
    }
    public Product(String name, double price, int stock, String UPC, int calories, Image productImage, String type)
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
        this(copyProduct.getName(), copyProduct.getPrice(), copyProduct.getStock(), copyProduct.getUPC(), copyProduct.getCalories(), copyProduct.getProductImage(),
                copyProduct.getType());
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
    
    public String getType() {
      return type;
    }

    public void setType(String type) {
        this.type= type;
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
        		return "Product: [name=" + name + ", price=" + price + ", stock=" + stock
				+ ", calories=" + calories + ", UPC=" + UPC + ", Type=" + type + "]";
    }


}