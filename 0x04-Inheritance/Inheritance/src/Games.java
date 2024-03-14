public class Games {
    protected int gameYearPublish;
    protected int gamePlayTime;
    protected String gameName;
    protected String gameCategory;
    protected boolean GOTY;

    public Games() {
        System.out.println("Super constructor");

    }
    public Games(String gameName, int gameYearPublish, int gamePlayTime, String gameCategory, boolean GOTY)

    public void setGameTime(int gamePlayTime) {
        this.gamePlayTime = gamePlayTime;
    }

    public void setGOTY(boolean gOTY) {
        GOTY = gOTY;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGameYearPublish(int gameYearPublish) {
        this.gameYearPublish = gameYearPublish;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public int getGameTime() {
        return gameTime;
    }

    public String getGameName() {
        return gameName;
    }

    public int getGameYearPublish() {
        return gameYearPublish;
    }


}
