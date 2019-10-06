import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Adam Kujan
 */
class DuplicatesTest {

    @org.junit.jupiter.api.Test
    void findMostFrequentDuplicateValue() {

        int[] testArray = new int[]{1,1,1,1,1,1,3,3,4,4,4,4,5};
        int asnwer = Duplicates.findMostFrequentDuplicateValue(testArray);
        assertEquals(1, asnwer);
    }
}