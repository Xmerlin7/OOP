public class Games {
    protected int gameYearPublish;
    protected int gameTime;
    protected String gameCategory;
    protected boolean GOTY;

    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }

    public void setGOTY(boolean gOTY) {
        GOTY = gOTY;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
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

    public int getGameYearPublish() {
        return gameYearPublish;
    }

    Games() {
        System.out.println("Super constructor");

    }
}