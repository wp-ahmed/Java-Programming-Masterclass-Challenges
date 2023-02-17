public class Milk extends ProductForSale{
    public Milk(String name,double price, String description) {
        super(name,"Milk", price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Name:        " +getName());
        System.out.println("Type:        " +getType());
        System.out.println("Description: " +getDescription());
        System.out.println("Price:       " +getPrice());
    }
}
