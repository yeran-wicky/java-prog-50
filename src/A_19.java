// Print a right triangle star pattern of height N

public class A_19 {
    public static void main(String[] args){

        // Create an int variable to mark the row number
        int i = 1;
        // While row count becomes 5 outer loop runs
        while (i <= 5){
            // Create another int variable to mark the column number
            int j = 1;
            // While column count gets equal to row count, loop runs
            // (First row -> one star, second row -> two stars...etc)
            while (j <= i){
                // Prints a one star in each iteration
                // Those are printed in line as we are using 'print' instead of 'println'
                System.out.print("*");
                // Moves to the next column
                j = j + 1;
            }
            // Switches to the next line after finishing one row
            System.out.println();
            // Moves to the next row
            i = i + 1;
        }
    }
}
