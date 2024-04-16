package question;

import com.howtoprogram.junit5.StringUtils;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainException {
    @Test
    public  void getCandidateDetails()  {
//        Candidate candidate = new Candidate();
//        candidate.setName("ram kumar");
//        candidate.setGender("male");
//        candidate.setExpectedSalary(10000);

        //String input = "add 5";
//        InputStream in = new ByteArrayInputStream(candidate.toString().getBytes());
  //      System.setIn(in);
    //    assertEquals("add 5", inputOutput.getInput());

        assertThrows(InvalidSalaryException.class, () -> {
            Main.getCandidateDetails();
        },"Registration Failed. Salary cannot be less than 10000.");
        //return  candidate;
    }
}
