/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Collections;
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
    
    public static List train_deck(){        // A function that return random cards in a list
        List deck = null;                   //deck to be returned
        List tdeck = null;                  //orinal train deck
        for(int i = 0; i < 110; i++)        // First add card numbers into the list
            tdeck.add(i);
        Collections.shuffle(deck);          // Shuffle it like a normal physical deck.
        
        for(int i = 0; i < 4; i++){
            deck.add(i, tdeck.get(i));      // grab the first 4 cards to distribute to player.
            tdeck.remove(i);                // remove cards from the orignal deck
        }
        
        face_up(tdeck);                     //call for cards to be faced up.
        
        tdeck.clear();                      //clears the list for a reshuffle 
        return deck;                        //return the deck list to the player
    }
    
    public static List face_up(List up){    //Returns cards to be faced up.
        List Faces = null;
        for(int i = 0; i < 5; i++){
            Faces.add(up.get(i));
        }
        
        return Faces;
    }
    
    public static List route_deck(){
        List deck = null;                   //deck to be returned
        List rdeck = null;                  //orignal route deck
        for(int i = 0; i < 30; i++)        // First add card numbers into the list
            rdeck.add(i);
        Collections.shuffle(deck);          // Shuffle it like a normal physical deck.
        
        for(int i = 0; i < 3; i++){
            deck.add(i, rdeck.get(i));      // grab the first 3 cards to distribute to player.
            rdeck.remove(i);                // remove cards from the orignal deck
        }
        
        rdeck.clear();                      //clears the list for a reshuffle 
        return deck;                        //return the deck list to the player
    }
    
    public static void main(String[] args) {
        // TODO code application logic here\
        System.out.println("TICKET TO RIDE");
        System.out.println("THE CROSS-COUNTRY TRAIN ADVENTURE GAME!");
    }
    
}
