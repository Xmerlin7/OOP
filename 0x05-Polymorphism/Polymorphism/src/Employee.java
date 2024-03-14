public class Employee {
    protected String Name, address;
    protected float salary;

    public Employee(String Name, String address, int salary){
        this.Name = Name;
        this.address = address;
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return Name;
    }

    public float getSalary() {
        return salary;
    }
}
