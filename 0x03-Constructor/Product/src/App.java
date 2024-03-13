public class App {
    public static void main(String[] args) throws Exception {
        Math objMath1 = new Math();
        Math objMath2 = new Math();
        Math result = new Math();
        objMath1.val = 5;
        objMath2.val = 7;
        result = objMath1.add(objMath2);
        System.out.println(result.val);
        System.out.println(objMath1.isEqual(objMath2));
    }

}
