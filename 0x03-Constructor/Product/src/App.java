public class App {
    public static void main(String[] args) throws Exception {
        // If i filled those parameters i will use parameterized constructor
        // and it will not call the other constructor as it only calls one for each object
        Product p1 = new Product();
        Test obj = new Test();
        fun(obj);
    }

    static void fun(Test x) {
        x.number = 5;
        System.out.println(x.number);
    }
}
