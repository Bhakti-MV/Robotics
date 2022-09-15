/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bhakti
 */
import ch.aplu.robotsim.*;

public class Practical_3 {
    Practical_3(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        while (true){
            g.forward(600);
            g.left(280);
        }
    }
    
    public static void main (String[] args) {
        new Practical_3();
    }
}
