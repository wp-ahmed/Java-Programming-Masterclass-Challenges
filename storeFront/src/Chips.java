public class Chips extends ProductForSale{
    public Chips(String name, double price, String description) {
        super(name, "Chips", price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Name:        " +getName());
        System.out.println("Type:        " +getType());
        System.out.println("Description: " +getDescription());
        System.out.println("Price:       " +getPrice());
    }
}
