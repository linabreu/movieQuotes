/*
 Lina Breunlin
 Module 6 Programming Assignment Part A
 This program allows the user to type as many movie quotes as they want thare are then saved to an external text file
 */
package gatherquotes;

import java.io.BufferedWriter;
import java.io.*;
import java.util.Scanner;


public class GatherQuotes 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in); 
        String movieQuote = " ";
        
        try
        {
            BufferedWriter writer = 
                    new BufferedWriter (new FileWriter ("quotes.txt"));
            System.out.println("Please enter a movie quote or type Q to quit");
            movieQuote = in.nextLine();
           
           while (!movieQuote.equals("Q"))
           {
             writer.write(movieQuote);
             writer.flush();
             writer.newLine();
             System.out.println("Please enter a movie quote or type Q to quit");
             movieQuote = in.nextLine();
 
           }
        }
        catch (IOException e) 
        {
            System.out.println("There was a problem saving your movie quote");   
        }
    }   
}


