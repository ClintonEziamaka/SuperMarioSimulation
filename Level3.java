import java.util.List;
import java.util.*;


public class Level3 extends GameLevel{
    
    public Level3() {
    name = "Level 3";
    environment = "lecture halls, classrooms, mezzanine";
    
    }
    
    public List<Enemy> createEnemies() {
        for (int i=0; i<=11; i++) {
            Enemy ene = new GiantPiranhaPlant();
            enemies.add(ene);
        }
        for (int i=0; i<=11; i++) {
            Enemy ene2 = new SuperKoopa();
            enemies.add(ene2);
        }
        for (int i=0; i<=11; i++) {
            Enemy ene3 = new Choomba();
            enemies.add(ene3);
        }
        return enemies;
    }
    
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("[");
        for(int i=0; i<=35; i++) {
        Random random = new Random();
        display.append(createEnemies().get(random.nextInt(createEnemies().size())));
        display.append(", ");
        }
        display.append("]");
        return display.toString();
    }
}
