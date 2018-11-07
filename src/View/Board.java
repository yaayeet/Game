/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.sun.javafx.scene.traversal.Direction;

/**
 *
 * @author Administrator
 */
public class Board {
    private final Destination BLANK_SQ = new Destination(Symbol.BLANK);
    
     private final Destination[][] board = {
        {new Destination(Symbol.SF),new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.LA)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.VERT), BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, BLANK_SQ, new Destination(Symbol.VERT)},
        {new Destination(Symbol.WA),new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.DASH), new Destination(Symbol.TX)}
    };
     
      // To make it a bit easier to figure out where a position is
    // The ending 0 is for 10
    private static final String TOPGUIDE = "   01234567890\n   ___________\n";

    
    /**
     * Get String representation of entire board
     * @return the representation
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int rowNum = 0;

        result.append(TOPGUIDE);
        for (Destination[] row : board) {
            // Use last digit here to be consistent with digits across
            // the top and to make it easier to line things up
            result.append(lastDigit(rowNum++));
            result.append("|");
            for (Destination sq : row) {
                result.append(sq.toString());
            }
            result.append('\n');
        }
        return result.toString();
    }

    // Return row of 2nd half of domino
    private int computeRow(int row, Direction dir) {
        if (dir.equals(Direction.UP))
            return row - 1;
        if (dir.equals(Direction.DOWN))
            return row + 1;
        return row;
    }

    // Return column of 2nd half of domino
    private int computeCol(int col, Direction dir) {
        if (dir.equals(Direction.LEFT))
            return col - 1;
        if (dir.equals(Direction.RIGHT))
            return col + 1;
        return col;
    }

    // Return true if row is not valid, false if valid
    private boolean invalidRow(int row) {
        return (row < 0 || row >= board.length);
    }

    // Return true if column is not valid, false if valid
    private boolean invalidCol(int col) {
        return (col < 0 || col >= board[0].length);
    }
    
    // return last digit of number
    private int lastDigit(int num) {
        // Giving 10 a name here would not really make sense
        // since it does not represent anything else
        return num % 10;
    }
}
