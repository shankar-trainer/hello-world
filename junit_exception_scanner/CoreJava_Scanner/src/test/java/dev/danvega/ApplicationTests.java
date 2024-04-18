package dev.danvega;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ApplicationTests {

    @Test
    public void validUserInput_ShouldResultInExpectedOutput() {
        String userInput = String.format("Dan%sVega%sdanvega@gmail.com",
                System.lineSeparator(),
                System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String expected = "Dan,Vega,danvega@gmail.com";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        Application.main(null); // call the main method

        String[] lines = baos.toString().split(System.lineSeparator());
        String actual = lines[lines.length-1];

        // checkout output
        Assert.assertEquals(expected,actual);
    }


}