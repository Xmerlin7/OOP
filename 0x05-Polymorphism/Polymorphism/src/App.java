public class App {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("string", "null", 5850);
        final DalilyEmployee e2 = new DalilyEmployee(500, "null", "null", 1000, (float)1, 1000);
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
    }
}
