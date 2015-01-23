/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.Point;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Rich Bell
 */
public class Board {
    
    int rowCount = 9;
    int columnCount = 9;
    int totalMines = 3;
    
    public Board() {
        
    }   
    
    
    public void displaySize() {
        System.out.println("\n\tThe board is " + this.rowCount + " by " + this.columnCount + " in size. It also includes a total of " + this.totalMines + " mines.");
    }
                      
}
