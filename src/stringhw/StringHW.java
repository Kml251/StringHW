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
       
        userName = myInput.askUserForText("Please enter your name: ");
        
       
        for(int i = userName.length()-1; i >=0; i--) {
        result +=userName.charAt(i); // Each character should be attached in reverse order.
        
    }
        // Show output the reversed name to the user
        System.out.println("Your name read backwards is " + result);
        
    }
    
}
