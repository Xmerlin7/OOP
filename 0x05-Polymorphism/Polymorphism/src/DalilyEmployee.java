public class DalilyEmployee extends Employee {
    private float workDailyPriced;
    private int workDailyRate;
    private float bonous;
    public DalilyEmployee(float bonous, String Name, String address, int salary, float workDailyPriced, int workDailyRate) {
        super(Name, address, salary);
        this.workDailyPriced = workDailyPriced;
        this.workDailyRate = workDailyRate;
        this.bonous = bonous;
    }

    public void setWorkDailyPrice(float workDailyPriced) {
        this.workDailyPriced = workDailyPriced;
    }

    public void setWorkDailyRate(int workDailyRate) {
        this.workDailyRate = workDailyRate;
    }
    @Override
    public float getSalary() {
        return ((workDailyPriced * workDailyRate) + this.bonous);
    }
    

}
