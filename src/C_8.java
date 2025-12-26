// Demonstrate string memory: compare new String("hi") vs "hi" and == vs .equals().
public class C_8 {
    public static void main(String[] args){
        String p = "hi";
        String q = new String("hi");
        String r = "hi";

        // Compares 'p' and 'q' using "==" (Same content, Different memory locations)
        boolean isEqlpq1 = p==q;
        System.out.println(isEqlpq1);
        // This prints 'false' as the output, because variable 'p' is in the string pool
        // but variable 'q' is in the heap memory. Even both holds same content, they point
        // to different objects in memory.

        // Compares 'p' and 'r' using "==" (Same content, Same memory location)
        boolean isEqlpr1 = p==r;
        System.out.println(isEqlpr1);
        // This prints 'true' as the output, because both are in the string pool
        // (same memory location)
        // -> The "==" operator compares the memory references of 'p' and 'q' even both holds same content

        // Compares 'p' and 'q' using "equals()" (Same content, Different memory locations)
        boolean isEqlpq2 = (p.equals(q));
        System.out.println(isEqlpq2);
        // This prints 'true' as the output, because the 'equals()' operator just compares
        // the content, regardless they are in different memory locations.

        // Compares 'p' and 'r' using "equals()" (Same content, Same memory location)
        boolean isEqlpr2 = (p.equals(r));
        System.out.println(isEqlpr2);
        // This also prints 'true', not because they are in the same memory location. But because
        // they both holds the same content.
        // -> The "equals()" operator compares the contents of 'p' and 'q' regardless of memory locations
    }
}
