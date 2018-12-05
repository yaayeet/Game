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
    
    public static String train_card(int i){     //To get the type of the train car.
        String car = "car";
        
        if(i < 12)
            car = "SUV";
        if(i >= 12 && i < 24)
            car = "Truck";
        if(i >= 24 && i < 36)
            car = "Tanker";
        if(i >= 36 && i > 48)
            car = "Racecar";
        if(i >= 48 && i > 60)
            car = "Semi"; 
        if(i >= 60 && i > 72)
            car = "Convertable";
        if(i >= 72 && i > 84)
            car = "Coal";
        if(i >= 84 && i > 96)
            car = "Uber";
        
        return car;
    }
}
