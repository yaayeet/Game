/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.board.plays_first;
import static Model.card_decks.route_deck;
import static Model.card_decks.train_deck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Player {

    /**
     * @param args the command line arguments
     */
    
    static String[] player_name = {"Andy", "Hasan", "Mark" , "Julius"};
    
    static String firstplay = plays_first(player_name);         //get the name of the player who plays first
    
    Player(){                                                   // a constructor to generate hands for each player.
        List hand = new ArrayList();                         // hand of the player
        player_hand(hand);                                  //fill up player's hand
    }
    
    public static void winner(int n){                       //Winner name displayed
        System.out.println("Winner is: " + player_name[n]);
    }
    
    //Random Exp values    
    
    public static boolean end_check(List player_exp){           //To check if game ended
        int mostexp = 0;
        int k = 0;
        for(int i = 0; i < player_exp.size(); i++){
            if(mostexp < (int)player_exp.get(i)){
                mostexp = (int)player_exp.get(i);
                k = i;
            }
        }    
        
        //winner(k);
        //kk
        if(mostexp == 0)
            return false;
        else
            return true;
    }
    
    public static boolean player_count(){               //Count the number of players in the game.
        if(player_name.length <= 3 && player_name.length > 0)
            return true;
        
        return false;
    }
    
    public static String[] player_name(){
        return player_name;
    }
    
    public static void player_hand(List hand){
        List trains = new ArrayList();
        List routes = new ArrayList();
        trains = train_deck();
        routes = route_deck();
        
        hand.add(0, trains);                    // adds the train cards to the hand.
        hand.add(1, routes);                    // adds the route card to the hand.
    }
    
    public static void main(String[] args) {
        // TODO code application logic here\
        //System.out.println("TICKET TO RIDE");
        //System.out.println("THE CROSS-COUNTRY TRAIN ADVENTURE GAME!");
        //board b = new board();
        //System.out.println(b);
    }
    
}
