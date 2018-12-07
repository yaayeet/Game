/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.Player.player_hand;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class card_decks {
//    public static List train_deck(){                            // A function that return random cards in a list
//        List<Integer> deck = new ArrayList<Integer>();        //deck to be returned
//        List<Integer> tdeck = new ArrayList<Integer>();       //orinal train deck
//        for(int i = 0; i < 240; i++)                            // First add card numbers into the list
//            tdeck.add(i);
//        Collections.shuffle(deck);          // Shuffle it like a normal physical deck.
//        
//        for(int i = 0; i < 4; i++){
//            deck.add(i, tdeck.get(i));      // grab the first 4 cards to distribute to player.
//            tdeck.remove(i);                // remove cards from the orignal deck
//        }
//        
//        face_up(tdeck);                     //call for cards to be faced up.
//        
//        tdeck.clear();                      //clears the list for a reshuffle 
//        return deck;                        //return the deck list to the player
//    }
//    
//    public static List face_up(List up){    //Returns cards to be faced up.
//        List Faces = null;
//        for(int i = 0; i < 5; i++){
//            Faces.add(up.get(i));
//        }
//        
//        return Faces;
//    }
//    
//    public static List route_deck(){
//        List<Integer> deck = new ArrayList<Integer>();      //deck to be returned
//        List<Integer> rdeck = new ArrayList<Integer>();     //orignal route deck
//        for(int i = 0; i < 30; i++)                         // First add card numbers into the list
//            rdeck.add(i);
//        Collections.shuffle(deck);          // Shuffle it like a normal physical deck.
//        
//        for(int i = 0; i < 3; i++){
//            deck.add(i, rdeck.get(i));      // grab the first 3 cards to distribute to player.
//            rdeck.remove(i);                // remove cards from the orignal deck
//        }
//        
//        //deck = route_select(deck);        //user selects cards out of the 3 route cards.
//        
//        rdeck.clear();                      //clears the list for a reshuffle 
//        return deck;                        //return the deck list to the player
//    }
//    
//    public static List route_select(List rout){
//        //display route
//        //select cards
//        String user_input;
////        while(user_input != "q"){
////            tostring(user_input);
////        }
//        //add and remove cards
//        return rout;
//    }
    
    public String card_deck(){
        String[] color = {"blue" ,"green" , "yellow" , "red"};
        Random rand = new Random();
        return color[rand.nextInt(3)];
    }
    
    public void fillup_card(List<String> hand){
        hand.add(card_deck());
        hand.add(card_deck());
    }
    
    public void card_draw(){
        String color = card_deck();
        player_hand(color);
    }
    
}
