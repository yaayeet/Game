/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import static Model.Player.winner;
import static Model.Player.play_turn;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class board {
    
//    public static boolean end_check(List player_exp){           //To check if game ended
//        int mostexp = 0;
//        int k = 0;
//        for(int i = 0; i < player_exp.size(); i++){
//            if(mostexp < (int)player_exp.get(i)){
//                mostexp = (int)player_exp.get(i);
//                k = i;
//            }
//        }    
//        
//        winner(k);
//        //kk
//        if(mostexp == 0)
//            return false;
//        else
//            return true;
//    }
    

    private Player  a = new Player();
    private Player  b = new Player();
    
    public static String player_names(String[] names)
    {               // return who plays first
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        String player1 = names[n];
        
        return player1;
    }
    
    public static void index_from_button(int n){
        // check if the color matches
        // edit the hand
        play_turn(n);
    }

    public static int place_claim(int e)// this is to place down a card
    {
        int i = 0;
        
        
        for(i = 0; i < e; i++)
        {
           return e;
        }
        return e;
    }
    
    static int pnum = -1;
    public static int set_player_num(){ 
        if(pnum == -1)
            pnum = 0;
        else
            pnum = 1;
        
        return pnum;
    }
    
    public static String what_player(){
        
        //if(a.getplayer_num() == 0)
            //return X;
        //else 
            //return Y;
        
        return "NAME";
    }
}
