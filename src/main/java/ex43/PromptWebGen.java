package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class PromptWebGen
{
    //attributes that are asked for by the user
    String sitePath;
    String siteName;
    String siteAuthor;

    //./website/awesomeco/(index.html),(js),(css)
    //./website/siteName/sitePath(user's choice)

    //this creates the website folder (should appear in the directory)
    public String createWebsite()
    {
        //Sets up the directory
            String directory = siteName;
        //Creates a new file within the directory
            File newFolder = new File(directory);

        //Creates the folder in the directory(mkdirs means to make directory)
            newFolder.mkdirs();
        //Returns folder to the directory to test it
            return directory;
    }

    //THIS IS WHERE HTML FILE FUNCTION STARTS
    //Create a function to create the HTML file
    public String createHTMl()
    {
        //Create the path
        String directory = siteName + "/index.html";

        //Contents of the file are created here
        String htmlContent = "<title> " + siteName + " </title>\n<meta> " + siteAuthor + " </meta>";

        //Create the file itself
        File file = new File(directory);

        try
        {
            //Writes in the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;

            //Stop in case anything goes wrong
        }
        catch(Exception ex)
        {
            return "Something has gone wrong with the file.";
        }

    }
    //THIS IS WHERE HTML FUNCTION STOPS


    //THIS IS WHERE JS FUNCTION BEGINS
    //Create function to create the JS folder
    public String createJSFolder()
    {
        //Set up directory
        //./website/awesomeco/js/ needs to look like that
        String directory = siteName + "/js/";

        //Creates a new file within the directory
        File newFolder = new File(directory);

        //Creates the folder in the directory
        newFolder.mkdirs();
        //Returns folder to the directory to test it
        return directory;
    }
    //THIS IS WHERE JS FUNCTION STOPS


    //THIS IS WHERE CSS FUNCTION BEGINS
    //Create a function to create the CSS folder
    public String createCSSFolder()
    {
        //Set up directory
        //./website/awesomeco/css/ needs to look like that
        String directory = siteName + "/css/";

        //Creates a new file within the directory
        File newFolder = new File(directory);

        //Create the folder in the directory
        newFolder.mkdirs();
        //Returns folder to the directory to test it
        return directory;
    }
    //THIS IS WHERE CSS FUNCTION STOPS
}