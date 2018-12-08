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
public class card_designs {
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
}
