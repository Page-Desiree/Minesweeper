/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Scanner;
/**
 *
 * @author ribell
 * Launa Romrell was here
 */
public class Minesweeper {
    
        String name;
        String instructions = "Click on the squares but don't hit mines!!!";

        public static void main(String[] args) {
             Minesweeper myGame = new Minesweeper();
                 myGame.getName();
                 myGame.displayHelp();
                 Board board = new Board();
                 board.displaySize();
    }
        public void getName() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter you name: ");
            this.name = input.next();
            
        }
        
        public void displayHelp() {
            System.out.println("\nWelcome " + this.name + "\n");
            System.out.println(this.instructions);
        }
        
        
}
