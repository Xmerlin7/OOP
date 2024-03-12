public class Acc {
    private int accountNo;
    private String name;
    private float amount;

    public void insert(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
        System.out.println("Thank you " + this.name + " for using our Bank!");
    }

    public void deposit(float amount) {
        this.amount += amount;
        System.out.println(amount + " deposited");
        System.out.println("Your Balance now is " + this.amount);
    }
    public void withdraw(float amount) {
        this.amount -= amount;
        System.out.println(amount + " deposited");
        System.out.println("Your Balance now is " + this.amount);
    }
}