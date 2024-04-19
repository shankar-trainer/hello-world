package question;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainException {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    public void getCandidateDetails(String input1, String expected1, String input2, String expected2, String input3, String expected3) {
        Candidate candidate = new Candidate();
        candidate.setName(input1);
        candidate.setGender(input2);
        //candidate.setExpectedSalary(Double.valueOf(input3));

        System.out.println("input1 " + input1 + " expected 1 " + expected1);
        System.out.println("input2 " + input2 + " expected 2 " + expected2);
        System.out.println("input3 " + input3 + " expected 3 " + expected3);

       /* Throwable exception = assertThrows(InvalidSalaryException.class, () -> {
            candidate.setExpectedSalary(Double.valueOf(expected3));
        });
        assertEquals("Registration Failed. Salary cannot be less than 10000.", exception.getMessage());
*/
        //"Expect salary exception");

        try{
            candidate.setExpectedSalary(Double.valueOf(input3));
        }
        catch (InvalidSalaryException e){
            assertEquals("Registration Failed. Salary cannot be less than 10000.", e.getMessage());
        }

        assertEquals(expected1, candidate.getName());
        assertEquals(expected2, candidate.getGender());
        assertEquals(Double.valueOf(expected3), candidate.getExpectedSalary());
    }
}
//kamal,   kamal,      male,    male,   90000, Registration Failed. Salary cannot be less than 10000.