public class App {
    public static void main(String[] args) throws Exception {
       Acc acount1 = new Acc();
       acount1.insert(0, "Seif", 100); 
       acount1.deposit(50);
       acount1.withdraw(200);
    }
}
