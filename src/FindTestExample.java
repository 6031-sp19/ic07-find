import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FindTestExample {

    // Testing strategy for i = find(x, a):
    // Partition the space of (x, a, i) as follows...
    //
    // a.length:         0, 1, >1
    // #occurrences of x: 0, 1, >1
    // return value i:   0, middle, n-1, -1

    // covers a.length=0, #occurrences=0, i=-1
    @Test public void testEmpty() {
        assertEquals(-1, Find.find(1, new int[] {}));
    }

    // covers a.length=1, #occurrences=1, i=0
    @Test public void testSingleton() {
        assertEquals(0, Find.find(0, new int[] { 0 }));
    }

    // covers a.length>1, #occurrences=1, i in middle
    @Test public void testMiddle() {
        assertEquals(1, Find.find(1, new int[] { -1, 1, 3 }));
    }

    // covers a.length>1, #occurrences=1, i=0
    @Test public void testStart() {
        assertEquals(0, Find.find(-1, new int[] { -1, 1, 3 }));
    }

    // covers a.length>1, #occurrences=1, i=n-1
    @Test public void testEnd() {
        assertEquals(2, Find.find(3, new int[] { -1, 1, 3 }));
    }

    // covers a.length>1, #occurrences=0, i=-1
    @Test public void testNotFound() {
        assertEquals(-1, Find.find(2, new int[] { -1, 1, 3 }));
    }

    // covers a.length>1, #occurrences>1, i=0
    @Test public void testAllSame() {
        assertEquals(0, Find.find(1, new int[] { 1, 1, 1 }));
    }
}
