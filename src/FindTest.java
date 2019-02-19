import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FindTest {
    
    /*
     * TODO: write testing strategy with partitions for find(int x, int[] a)
     */

    // covers ...
    @Test public void testEmpty() {
        assertEquals(-1, Find.find(1, new int[] {}));
    }
    
    
    /* TODO: write more tests for find(int x, int[] a) */
    
    
    /** Always ensure that assertions are enabled. */
    @Test
    public void testAssertionsEnabled() {
        assertThrows(AssertionError.class, () -> { assert false; },
                     "make sure assertions are enabled with VM argument '-ea'");
    }
}
