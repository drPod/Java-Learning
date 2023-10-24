
/**
 * ArrayPlotter.java  10/18/14
 *
 * @author - Darsh Poddar
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 *
 * The ArrayPlotter class provides methods for drawing in
 *    a grid by setting the boolean values of a 2D array.
 *
 *    Each drawing method must
 *    - take zero arguments,
 *    - have a void return type, and
 *    - have a name that conforms to the on...ButtonClick format.
 *      (This restriction allows the GridPlotterGUI to recognize methods,
 *       for which it automatically generates buttons.)
 *
 * License Information:
 *   This class is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation.
 *
 *   This class is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 */

import javax.swing.JOptionPane;

public class ArrayPlotter {
    /** The Array Plotter Graphical User Interface. */
    private ArrayPlotterGUI gui;

    /**
     * The Color Array. The element values indicate how to color a grid cell:
     * - true: Color the cell with the Drawing Color.
     * - false: Color the cell with the Background Color.
     */
    private boolean[][] colorArray;

    /** Constructs an Array Plotter */
    public ArrayPlotter() {
        gui = new ArrayPlotterGUI(this);
        colorArray = null;
    }

    /**
     * Initialize this's Color Array to a new 2D array of boolean values
     * with the given dimensions.
     * 
     * @param rows the number of rows in the new array.
     * @param cols the number of columns in the new array.
     *             Postcondition: All of the Color Array's elements have the value
     *             false.
     */
    public void initializeColorArray(int rows, int cols) {
        colorArray = new boolean[rows][cols];
    }

    // Drawing Methods

    /** Removes all objects from the grid. */
    public void onClearGridButtonClick() {
        // REPLACE showMessageDialog call with correct code.
        /*
         * JOptionPane.showMessageDialog(
         * null,
         * "The method for clearing the grid has not been implemented yet.",
         * "Under Development",
         * JOptionPane.WARNING_MESSAGE);
         */
        for (int r = 0; r < colorArray.length; r++) {
            for (int c = 0; c < colorArray[r].length; c++) {
                colorArray[r][c] = false;
                gui.update(colorArray);
            }
        }
    }

    /** Fills in all the cells of the grid using a row-major traversal. */
    public void onRowMajorFillButtonClick() {
        // REPLACE showMessageDialog call with correct code.
        /*
         * JOptionPane.showMessageDialog(
         * null,
         * "The method for row-major traversal has not been implemented yet.",
         * "Under Development",
         * JOptionPane.WARNING_MESSAGE);
         */
        for (int r = 0; r < colorArray.length; r++) {
            for (int c = 0; c < colorArray[r].length; c++) {
                colorArray[r][c] = true;
                gui.update(colorArray);
            }
        }
    }

    public void onColMajorFillButtonClick() {
        for (int c = 0; c < colorArray[0].length; c++) {
            for (int r = 0; r < colorArray.length; r++) {
                colorArray[r][c] = true;
                gui.update(colorArray);
            }
        }
    }

    public void onReverseRowMajorFillButtonClick() {
        for (int c = 0; c < colorArray[0].length; c++) {
            for (int r = colorArray.length - 1; r > -1; r--) {
                colorArray[r][c] = true;
                gui.update(colorArray);
            }
        }
    }

    public void onReverseColMajorFullButtonClick() {
        for (int r = colorArray.length - 1; r > -1; r--) {
            for (int c = colorArray[r].length - 1; c > -1; c--) {
                colorArray[r][c] = true;
                gui.update(colorArray);
            }
        }
    }

    public void onMainDiagonalFillButtonClick() {
        int r = 0;
        while (r < colorArray.length) {
            for (int c = 0; c < colorArray[r].length; c++) {
                colorArray[r][c] = true;
                gui.update(colorArray);
                r++;
            }
        }
        /*
         * for (int r = 0; r < colorArray.length; r++) {
         * for (int c = 0; c < colorArray[r].length; c++) {
         * colorArray[r][c] = true;
         * gui.update(colorArray);
         * r++;
         * }
         * }
         */
        /*
         * for (int r = 0; r < colorArray.length; r++) {
         * for (int c = 0; c < colorArray[r].length; c++) {
         * if (r == c) {
         * colorArray[r][c] = true;
         * gui.update(colorArray);
         * }
         * }
         * }
         */
    }

    public void onMainTriangleFillButtonClick() {
        for (int r = 0; r < colorArray.length; r++) {
            for (int c = 0; c <= r; c++) {
                colorArray[r][c] = true;
                gui.update(colorArray);
            }
        }
    }

    public void onOtherDiagonalFillButtonClick() {
        int r = 0;
        while (r < colorArray.length) {
            for (int c = colorArray[r].length - 1; c > -1; c--) {
                colorArray[r][c] = true;
                gui.update(colorArray);
                r++;
            }
        }
    }

    public void onOtherTriangleFillButtonClick() {
        for (int r = 0; r < colorArray.length; r++) {
            for (int c = colorArray.length - 1; c >= r; c--) {
                colorArray[r][c] = true;
                gui.update(colorArray);
            }
        }
    }

    public void onXFillButtonClick() {
        onOtherDiagonalFillButtonClick();
        if (colorArray.length / 2 == 0 || colorArray[1].length / 2 == 0) {
            onMainDiagonalFillButtonClick();
        } else {
            for (int r = 0; r < colorArray.length; r++) {
                for (int c = 0; c < colorArray[r].length; c++) {
                    /*
                     * if (r != c && colorArray.length / 2 != c && colorArray[1].length / 2 != r) {
                     * colorArray[r][c] = true;
                     * gui.update(colorArray);
                     * r++;
                     * }
                     */
                    if (r == c) {
                        if (colorArray.length / 2 != c && colorArray[1].length / 2 != r) {
                            colorArray[r][c] = true;
                            gui.update(colorArray);
                            r++;
                        }
                    }
                }
            }
        }
        /*
         * if (colorArray.length / 2 == 1 || colorArray[1].length / 2 == 1) {
         * onOtherDiagonalFillButtonClick();
         * } else {
         * int r = 0;
         * while (r < colorArray.length) {
         * for (int c = colorArray[r].length - 1; c > -1; c--) {
         * if (c == colorArray.length && r == colorArray[r].length) {
         * colorArray[r][c] = true;
         * gui.update(colorArray);
         * r++;
         * }
         * }
         * }
         * }
         */
    }

    /** main method that creates the grid plotter application. */
    public static void main(String[] args) {
        new ArrayPlotter();
    }
}
