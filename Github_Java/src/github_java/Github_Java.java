//single line comment
//This is my first java project


/*This is a 
multi line 
comment
*/
package github_java;
import java.util.Scanner;
// Access modifiers-Private, Public, Protected
// File is Gihub_java
// Github_Java is the class therefore class is file
public class Github_Java {
    
    /*
    {This is a block}
    */
    //This statement is a method
    //Static is 1 copy of a method, there is 1 instance of the method
    //Void - returns nothing
    public static void main(String[] args) {
        // object scanner (user input 1)
        Scanner inputOne = new Scanner (System.in);
        
        
    
        // Data types
        //variables
        //[R][i][k][o]
    String myName="Riko";
    char initial = 'h';
    int myAge = 8;
    double myExactAge = 8.95;
     
    System.out.print("Hello" + " " + myName + "!");
    System.out.println("\n Please enter your ID:");
    String ID = inputOne.next();
    }
}
    
    
    
    
    /*
    // int is a data type 42,24114
    int methodExample(){
        return 1;
    }
*/



