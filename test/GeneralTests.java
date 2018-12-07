/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Player;
import Control.board;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class GeneralTests {
    
    public GeneralTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void setup(){
    // checking to see if everyone has necessary game components
    }
    
    @Test 
    public void validmove(){
         
    // if it does one and only one of the three possible moves
    }
    
    @Test
    public void scorecheck(){
   
        // checks to see who is winning
    }
    
    @Test
    public void route(){
        // if the route is valid
        // if the route is available
    }
    
    @Test
    public void endcheck(){ 
        List<Integer> player_exp = new ArrayList<>();
        player_exp.add(1);

        assertEquals(true, board.end_check(player_exp));
    
    }
    
    @Test
    public void playercheck(){
        assertEquals(true, Player.player_count());
    }
            
}
