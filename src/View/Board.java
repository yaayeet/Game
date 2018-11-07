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
public class Board {
    private final Destination BLANK_SQ = new Destination(Symbol.BLANK);
    
     private final Destination[][] board = {
        {BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.CROSS), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ},
        {BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.CIRCLE), new Destination(Symbol.DIAMOND), new Destination(Symbol.SQUARE), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ},
        {BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.CROSS), new Destination(Symbol.DOT), new Destination(Symbol.DIAMOND), new Destination(Symbol.DIAMOND), new Destination(Symbol.DOT), BLANK_SQ, BLANK_SQ, BLANK_SQ},
        {BLANK_SQ, BLANK_SQ, new Destination(Symbol.CLOVER), new Destination(Symbol.DOT), new Destination(Symbol.DOT), new Destination(Symbol.CROSS), new Destination(Symbol.DIAMOND), new Destination(Symbol.CLOVER), new Destination(Symbol.CIRCLE), BLANK_SQ, BLANK_SQ},
        {BLANK_SQ, new Destination(Symbol.DOT), new Destination(Symbol.SQUARE), new Destination(Symbol.DOT), new Destination(Symbol.PLUS), BLANK_SQ, new Destination(Symbol.PLUS), new Destination(Symbol.CLOVER), new Destination(Symbol.CLOVER), new Destination(Symbol.CLOVER), BLANK_SQ},
        {new Destination(Symbol.CIRCLE), new Destination(Symbol.SQUARE), new Destination(Symbol.SQUARE), new Destination(Symbol.DIAMOND), BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.CIRCLE), new Destination(Symbol.SQUARE), new Destination(Symbol.SQUARE), new Destination(Symbol.DIAMOND)},
        {BLANK_SQ, new Destination(Symbol.CLOVER), new Destination(Symbol.SQUARE), new Destination(Symbol.CIRCLE), new Destination(Symbol.DOT), BLANK_SQ, new Destination(Symbol.SQUARE), new Destination(Symbol.CROSS), new Destination(Symbol.CROSS), new Destination(Symbol.PLUS), BLANK_SQ},
        {BLANK_SQ, BLANK_SQ, new Destination(Symbol.CROSS), new Destination(Symbol.CIRCLE), new Destination(Symbol.CIRCLE), new Destination(Symbol.SQUARE), new Destination(Symbol.PLUS), new Destination(Symbol.PLUS), new Destination(Symbol.CLOVER), BLANK_SQ, BLANK_SQ},
        {BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.PLUS), new Destination(Symbol.CIRCLE), new Destination(Symbol.PLUS), new Destination(Symbol.PLUS), new Destination(Symbol.DIAMOND), BLANK_SQ, BLANK_SQ, BLANK_SQ},
        {BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.DIAMOND), new Destination(Symbol.CLOVER), new Destination(Symbol.DOT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ},
        {BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.DIAMOND), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ}        
    };
}
