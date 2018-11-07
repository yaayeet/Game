/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import View.Board;
import java.util.ArrayList;
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
    
    static String[] player_name = {"Andy", "Hasan"};
    
    
    public static List train_deck(){                            // A function that return random cards in a list
        List<Integer> deck = new ArrayList<Integer>();        //deck to be returned
        List<Integer> tdeck = new ArrayList<Integer>();       //orinal train deck
        for(int i = 0; i < 240; i++)                            // First add card numbers into the list
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
        List<Integer> deck = new ArrayList<Integer>();      //deck to be returned
        List<Integer> rdeck = new ArrayList<Integer>();     //orignal route deck
        for(int i = 0; i < 30; i++)                         // First add card numbers into the list
            rdeck.add(i);
        Collections.shuffle(deck);          // Shuffle it like a normal physical deck.
        
        for(int i = 0; i < 3; i++){
            deck.add(i, rdeck.get(i));      // grab the first 3 cards to distribute to player.
            rdeck.remove(i);                // remove cards from the orignal deck
        }
        
        rdeck.clear();                      //clears the list for a reshuffle 
        return deck;                        //return the deck list to the player
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
    
    public static String color_card(int i){     //To get the color.
        String color = "NoColor";
        
        if(i < 45)
            color = "blue";
        if(i >= 45 && i < 90)
            color = "red";
        if(i >= 90 && i < 135)
            color = "green";
        if(i >= 135 && i > 180)
            color = "yellow";
        if(i >= 180 && i > 225)
            color = "black";       
        
        return color;
    }
    
    public static String train_card(int i){     //To get the type of the train car.
        String car = "Locomotives";
        
        if(i < 12)
            car = "Box";
        if(i >= 12 && i < 24)
            car = "Passenger";
        if(i >= 24 && i < 36)
            car = "Tanker";
        if(i >= 36 && i > 48)
            car = "Reefer";
        if(i >= 48 && i > 60)
            car = "Freight"; 
        if(i >= 60 && i > 72)
            car = "Hopper";
        if(i >= 72 && i > 84)
            car = "Coal";
        if(i >= 84 && i > 96)
            car = "Caboose";
        
        return car;
    }
    
    public static boolean player_count(){               //Count the number of players in the game.
        if(player_name.length <= 3 && player_name.length > 0)
            return true;
        
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here\
        System.out.println("TICKET TO RIDE");
        System.out.println("THE CROSS-COUNTRY TRAIN ADVENTURE GAME!");
        Board b = new Board();
        System.out.println(b);
    }
    
}
