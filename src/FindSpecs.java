
public class FindSpecs {
    
    // find-first
    /**
     * Find the first occurrence of x in sorted array a.
     * @param x value to find
     * @param a array sorted in increasing order,
     *              a[0] <= a[1] <= ... <= a[n-1]
     * @return lowest i such that a[i]==x, or -1 if no such i
     */
    public static int find(int x, int[] a) { ... }
    
    // find-any
    /**
     * Find any occurrence of x in sorted array a.
     * @param x value to find
     * @param a array sorted in increasing order,
     *              a[0] <= a[1] <= ... <= a[n-1]
     * @return some i such that a[i]==x, or -1 if no such i
     */
    public static int find(int x, int[] a) { ... }
    
    // find-once
    /** 
     * Find x that occurs exactly once in sorted array a.
     * @param x value to find; required to appear exactly once in a
     * @param a array sorted in increasing order
     * @return the index i such that a[i] == x
     */
    public static int find(int x, int[] a) { ... }
    
    // find-any-present
    /**
     * Find any occurrence of x that occurs at least once in sorted array a.
     * @param x value to find; required to appear at least once in a
     * @param a array sorted in increasing order
     * @return any index i such that a[i] == x
     */
    public static int find(int x, int[] a) { ... }
    
    // find-any-unsorted
    /**
     * Find any occurrence of x in any array a.
     * @param x value to find
     * @param a array (in any order)
     * @return some i such that a[i]==x, or -1 if no such i
     */
    public static int find(int x, int[] a) { ... }
    
    // find-any-throw
    /**
     * Find any occurrence x in a sorted array a.
     * @param x value to find
     * @param a array sorted in increasing order
     * @return some i such that a[i]==x
     * @throws NotFoundException if no such i
     */
    public static int find(int x, int[] a) { ... }
}
