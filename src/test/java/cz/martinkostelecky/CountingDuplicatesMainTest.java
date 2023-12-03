package cz.martinkostelecky;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountingDuplicatesMainTest {
    /**
     * Method under test: {@link Main#duplicateCount(String)}
     */
    @Test
    void shouldReturnOneDuplicate() {
        assertEquals(1, Main.duplicateCount("Text"));
    }

    @Test
    void shouldReturnZeroDuplicates() {
        assertEquals(0, Main.duplicateCount(""));
    }

    @Test
    void shouldReturnTwoDuplicates() {
        assertEquals(2, Main.duplicateCount("ABBA"));
    }

    @Test
    void shouldReturnThreeDuplicates() {
        assertEquals(3, Main.duplicateCount("111kKk333"));
    }
}
