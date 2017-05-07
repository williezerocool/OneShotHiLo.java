/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneshothilo;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class OneShotHiLo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int myNum, userInput;
        myNum = 1 + r.nextInt(100);
        
        System.out.print("I'm thinkiing of a number between 1-100. Try and guess it! ");
        userInput = keyboard.nextInt();
        
        if(userInput == myNum){
         
            System.out.println("You guessed it! what are the odds?!");
        }else if (userInput < myNum){
        
            System.out.println("You're to low! My number is " + myNum);
        }else{
            
            System.out.println("You're to high! My number is " + myNum);
        }
        
        
        
        
        
    }
    
}
