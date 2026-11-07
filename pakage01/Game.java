package pakage01;

import java.util.Random;

public class Game {
    ui u = new ui();
    story s = new story(this);
    player player1 =new player(this);
    shop shop1 = new shop(this);
    knife knife1 = new knife();
    int monster=0;
    monster mons;
    fighting fight1;
    Random rand = new Random();

    public static void main(String[] args) {
        new Game();
    }
    public Game(){
        u.setstory(s,shop1,this);
        player1.addweapons(knife1);
    }
    public monster createmonster(){
        return new monster(this);
    }

}
