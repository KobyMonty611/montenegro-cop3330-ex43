/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Koby Montenegro
 */

package ex43;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        //This is where the inputs are taken in
        Scanner scan = new Scanner(System.in);

        //Input names
        String inputName;
        String inputAuthor;
        String inputCSS;
        String inputJS;

        //User is prompted to answer questions
        System.out.print("Site name: ");
        inputName = scan.nextLine();

        System.out.print("Author: ");
        inputAuthor = scan.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        inputJS = scan.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        inputCSS = scan.nextLine();


        //PromptWebGen does the magic here
        PromptWebGen newWebGen = new PromptWebGen();

        //Set the attributes for the website
        newWebGen.siteName = inputName;
        newWebGen.siteAuthor = inputAuthor;

        //It's always this since we need to see it in the IDE directory
        //THIS DOES NOT GET CHANGED FOR THIS EXERCISE
        newWebGen.sitePath = "src/main/java/ex43/";

        //Create the website and the HTML file
        System.out.println("Created ./website/" + newWebGen.createWebsite());
        System.out.println("Created ./website/" + newWebGen.createHTMl());


        //If user wants to create a JS Folder
        if(inputJS.equals("y"))
            System.out.println("Created ./website/" + newWebGen.createJSFolder());

        //If user wants to create a CSS Folder
        if(inputCSS.equals("y"))
            System.out.println("Created ./website/" + newWebGen.createCSSFolder());

        scan.close();
    }

}
