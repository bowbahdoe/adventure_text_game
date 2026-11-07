package pakage01;

public class shop {
    private final Game game;

    shop(Game game) {
        this.game = game;
    }

    public String name = "shop";

    public weapon buysword(){
        game.player1.gold -= 15;
        return new sword();
    }
    
    public weapon potion(){
        game.player1.gold-=5;
        return new potion();
    }
}
