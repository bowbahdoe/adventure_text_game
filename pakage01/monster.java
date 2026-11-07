package pakage01;

import java.util.Random;

public class monster {
    public int health= 50;
    public int attack(){
        Random rand = new Random();
        int damage = rand.nextInt(1,21);
        return damage;
    }

}
