package tudelft.numfinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumFinderTest {

    @Test
    public void testCaso1() {
        NumFinder nf = new NumFinder();
        nf.find(new int[] {4, 25, 7, 9});

        assertEquals(25, nf.getLargest());
        assertEquals(4, nf.getSmallest());
    }

    @Test
    public void testCaso2() {
        NumFinder nf = new NumFinder();
        nf.find(new int[] {4, 3, 2, 1});

        assertEquals(4, nf.getLargest());
        assertEquals(1, nf.getSmallest());
    }
}