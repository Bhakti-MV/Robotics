/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhakti
 */
import ch.aplu.robotsim.*;

public class Practical_1a {
    Practical_1a(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        g.forward(500);
        g.left(250);
        g.forward(500);
        g.right(250);
        g.forward(500);
    }
    
    public static void main (String[] args) {
        new Practical_1a();
    }
}
