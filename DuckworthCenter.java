
public class DuckworthCenter extends GameWorld {
    
    GameLevel createLevel(int i) {
        if (i == 1) {
            return new Level1();
        }else if (i == 2) {
            return new Level2();
        }else if (i == 3) {
            return new Level3();
        } else return null;
        
    }

        
 }
