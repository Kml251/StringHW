/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringhw;
import inpututilities.InputUtilities;

/**
 *
 * @author kamil
 */
public class StringHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is a simple program for string with using InputUtilities
        
        String userName = ""; // Variable to store the user's input name
        
        // Creating an instance of InputUtilities to handle input operations
        InputUtilities myInput = new InputUtilities();
        
        String result = "";// Variable to store the reversed version of the name
               
        // Using InputUtilities to prompt the user to enter a username
        userName = myInput.askUserForText("Please enter your name: ");
             
        // To return the user name using a loop
        for(int i = userName.length()-1; i >=0; i--) {
        result +=userName.charAt(i); // Each character should be attached in reverse order.
                
    }
        // To show output the reversed name to the user
        System.out.println("Your name read backwards is " + result);
        
        //To calculate user's name lenght
        System.out.println("Your name's lenght is: " + result.length());
        
        String AllUpper =""; //Variable to store a new reversed version of the name
        
        AllUpper = userName.toUpperCase(); //Making user's name all capital
        
        //To print user's name with Upper charecters
        System.out.println("Your name is: " + AllUpper);
        
        
    }
    
}
