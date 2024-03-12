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
        if (this.amount < amount) {
            System.out.println("This operattion can not be done you only have " + this.amount);
        } else {
            this.amount -= amount;
            System.out.println(amount + " deposited");
            System.out.println("Your Balance now is " + this.amount);
        }
    }

    public void checkBalance() {
        System.out.println("Your Balance now is " + this.amount);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
