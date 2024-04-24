package question;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CandidateTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    public void getCandidateDetails(String input1, String expected1, String input2, String expected2, String input3, String expected3) {
        Candidate candidate = new Candidate();
        candidate.setName(input1);
        candidate.setGender(input2);
        assertEquals(expected1, candidate.getName());
        assertEquals(expected2, candidate.getGender());

//        candidate.setExpectedSalary(Double.valueOf(input3));
//        Throwable exception = assertThrows(InvalidSalaryException.class, () -> {
//            candidate.setExpectedSalary(Double.valueOf(input3));
//            //assertEquals(Double.valueOf(expected3), candidate.getExpectedSalary());
//        });
//        assertEquals("Registration Failed.Salary cannot be less than 10000.", exception.getMessage());


        try {
            candidate.setExpectedSalary(Double.valueOf(input3));
            assertEquals(Double.valueOf(expected3), candidate.getExpectedSalary());
        } catch (InvalidSalaryException e) {
            assertEquals("Registration Failed.Salary cannot be less than 10000.", e.getMessage());
        }


    }
}
//kamal,   kamal,      male,    male,   90000, Registration Failed. Salary cannot be less than 10000.
//kamal,   kamal,      male,    male,   90000,Registration Failed.Salary cannot be less than 10000.