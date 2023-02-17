import java.util.ArrayList;



public class Store {
    private String name;
    ArrayList<ProductForSale> products = new ArrayList<>(5000);
    ArrayList<orderItem> orders = new ArrayList<>(50000);

    public Store(String name) {
        this.name = name;
    }
    
    public void addProduct(String name, String type, double price, String description) {

        if(getProduct(name) != null) {
            System.out.println("The product is already existed in the store");
            return;
        }
        
        name = name.toLowerCase();
        switch (name) {
            case "chips" -> products.add(new Chips(name,price,description));
            case "milk" -> products.add(new Milk(name,price,description));
            default -> products.add(new ProductForSale(name,type,price,description) {
                @Override
                public void showDetails() {
                    System.out.println("Name:        " +getName());
                    System.out.println("Type:        " +getType());
                    System.out.println("Description: " +getDescription());
                    System.out.println("Price:       " +getPrice());
                }
            });
        }
        
        System.out.println("The product has been added successfully to the store");
    }

    public void addOrder(String productName) {
        
        if(getProduct(productName) == null) {
            System.out.println("Sorry the product is not available right now");
            return;
        }
        
        ProductForSale product = getProduct(productName);
        orderItem order = new orderItem(product);
        orders.add(order);
    }
    
    private ProductForSale getProduct(String productName) {
        
        productName = productName.toLowerCase();
        
        for(var product : products) {
            if(product.getName().equalsIgnoreCase(productName)){
                return product;
            }
        }
        
        return null;
    }
    public void printAllProducts() {
        
        System.out.println("All products detail");
        System.out.println("-".repeat(30));
        
        for (var product : products){
            product.showDetails();
            System.out.println("-".repeat(30));
        }
        
    }
    public void printAllOrders(){
        
        int orderNumber = 1;
        System.out.println("All order details");
        System.out.println("-".repeat(30));
        
        for (var order : orders) {
            System.out.println("order number: "+orderNumber);
            order.product().showDetails();
            orderNumber++;
            System.out.println("-".repeat(30));
        }
    }
}
