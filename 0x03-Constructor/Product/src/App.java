public class App {
    public static void main(String[] args) throws Exception {
        //? If i filled those parameters i will use parameterized constructor
        //? and it will not call the other constructor as it only call one for each object
        Product p1 = new Product();
        p1.print(10);
    }
}
