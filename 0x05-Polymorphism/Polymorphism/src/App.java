public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("string", "null", 5850);
        final salaryEmployee e2 = new salaryEmployee(50, "null", "null", 2000);
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
    }
}
