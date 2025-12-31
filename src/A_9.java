// Print multiplication tables from 1 to 10 (nested loops)
public class A_9 {
    public static void main(String[] args){
        // Loops from 1 to 10 (including 10)
        for (int i = 1; i <= 10; i++){
            // Inside of it, for each i value, its multiplication table is printed
            for (int j = 1; j <= 12; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            // Give a one line space between each table
            System.out.println();
        }
    }
}