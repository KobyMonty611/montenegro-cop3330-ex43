package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WebGenTest
{

    @Test
    void createWebsite_works()
    {
        //Call the class to perform the function
        PromptWebGen testGen = new PromptWebGen();

        //It's not "src/test/java/ex43/" since we won't be calling from the test folder
        //Put in the values here so they can be used in PromptWebGen
        testGen.sitePath = "src/main/java/ex43/";
        testGen.siteName = "thissiteisatest";
        testGen.siteAuthor = "Aidan Ford";

        //
        String expected = "thissiteisatest";
        String actual = testGen.createWebsite();

        //Compares the strings to see if equal
        assertEquals(expected, actual);
    }


    @Test
    void createHTMl()
    {
        //Use the function and save the return value.
        PromptWebGen testGen = new PromptWebGen();

        //It's not "src/test/java/ex43/" since we won't be calling from the test folder
        //Put in the values here so they can be used in PromptWebGen
        testGen.sitePath = "src/main/java/ex43/";
        testGen.siteName = "thissiteisatest";
        testGen.siteAuthor = "Aidan Ford";

        String expected = "thissiteisatest/index.html";
        String actual = testGen.createHTMl();

        //Compares the strings to see if equal
        assertEquals(expected, actual);
    }


    @Test
    void createJSFolder()
    {

    //Use the function and save the return value.
        PromptWebGen testGen = new PromptWebGen();

        //It's not "src/test/java/ex43/" since we won't be calling from the test folder
        //Put in the values here so they can be used in PromptWebGen
        testGen.sitePath = "src/main/java/ex43/";
        testGen.siteName = "thissiteisatest";
        testGen.siteAuthor = "Aidan Ford";

        String expected = "thissiteisatest/js/";
        String actual = testGen.createJSFolder();

        //Compares the strings to see if equal
        assertEquals(expected, actual);

    }


    @Test
    void createCSSFolder()
    {
        //Use the function and save the return value.
        PromptWebGen testGen = new PromptWebGen();

        //It's not "src/test/java/ex43/" since we won't be calling from the test folder
        //Put in the values here so they can be used in PromptWebGen
        testGen.sitePath = "src/main/java/ex43/";
        testGen.siteName = "thissiteisatest";
        testGen.siteAuthor = "Aidan Ford";

        String expected = "thissiteisatest/css/";
        String actual = testGen.createCSSFolder();

        //Compares the strings to see if equal
        assertEquals(expected, actual);

    }
}
