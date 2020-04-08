package by.sugako.lesson22;

import org.junit.Test;
import static org.junit.Assert.*;

public class EducationTest {

    @Test
    public void testHashcode() {

//        Given
        Education target = new Education();

//        When
        int hashCode = target.hashCode();

//        Then
        assertTrue(hashCode != 0);
    }

    @Test
    public void testEquals() {
//        Given
        Education education = new Education();
        education.setLevel(EducationLevel.ELEMENTARY);

        Education education1 = new Education();
        education1.setLevel(EducationLevel.ELEMENTARY);

        Education education2 = new Education();
        education2.setLevel(EducationLevel.ELEMENTARY);

//        When
        boolean result = education.equals(null);
        boolean result1 = education.equals(education);
        boolean result2 = education1.equals(education) && education.equals(education1);
        boolean result3 = education.equals(education1) && education1.equals(education2) && education2.equals(education);

//        Then
        assertFalse(result);
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
    }

    @Test
    public void testClone() {

    }
}