// Create a program that makes objects unreachable by setting references to null;
// discuss GC eligibility.
public class C_7 {

    public static void main(String[] args){
        // Create an array to store 5 object references
        C_7[] arrayObj = new C_7[5];
        // Loop 5 times which does the same operation for demonstration
        for (int i = 0; i <= 4; i++){
            // Creates a new object and stores it in the array we created
            arrayObj[i] = new C_7();
            // Prints the object reference before making it unreachable
            System.out.println(arrayObj[i]);
            // Making that object unreachable by removing the reference to the object
            arrayObj[i] = null;
            // Trying to print the object reference but this prints null
            // because now the object is unreachable
            System.out.println(arrayObj[i]);
            System.out.println();
        }
    }
}