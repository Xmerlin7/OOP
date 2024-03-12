public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;

    //! build a non-Argument constructor, its name same as the class */
    public Product() {
        this.name = "no name";
        this.description = " No description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
    }
}
