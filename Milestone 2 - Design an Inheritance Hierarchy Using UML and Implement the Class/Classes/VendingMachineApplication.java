public class VendingMachineApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dispenser test= new Dispenser(1);
        System.out.println(test.displayItems());
    }
    
}
