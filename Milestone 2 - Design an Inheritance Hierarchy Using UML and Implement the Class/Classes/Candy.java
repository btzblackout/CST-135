public class Candy extends Snack {
    private Boolean containsChocolate;
    private Boolean isGummy;
    private Boolean isHard;
    private Boolean containsPeanuts;
    
    public Candy(){
    }
    
    public Candy(String name, double price, int stock, String UPC, int calories, double size, Boolean junkFood, Boolean containsChocolate,
        Boolean isGummy, Boolean isHard, Boolean containsPeanuts, String type){
        super(name, price,stock, UPC, calories, size, junkFood, type);
        this.containsChocolate=containsChocolate;
        this.isGummy=isGummy;
        this.isHard=isHard;
        this.containsPeanuts=containsPeanuts;
    }
        
    public Candy(Candy copyCandy){
        super(copyCandy);
        this.containsChocolate=copyCandy.getContainsChocolate();
        this.isGummy=copyCandy.getIsGummy();
        this.isHard=copyCandy.getIsHard();
        this.containsPeanuts=copyCandy.getContainsPeanuts();
    }

    /**
     * @return the containsChocolate
     */
    public Boolean getContainsChocolate() {
        return containsChocolate;
    }

    /**
     * @param containsChocolate the containsChocolate to set
     */
    public void setContainsChocolate(Boolean containsChocolate) {
        this.containsChocolate = containsChocolate;
    }

    /**
     * @return the isGummy
     */
    public Boolean getIsGummy() {
        return isGummy;
    }

    /**
     * @param isGummy the isGummy to set
     */
    public void setIsGummy(Boolean isGummy) {
        this.isGummy = isGummy;
    }

    /**
     * @return the isHard
     */
    public Boolean getIsHard() {
        return isHard;
    }

    /**
     * @param isHard the isHard to set
     */
    public void setIsHard(Boolean isHard) {
        this.isHard = isHard;
    }

    /**
     * @return the containsPeanuts
     */
    public Boolean getContainsPeanuts() {
        return containsPeanuts;
    }

    /**
     * @param containsPeanuts the containsPeanuts to set
     */
    public void setContainsPeanuts(Boolean containsPeanuts) {
        this.containsPeanuts = containsPeanuts;
    }
    
    @Override
    public String toString(){
               return "Product: [name=" + this.getName() + ", price=" + this.getPrice() + ", stock=" + this.getStock()
		+ ", calories=" + this.getCalories() + ", UPC=" + this.getUPC() + ", Type=" + this.getType() + ", Size (ounces)=" + this.getSize() + 
                 ", Junk Food =" + this.getJunkFood()+ ", Contains Chocolate =" + containsChocolate + 
                 ", Gummy =" + isGummy + ", Hard =" + isHard +  ", Contains Peanuts =" + containsPeanuts + "]";
    }
}
