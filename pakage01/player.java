package pakage01;
import java.util.Random;

public class player {
    public int health=50;
    public int gold=30;
    knife knife1 = new knife();

    weapons[] w = new weapons[5];
    weapons[] p = new weapons[5];


    weapons currentweapon;
    public void addpotion(weapons p1){
        for(int i=0;i<w.length;i++){
            if(p[i]==null){
                p[i]=p1;
                break;
            }
        }
    }
    public void addweapons(weapons w1){
        for(int i=0;i<w.length;i++){
            if(w[i]==null){
                w[i]=w1;
                break;
            }
        }
    }

    public void useitem(int id){
        for(int i=0;i<w.length;i++){
            if(w[i].id == id){
                currentweapon=w[i];
            }
            else{

            }
        }
    }

    public int attack(){
        Random rand = new Random();
        int damage = rand.nextInt(1,11);
        damage+=currentweapon.damage;
        return damage;
    }

}
