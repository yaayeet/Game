/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Administrator
 */
public class Position {
    static String Pos; // position where player is at 
    
    Position(String i){
        Pos = i;
    }
    
    public static String position(){
        return Pos;
    }
    
}
