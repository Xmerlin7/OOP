public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    static int serialNumber = 0;
    private boolean loggedIn = false;
    int value = 0;

    // ! build a no-Argument constructor, its name same as the class */
    public Product() {
        this.name = "no name";
        this.description = " No description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
        serialNumber++;
    }

    
    // ! build a Parameterized constructor */
    // ? Note: In java u can use same methods different signature
    // * this called overloading */
    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void dispalyProduct() {
        System.out.println("name " + this.name);
        System.out.println("description " + this.description);
        System.out.println("price " + this.price);
        System.out.println("quantity " + this.quantity);
        System.out.println("discount " + this.discount);
        System.out.println("SerialNumber is  " + serialNumber);
    }

    public boolean login(int serialNumberr, String name) {
        if ((serialNumber == serialNumberr) && this.name.equals(name)) {
            loggedIn = true;
            return (loggedIn);
        } else {
            return false;
        }
    }
}
