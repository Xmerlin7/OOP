public class App {
    public static void main(String[] args) throws Exception {
        Test obj = new Test();
        obj.number = 2;
        fun(obj);
    }

    static void fun(Test x) {
        x.number++;
        System.out.println(x.number);
    }
}
