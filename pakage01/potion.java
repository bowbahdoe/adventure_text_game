package pakage01;

public class potion extends weapons{
    public int id=102;
    public int health = 15;
    public String name="potion";

    public void use(player player1){
        player1.health += 15;
        
    }
}
