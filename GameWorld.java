
public abstract class GameWorld {
    abstract GameLevel createLevel(int i);
    
    public GameLevel playLevel(int type) {
        GameLevel level = createLevel(type);
        System.out.println("***Setting up "+ this.getClass().getName()+" "+level.getName()+"***");
        level.renderEnvironment();
        level.renderEnemies();
        level.spawnEnemies();
        // System.out.println("***Completed playing " + this.getClass().getName()+" "+level.getName()+"***");
        return level;
    }
}

