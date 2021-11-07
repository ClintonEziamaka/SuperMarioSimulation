import java.util.List;

public class Level2 extends GameLevel {
    
    public Level2() {
    name = "Level 2";
    environment = "classroom, cafeteria, security, escalators";
    
    }
    
     public List<Enemy> createEnemies() {
            for (int i=0; i<=6; i++) {
                Enemy ene = new Gloomba();
                enemies.add(ene);
            }
            for (int i=0; i<=7; i++) {
                Enemy ene2 = new PoisonPiranhaPlant();
                enemies.add(ene2);
            }
            for (int i=0; i<=14; i++) {
                Enemy ene3 = new DryBonesKoopa();
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
