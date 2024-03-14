public class DalilyEmployee extends Employee {
    private float workDailyPrice, bonous;
    private int workDailyRate;

    public DalilyEmployee(float bonous, String Name, String address, int salary, float workDailyPrice, int workDailyRate) {
        super(Name, address, salary);
        this.workDailyPrice = workDailyPrice;
        this.workDailyRate = workDailyRate;
    }

    public void setWorkDailyPrice(float workDailyPrice) {
        this.workDailyPrice = workDailyPrice;
    }

    public void setWorkDailyRate(int workDailyRate) {
        this.workDailyRate = workDailyRate;
    }
    @Override
    public float getSalary() {
        return (super.getSalary() + this.bonous);
    }

}
