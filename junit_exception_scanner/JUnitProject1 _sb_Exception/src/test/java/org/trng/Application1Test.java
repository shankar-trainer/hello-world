package org.trng;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;
import static org.junit.jupiter.api.Assertions.*;

class Application1Test {
    public static final String NAME = "Name: ";

    @Test
    void readNamePositive() throws Exception {
        withTextFromSystemIn("Subodh")
                .execute(() -> assertEquals(NAME.concat("Subodh"), Application1.readName()));
    }
    @Test
    void readNameNegative() throws Exception {
        withTextFromSystemIn("Subodh").execute(() -> assertNotEquals(NAME.concat("Subodha"), Application1.readName()));
    }
}