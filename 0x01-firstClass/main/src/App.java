// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        car carObj = new car();
        carObj.carName = "Tesla";
        carObj.maxSpeed = 180;
        car carObj2 = new car();
        carObj2.carName = "Ford";
        System.out.println(carObj2.carName);
        System.out.println(carObj.carName);

    }
}
