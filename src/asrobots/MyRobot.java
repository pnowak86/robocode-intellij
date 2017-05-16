package asrobots;

import java.awt.*;

/**
 * Created by RENT on 2017-05-16.
 */
public class MyRobot extends robocode.Robot{


    @Override
    public void run() {

        while(true){
        ahead(100);
        fire(2);
        back(100);
        turnGunLeft(30);}

    }

}
