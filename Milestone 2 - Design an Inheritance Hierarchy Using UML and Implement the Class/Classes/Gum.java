public class Gum extends Snack{
    private String flavor;
    private Boolean containsSugar;
    
    public Gum(){
        
    }
    
    public Gum(String name, double price, int stock, String UPC, int calories, double size, Boolean junkFood, String flavor,
        Boolean containsSugar, String type){
        super(name, price,stock, UPC, calories, size, junkFood, type);
        this.flavor=flavor;
        this.containsSugar=containsSugar;
    }
        
    public Gum(Gum copyGum){
        super(copyGum);
        this.flavor=copyGum.getFlavor();
        this.containsSugar= copyGum.getContainsSugar();
    }

    /**
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
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
				+ ", calories=" + this.getCalories() + ", UPC=" + this.getUPC() + ", Type=" + this.getType() + ", Size (ounces)=" + this.getSize() + 
                                 ", Junk Food =" + this.getJunkFood()+ ", Flavor =" + flavor + ", Contains Sugar =" + containsSugar + "]";
    }
}
