// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        car carObj = new car();
        car carObj2 = new car();
        carObj.carName = "Tesla";
        carObj2.carName = "Ford";
        carObj.maxSpeed = 180;
        System.out.println(carObj.getCarName());
        System.out.println(carObj.carName);
        carObj.setCarName("Kia");
        System.out.println(carObj.carName);
        carObj2.setCarName("lada");
        System.out.println(carObj2.carName);
        
    }
}
