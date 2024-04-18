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

        Throwable exception =  assertThrows(InvalidSalaryException.class, () -> {
            candidate.setExpectedSalary(Double.valueOf(expected3));
        });
                //"Expect salary exception");
        assertEquals("Registration Failed. Salary cannot be less than 10000.", exception.getMessage());

        assertEquals(expected1, candidate.getName());
        assertEquals(expected2, candidate.getGender());
        assertEquals(Double.valueOf(expected3), candidate.getExpectedSalary());
    }
}
//kamal,   kamal,      male,    male,   90000, Registration Failed. Salary cannot be less than 10000.