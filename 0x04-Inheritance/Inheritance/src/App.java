public class App {
    public static void main(String[] args) throws Exception {
        Gamer gamer = new Gamer("The witcher 3", 2015, 53, "Action",
                true, "Mohyyasserkmkm", "Action");
        System.out.println(gamer.getGameName());
        System.out.println(gamer.getGameCategory());
        System.out.println(gamer.getGamePlayTime());

    }
}
