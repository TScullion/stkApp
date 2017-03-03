
/**
 * A wee simply test program to see how GitHub works
 * 
 * @author (TScullion) 
 * @version (Version 1)
 */

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.math.*;

public class subjectChoice
{
    // instance variables - replace the example below with your own
    private String favouriteSubject;
    private String displayMessage;



    /**
     * Constructor for objects of class subjectChoice
     */
    public subjectChoice()
    {
        // initialise instance variables
        favouriteSubject = "";
        displayMessage = "";

    }

    public void runProgram()
    {
        enterFavouriteSubject();
        subjectDecider();
        displayMessage();
    }

    private void enterFavouriteSubject()
    {
        // ask user what their favourite subject is
        favouriteSubject = JOptionPane.showInputDialog("Please enter your favourite subject");
    }

    
    private void subjectDecider()
    {
        if(favouriteSubject.equals("Computing Science") || (favouriteSubject.equals("Computing"))){
            displayMessage = "Excellent, this is the best subject";
        }
        else if (favouriteSubject.equals("English")){
            displayMessage = "Really!? Only with Dey!";
        }
        else
            displayMessage = "Sounds good!";
    }
    
    private void displayMessage()
    {
        System.out.println(displayMessage);
    }
}
