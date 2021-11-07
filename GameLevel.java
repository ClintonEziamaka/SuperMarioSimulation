import java.util.*;

public abstract class GameLevel {
    String name;
    String environment;
    List<Enemy> enemies = new LinkedList<Enemy>();
    
    public abstract List<Enemy> createEnemies();
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
         n = name;
    }
    
    public String getEnvironment() {
        return environment;
    }
    
    public void setEnvironment(String e) {
        e = environment;
    }
    
    public void renderEnemies() {
        System.out.println("Rendering enemies...");
    }
    
    public void spawnEnemies() {
        System.out.println("Spawning enemies: ");
    }
    
    public void renderEnvironment() {
        System.out.println("Rendering environment: " + getEnvironment());
    }
    

}
