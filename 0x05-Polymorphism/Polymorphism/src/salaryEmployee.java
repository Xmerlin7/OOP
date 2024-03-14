
public class salaryEmployee extends Employee{
    float bonous;
    public salaryEmployee(float bonous,String Name, String address, int salary) {
        super(Name, address, salary);
        this.bonous = bonous;
    }
    @Override
    public float getSalary() {
        return (super.getSalary() + this.bonous);
    }
    

    
}