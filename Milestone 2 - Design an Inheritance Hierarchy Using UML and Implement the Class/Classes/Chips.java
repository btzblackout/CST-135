public class Chips extends Snack{
    private String flavor;
    private Boolean containsCorn;
    private Boolean containsPotato;
    
    public Chips(){
    }
    
    
     public Chips(String name, double price, int stock, String UPC, int calories, double size, 
             Boolean junkFood, String flavor, Boolean containsCorn, Boolean containsPotato, String type){
        super(name, price,stock, UPC, calories, size, junkFood, type);
        this.flavor=flavor;
        this.containsCorn=containsCorn;
        this.containsPotato=containsPotato;
        
    }
        
    public Chips(Chips copyChips){
        super(copyChips);
        this.flavor=copyChips.getFlavor();
        this.containsCorn=copyChips.getContainsCorn();
        this.containsPotato=copyChips.getContainsPotato();
        
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
     * @return the containsCorn
     */
    public Boolean getContainsCorn() {
        return containsCorn;
    }

    /**
     * @param containsCorn the containsCorn to set
     */
    public void setContainsCorn(Boolean containsCorn) {
        this.containsCorn = containsCorn;
    }

    /**
     * @return the containsPotato
     */
    public Boolean getContainsPotato() {
        return containsPotato;
    }

    /**
     * @param containsPotato the containsPotato to set
     */
    public void setContainsPotato(Boolean containsPotato) {
        this.containsPotato = containsPotato;
    }
    
        @Override
    public String toString(){
               return "Product: [name=" + this.getName() + ", price=" + this.getPrice() + ", stock=" + this.getStock()
		+ ", calories=" + this.getCalories() + ", UPC=" + this.getUPC() + ", Type=" + this.getType() + ", Size (ounces)=" + this.getSize() + 
                 ", Junk Food =" + this.getJunkFood()+ ", Contains Potato =" + containsPotato + 
                 ", Flavor =" + flavor+  ", Contains Corn =" + containsCorn + "]";
}
}