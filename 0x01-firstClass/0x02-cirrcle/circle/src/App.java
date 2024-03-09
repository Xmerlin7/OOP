public class App {
    public static void main(String[] args) throws Exception {
        Circle c1 = new Circle(), c2 = new Circle();
        c1.setRadius(3.5);
        c2.setRadius(4);
        c1.setColor("black");
        c2.setColor("red");
        /*          //? No need now 
        System.out.println("circle 1 area " +  c1.getArea());
        System.out.println("circle 2 circumefernce  " +  c2.getCircumuference());
        */
        //! u can use the toString to do the same */
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
