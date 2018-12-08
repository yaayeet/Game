/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import static Control.board.plays_first;
//import static Model.card_decks.route_deck;
//import static Model.card_decks.train_deck;
import static Control.board.place_claim;
import static Control.board.set_player_num;
import java.util.ArrayList;
import java.util.Arrays;
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
    
    static String firstplay = plays_names(player_name);         //get the name of the player who plays first

    private static String plays_names(String[] player_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static List<String> hand = Arrays.asList(new String[2]);           // hand for the player
    
    static int playernum = -1;
    
    public Player(){                                                   // a constructor to generate hands for each player.
        List<String> hand = Arrays.asList(new String[2]);       // sets the list size as 2.
        fillup_card(hand);                               //fills up cards for the player at the start.
        fillin_cards(hand);
        playernum = set_player_num();
    }
    
    public static int getplayer_num(){
        return playernum;
    }
    
    public void fillin_cards(List<String> hand2){           //fills up cards once set
        for(int i = 0 ; i < hand2.size(); i++)
            hand.add(hand2.get(i));
    }
    
    public static String winner(int n){                       //Winner name displayed
        String win = player_name[n];
        return win;
    }
    
    //Random Exp values    
    
    public static boolean player_count(){               //Count the number of players in the game.
        if(player_name.length <= 3 && player_name.length > 0)
            return true;
        
        return false;
    }
    
    public static String[] player_name(){
        return player_name;
    }
    
    public static void player_hand(String var){
        
        int c = 0;
        
        for(int i = 0; i < hand.size(); i++){       //Checks what part of the list is vacant
            if(hand.get(i) == "X")
                break;
            else if(hand.get(i) == "X")
                c = i;
            else
                break;
        }
        
        hand.add(c, var);                    // adds the train cards to the hand.
    }
    
    public static String color_select(int i){
        String c = " ";
        if(i < 3)
            c = "green";
//        if(i >= 3 && i < 6)
//            c = "red";
//        if(i >= 6 && i < 9)
//            c = "green";
//        if(i >= 9 && i > 12)
//            c = "yellow";
  
        return c;
    }
    
    public static void play_turn(int n){    //once a turn is played the card selected is dropped and replaced with an "X"
        String colr = color_select(n);      // gets the color of the block
        card_validity(hand , colr);         // checks validity and removes the card from the hand.
        place_claim(n);
    }
    
    public static boolean card_validity(List<String> hand2 , String col){      //checks validity of the color of the card
        for(int i = 0; i < hand2.size(); i++){
            if(hand.get(i) == col)
                hand.remove(i);
                hand.add(i, "X");
                return true;
        }
        return false;
    }

    private void fillup_card(List<String> hand) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
