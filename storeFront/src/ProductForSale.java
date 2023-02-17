record orderItem(ProductForSale product){
    public orderItem(ProductForSale product) {
        this.product = product;
    }
}
public abstract class ProductForSale {
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    private String name;
    private String type;
    private double price;
    private String description;

    public ProductForSale(String name, String type, double price, String description) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        if(quantity <= 0) {
            return 0.00;
        }
        return (double) quantity * price;
    }

    public void printListedItem(int quantity) {
        double totalPrice = getSalesPrice(quantity);
        System.out.println("The product "+type+ " with quantity = " + quantity + " costs " +totalPrice);
    }
    public abstract void showDetails();
}
