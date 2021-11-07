import java.util.*;

public class Level1 extends GameLevel{
    GameWorld world1 = new CentennialHall();
    
    public Level1() {
    name = "Level 1";
    environment = "classroom, labs, fitness facility, gym";
    
    }
    
    public List<Enemy> createEnemies() {
        for (int i=0; i<=6; i++) {
            Enemy ene = new PiranhaPlant();
            enemies.add(ene);
        }
        for (int i=0; i<=6; i++) {
            Enemy ene2 = new KoopaTroopa();
            enemies.add(ene2);
        }
        for (int i=0; i<=6; i++) {
            Enemy ene3 = new Goomba();
            enemies.add(ene3);
        }
        return enemies;
    }
    
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append(createEnemies());
        return display.toString();
    }
    
    
}
