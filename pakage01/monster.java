package pakage01;

public class monster {
    private final Game game;

    monster(Game game) {
        this.game = game;
    }

    public int health= 50;

    public int attack(){
        int damage = game.rand.nextInt(1,21);
        return damage;
    }

}
