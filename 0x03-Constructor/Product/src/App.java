public class App {
    public static void main(String[] args) throws Exception {
        Math objMath1 = new Math();
        Math objMath2 = new Math();
        objMath1.val = 5;
        objMath2.val = 5;
        System.out.println(Math.add(objMath1, objMath2));
    }

}
