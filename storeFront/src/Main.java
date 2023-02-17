public class Main {
    public static void main(String[] args) {

//        Chips c = new Chips("Lays",2.025,"Chips is so good");
//        Milk m = new Milk("Maray", 52.00, "Full fat milk");

        Store store = new Store("Mira Market");
        store.addProduct("Lays","chips", 2.025,"Chips is so good");
        store.addProduct("Maray", "Milk", 52.00, "Full fat milk");
        store.addProduct("Lays","chips", 2.025,"Chips is so good");
        store.printAllProducts();

        store.addOrder("lAyS");
        store.addOrder("lays");
        store.printAllOrders();
    }
}