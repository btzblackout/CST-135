public class Drink extends Product {
    private double size;
    private Boolean containsSugar;
    
    public Drink(){}
    
    public Drink(String name, double price, int stock, String UPC, int calories, double size, Boolean containsSugar, String type){
        super(name, price,stock, UPC, calories, type);
        this.size=size;
        this.containsSugar=containsSugar;
        
    }
    public Drink (Drink copyDrink){
        super(copyDrink);
        this.size=copyDrink.getSize();
        this.containsSugar= copyDrink.getContainsSugar();
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return the containsSugar
     */
    public Boolean getContainsSugar() {
        return containsSugar;
    }

    /**
     * @param containsSugar the containsSugar to set
     */
    public void setContainsSugar(Boolean containsSugar) {
        this.containsSugar = containsSugar;
    }
    
    @Override
    public String toString(){
                		return "Product: [name=" + this.getName() + ", price=" + this.getPrice() + ", stock=" + this.getStock()
				+ ", calories=" + this.getCalories() + ", UPC=" + this.getUPC() + ", Type=" + this.getType() + ", Size (ounces)=" + size + ", Has Sugar =" + containsSugar+ "]";
    }
    
}
