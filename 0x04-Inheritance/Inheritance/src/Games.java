public class Games {
    protected int gameYearRelease;
    protected float gamePlayTime;
    protected String gameName;
    protected String gameCategory;
    protected boolean GOTY;

    public Games() {
        System.out.println("Super constructor");

    }

    public Games(String gameName, int gameYearRelease, float gamePlayTime,
            String gameCategory, boolean GOTY) {
        this.GOTY = GOTY;
        this.gameCategory = gameCategory;
        this.gameName = gameName;
        this.gamePlayTime = gamePlayTime;
        this.gameYearRelease = gameYearRelease;
    }

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

    public void setGamePlayTime(float gamePlayTime) {
        this.gamePlayTime = gamePlayTime;
    }

    public void setGameYearRelease(int gameYearRelease) {
        this.gameYearRelease = gameYearRelease;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public String getGameName() {
        return gameName;
    }

    public float getGamePlayTime() {
        return gamePlayTime;
    }

    public int getGameYearRelease() {
        return gameYearRelease;
    }
    public boolean getGOTY() {
        return GOTY;
    }

}
