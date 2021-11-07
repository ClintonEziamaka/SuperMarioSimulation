/**
 * ACS-3913 - Assignment 3
 */

public class SuperMarioUWDriver{
    public static void main(String[] args){
        GameWorld duckworth = new DuckworthCenter();
        GameWorld centennial = new CentennialHall();
        GameWorld lockhart = new LockhartHall();
        GameLevel level = duckworth.playLevel(1);
        System.out.println(level);
        System.out.println("***Completed playing " + duckworth.getClass().getName()+" "+level.getName()+"***"+ "\n");
        level = centennial.playLevel(2);
        System.out.println(level);
        System.out.println("***Completed playing " + centennial.getClass().getName()+" "+level.getName()+"***"+ "\n");
        level = lockhart.playLevel(3);
        System.out.println(level);
        System.out.println("***Completed playing " + lockhart.getClass().getName()+" "+level.getName()+"***"+ "\n");
    }
}
