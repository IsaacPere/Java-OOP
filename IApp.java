class Product {
    int Product_ID;
    String animals_name;
    int Price_Products;


    Product(){
        System.out.println(">>Product Object Constructed");
    }

    void set_products_price(
        int Product_ID,
        String animals_name,
        int Price_Products
    ) {
        this.Product_ID = Price_Products;
        this.animals_name = animals_name;
        this.Price_Products = Price_Products;
    }

    void show_products_details(){
        System.out.println("Products ID" + Product_ID);
        System.out.println("Name"+animals_name);
        System.out.println("Price"+Price_Products);
    }
}

class Mobile extends Product {
    String operating_system;
    int ram_amount;
    int sd_card_size;
    Mobile() {
        System.out.println("Mobile Object Constructed");
    }
    void set_products_price(
        int Product_ID,
        String animals_name,
        int Price_Products,
        String operating_system,
        int ram_amount,
        int sd_card_size
    ) {
        this.Product_ID = Product_ID;
        this.animals_name = animals_name;
        this.Price_Products = Price_Products;
        this.operating_system = operating_system;
        this.ram_amount = ram_amount;
        this.sd_card_size = sd_card_size;
        System.out.println("Mobile Data Information");
    }

    void show_products_details(){
        System.out.println("Child Methods");
        System.out.println("Phone Name\t"+animals_name);
        System.out.println("And the price\t"+Price_Products);
        System.out.println("Operating Systems\t"+operating_system);
        System.out.println("RAM Amounts\t"+ram_amount);
        System.out.println("SD Card\t"+sd_card_size);
    }


}

public class IApp {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("Products is "+ product);
        product.set_products_price(123, "Isaac", 145000);
        product.show_products_details();


        Product product_1 = new Product();
        product_1.Product_ID = 201;
        product_1.animals_name = "Make It";
        product_1.Price_Products = 5000;
        product_1.show_products_details();


        Mobile mobile = new Mobile();
        mobile.set_products_price(200, "IPhone X", 212000);
        mobile.show_products_details();
    }
}
