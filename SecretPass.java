/**
 * Randomly generate passwords.
 *
 * @author APCS Team
 * @version FLVS 2021
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
public class SecretPass
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int randNum = 0; 
        int length = 0;  
  /**
  *48 to 57 numbers
  *65 to 91 uppercase
  *97 to 122 lowercase
  */
      

        String password = "";
        

    // initialize scanner and print writer
        Scanner in = new Scanner(System.in);

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
        // the user wants to continue

   // Ask for password length 
         System.out.println(" Enter a password Length :");
         int pwLength = in.nextInt();
         String password2 = String.valueOf(pwLength);
     // validate password length
         while(pwLength < 6)
        {
             System.out.println(" Password Length too short. Please try again.");
             pwLength = in.nextInt();
         
         

         for( int i = 0; i < length; i++){
            int randNumber = (int)(Math.random() * 10) + 48;
           int randNumber2 = (int)(Math.random() * 26) + 65;
           int randNumber3 = (int)(Math.random() * 26) + 97;

           String lowercase = String.valueOf(randNumber);
           String uppercase = String.valueOf(randNumber2);
           String numbers = String.valueOf(randNumber3);

           String choices[] = {lowercase, uppercase, numbers};
           int randomChar =(int)(Math.random() * 0) + 3 ;
           String RandomCHar = choices[randomChar];

           System.out.println(RandomCHar);
         }  
            
        }//end while

    // generate a random character in the correct character set
 
    
    // write the password to the file
        System.out.println(password);

        // when the user is done, close the text file so that it can be re-opened and read


        // Read passwords back from text file and display to the screen

        

  }//end main
}//end class
