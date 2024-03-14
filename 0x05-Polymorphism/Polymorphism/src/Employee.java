public class Employee {
    protected String Name, address;
    protected float salary;

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
