/*
package tank;

import javax.swing.text.Position;
import java.lang.ref.PhantomReference;

public class Tank {
    // reikia 2 intu koordinatems
    private  int x;
    private  int y;
    private  Direction direction;
    private int northShootCount;
    private  int southShootCount;
    private  int westShootCount;
    private int eastShootCount;
    

    Tank(){
        x = 0;
        y = 0;
        northShootCount = 0;
        southShootCount = 0;
        westShootCount = 0;
        eastShootCount = 0;
    }

    //susirasome metodus

    void pirmyn(){
        y++;
        direction = Direction.NORTH;
        moveInfo();

    }
    void atgal(){
        y--;
        direction = Direction.SOUTH;
        moveInfo();

    }
    void kairen(){
        
        x--;
        direction = Direction.WEST;
        moveInfo();

    }
    void desinen(){
        x++;
        direction = Direction.EAST;
        moveInfo();

    }void suvis(){
        switch (direction){
            case NORTH -> northShootCount++;
            case SOUTH -> southShootCount++;
            case WEST -> westShootCount++;
            case EAST -> eastShootCount++;
        }
        System.out.println(direction);

    }
    void info(){
        System.out.println("Tanko koordinstes (%s;%s), kryptis %s, suvis %s, i siaure %s, i rytus %s, i vakarus %s", x, y, direction, northShootCount, southShootCount, eastShootCount, westShootCount);

    }
    void moveInfo(){
        System.out.printf("Tankas pajuda i %s kordinates: (%s;%s), direction", direction, x, y);
    }

}
*/
