package LAB4;

public class Main {
    public static void main(String[] args) {
        Store store1 = new Store();
        store1.addProduct(new Electronic("Laptop", 1000.0));
        store1.addProduct(new Electronic("Smartphone", 500.0));

        // Apply a 10% discount
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.1;
        store1.applyDiscount(tenPercentDiscount);

        // Apply a fixed discount of $50
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        store1.applyDiscount(fiftyDollarsDiscount);
        
        
        System.out.println("------$$$$$$$-----------------------$$$$$$$---------------");
        
        
        Store store2 = new Store();
        store2.addProduct(new Accessory("Parlantes",300.0));
        store2.addProduct(new Accessory("Cargador",60.0));
       
        // Apply a 30% discount
        Discountable thirtyPercentDiscount = product -> product.getPrice() * 0.3;
        store2.applyDiscount(thirtyPercentDiscount);
        
        
        //Apply a fixed discount of $10
        Discountable tenDollarsDiscount = product -> product.getPrice() - 10.0;
        store2.applyDiscount(tenDollarsDiscount);
        
    }
}