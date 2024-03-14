public class DalilyEmployee extends Employee {
    private float workDailyPrice;
    private int workDailyRate;

    public DalilyEmployee(String Name, String address, int salary, float workDailyPrice, int workDailyRate) {
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

}
