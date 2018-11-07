/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Administrator
 */
public class Destination {
    private Symbol value;
    
    /**
     * Initialize square
     * @param _value initial Symbol of this square
     */
    public Destination(Symbol _value) {
        value = _value;
    }
    
    /**
     * Check if a domino's Symbol matches this square
     * (to help determine if the domino placement is legal)
     * @param target Symbol (from a domino) to match
     * @return true if the target and the square match
     */
    public boolean hasSymbol(Symbol target) {
        return value.equals(target);
    }
    
    /**
     * Mark the square as used
     */
    public void markUsed() {
        value = Symbol.BLANK;
    }
    
    /**
     * Get representation of one square for use
     * in displaying board
     * @return the representation
     */
    @Override
    public String toString() {
        return value.toString();
    }
}
