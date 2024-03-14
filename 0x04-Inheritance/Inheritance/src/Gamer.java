public class Gamer extends Games{
    private String player;
    private String playerType;
    Gamer(){

    }
    Gamer (String gameName, int gameYearRelease, int gamePlayTime,
    String gameCategory, boolean GOTY, String player, String playerType){
        super(gameName, gameYearRelease, gamePlayTime, gameCategory, GOTY);
        this.player = player;
        this.playerType = playerType;
        System.out.println("child constructor");
    }
    
}
