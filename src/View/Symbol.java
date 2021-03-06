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
public enum Symbol {
//    PLUS, CROSS, DOT, DIAMOND, SQUARE, CLOVER, CIRCLE, BLANK;
    SF,LA,WA,TX,BLANK, DASH, VERT;
    // The following array is mapped to the above list of values
    // Any change to either should cause a check if the other is still
    // consistent with the other.
    // Could use better unicode characters if those are supported
    // Basic NetBeans support is not great, though there is apparently
    // a plugin
    static final String repr[] = {"San Francisco", "Los Angeles", "Washington", "Texas", " ", "-" , "|"};

    /**
     * Produce single character String representation
     * @return the String to use
     */
    @Override
    public String toString() {
        return repr[this.ordinal()];
    }
}
