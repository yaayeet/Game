/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class board {
    public static String plays_first(String[] names){               // return who plays first
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        String player1 = names[n];
        
        return player1;
    }
}
