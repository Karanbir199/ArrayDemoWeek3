/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author T450
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a Word");
        Scanner input = new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for(int i=0; i<myLetters.length; i++){
            myLetters[i] = myWord.charAt(i);
        }
        
        
        
        System.out.println("Printing in reverse");
        
        for (int i=myLetters.length-1;i>=0;i--){
            System.out.println(myLetters[i]);
        }
    }
}
    

