/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.Player.winner;
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
    
    public static boolean end_check(List player_exp){           //To check if game ended
        int mostexp = 0;
        int k = 0;
        for(int i = 0; i < player_exp.size(); i++){
            if(mostexp < (int)player_exp.get(i)){
                mostexp = (int)player_exp.get(i);
                k = i;
            }
        }    
        
        winner(k);
        //kk
        if(mostexp == 0)
            return false;
        else
            return true;
    }
}
