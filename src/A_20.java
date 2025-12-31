// Print a number pyramid pattern (nested loops)

public class A_20 {
    public static void main(String[] args){

        // Create an int variable to mark the row number
        int i = 1;
        // While row count becomes 5 outer loop runs
        // This builds the height of the pyramid
        while (i <= 5){
            // Create a int variable for printing spaces
            int k = 1;
            // This prints spaces
            // Number of spaces decreases with row number getting increased
            while (k <= 5-i){
                // Prints a space in line
                System.out.print(" ");
                // Moves to the next space
                k = k + 1;
            }
            // After here, stars printing begins
            int j = 1;
            // This prints stars
            // Number of stars are equal to the row number
            // (First row -> one star, second row -> two stars...etc)
            while (j <= i){
                // Prints a star with a space next to it
                // Otherwise the pyramid looks like a right angled one, alligned to right side
                System.out.print("* ");
                // Moves to the next star
                j = j + 1;
            }
            // Switches to the next line after finishing one row
            System.out.println();
            // Moves to the next row
            i = i + 1;
        }
    }
}
