public class HourlyEmplyee extends Employee {
    private float workDailyPrice;
    private float DailyRate;

    /**
     * @param Name
     * @param address
     * @param salary
     */
    public HourlyEmplyee(float DailyRate, float workDailyPrice, String Name, String address, int salary) {
        super(Name, address, salary);
        this.DailyRate = DailyRate;
        this.workDailyPrice = workDailyPrice;
    }

    public void setDailyRate(float dailyRate) {
        DailyRate = dailyRate;
    }

    public void setWorkDailyPrice(float workDailyPrice) {
        this.workDailyPrice = workDailyPrice;
    }

    public float getDailyRate() {
        return DailyRate;
    }

    public float getWorkDailyPrice() {
        return workDailyPrice;
    }

}
