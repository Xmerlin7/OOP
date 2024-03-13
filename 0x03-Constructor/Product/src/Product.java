public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;

    //! build a no-Argument constructor, its name same as the class */
    public Product() {
        this.name = "no name";
        this.description = " No description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
    }
    //! build a Parameterized constructor */
    //? Note: In java u can use same methods different signature
    //* this called overloading */
    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    public void dispalyProduct() {
        System.out.println("name "+ this.name);
        System.out.println("description "+ this.description);
        System.out.println("price "+ this.price);
        System.out.println("quantity "+ this.quantity);
        System.out.println("discount "+ this.discount);

    }
    
}
