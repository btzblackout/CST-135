public class Snack extends Product {
    private double size;
    private Boolean junkFood;
    
    public Snack(){}
    
    public Snack(String name, double price, int stock, String UPC, int calories, double size, Boolean junkFood, String type){
        super(name, price,stock, UPC, calories, type);
        this.size=size;
        this.junkFood=junkFood;
    }
    public Snack(Snack copySnack){
        super(copySnack);
        this.size=copySnack.getSize();
        this.junkFood= copySnack.getJunkFood();
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
    public Boolean getJunkFood() {
        return junkFood;
    }

    /**
     * @param containsSugar the containsSugar to set
     */
    public void setJunkFood(Boolean junkFood) {
        this.junkFood = junkFood;
    }
    
    @Override
    public String toString(){
                		return "Product: [name=" + this.getName() + ", price=" + this.getPrice() + ", stock=" + this.getStock()
				+ ", calories=" + this.getCalories() + ", UPC=" + this.getUPC() + ", Type=" + this.getType() + ", Size (ounces)=" + size + ", Junk Food =" + junkFood+ "]";
    }
    
}


