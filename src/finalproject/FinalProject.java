/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static List train_deck(){                // A function that return random cards in a list
        List tdeck = null;
        Random rnd = new Random();
        for(int i = 0; i < 5; i++)
            tdeck.add(i, rnd.nextInt(200) + 1);
        return tdeck;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here\
        System.out.println("TICKET TO RIDE");
        System.out.println("THE CROSS-COUNTRY TRAIN ADVENTURE GAME!");
    }
    
}
