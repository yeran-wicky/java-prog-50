// Demonstrate string memory: compare new String("hi") vs "hi" and == vs .equals().
public class C_8 {
    public static void main(String[] args){
        String p = "hi";
        String q = new String("hi");

        // Compares 'p' and 'q' whether they are equal or not using "=="
        boolean isEqlpq1 = p==q;
        // This prints 'false' as the output, because variable 'p' is in the string pool
        // but variable 'q' is in the heap memory. Even both holds same content, they point
        // to different objects in memory.
        System.out.println(isEqlpq1);

        // Compares 'p' and 'q' whether they are equal or not using "equals()"
        boolean isEqlpq2 = (p.equals(q));
        // This prints 'true' as the output, because the 'equals()' operator just compares
        // the content, regardless they are in different memory locations.
        System.out.println(isEqlpq2);
    }
}
