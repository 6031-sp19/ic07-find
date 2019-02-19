
public class FindImpls {
    
    private static int find_linear_forward(int x, int[] a) {
        // linear search, examines all elements, magic -1
        // for i from 0 to a.length-1:
        //     return i if a[i] == x
        // return -1
    }
    
    private static int find_linear_backward(int x, int[] a) {
        // linear search, examines all elements, magic -1
        // for i from a.length-1 down to 0:
        //     return i if a[i] == x
        // return -1
    }

    private static int find_linear_insert(int x, int[] a) {
        // linear search, assume sorted, return where x would go if not found
        // for i from 0 to a.length-1:
        //    return i if a[i] >= x
        // return a.length
    }
    
    private static int find_linear_less(int x, int[] a) {
        // linear search, stops at element greater than x, magic -1
        // for i from 0 to a.length-1:
        //     return i if a[i] == x
        //     return -1 if a[i] > x
        // return -1
    }
    
    private static int find_linear_throw(int x, int[] a) throws NotFoundException {
        // linear search, examines all elements, exception
        // for i from 0 to a.length-1:
        //     return i if a[i] == x
        // throw NotFoundException
    }
    
    private static int find_binary_asap(int x, int[] a) {
        // binary search for x in sorted a
        // return index i as soon as an a[i] == x is found
        // return -1 if not found
    }
    
    private static int find_binary_first(int x, int[] a) {
        // binary search for x in sorted a
        // continue until smallest index i s.t. a[i] == x is found
        // return -1 if not found
    }
}
