// Build a small menu program that repeatedly allocates arrays/objects; identify what
// stays in memory, what is freed, and why.
import java.util.Scanner;
public class C_10 {

    public static void main(String[] args){

        // Create a variable to keep an object in memory
        // It is empty at the beginning. It gets updated inside the program
        C_10 stayObj = null;
        Scanner sc = new Scanner(System.in);
        while (true){
            // Menu
            System.out.println(
                    "1. Create temporary object"+'\n'+
                    "2. Create and save an object"+'\n'+
                    "3. Delete saved object"+'\n'+
                    "4. Terminate the program"+'\n'
            );
            System.out.print("Select option: ");
            int usr_in = sc.nextInt();

            // Option 1: Creating a temporary object and deleting it making eligible for GC instantly.
            if (usr_in == 1){
                System.out.println("\n"+"User has chosen 1");
                System.out.println("Creating an object on the heap memory...");
                // Creating an object
                // But no variable is there to hold it
                C_10 freeObj = new C_10();
                System.out.println("Object created.");
                System.out.println("Going to be eligible for GC after this block..."+"\n");
                // As no variable is referencing it, it becomes eligible for GC after this if block ends
            }

            // Option 2: Creating an object + saving it in the variable we created on top
            else if(usr_in == 2){
                System.out.println("\n"+"User has chosen 2");
                System.out.println("Creating an object on the heap memory...");
                // Creating an object
                // Also it gets saved in the variable 'stayObj'
                stayObj = new C_10();
                System.out.println("Object created.");
                System.out.println("This won't be eligible for GC while stayObj referencing it."+"\n");
                // Unlike before, as stayObj refer this created object, it stays on memory and not eligible for GC yet
            }

            // Option 3: Deleting the object in stayObj
            else if(usr_in == 3){
                System.out.println("\n"+"User has chosen 3");
                System.out.println("Deleting previously saved object...");
                // Removing the saved object on stayObj
                stayObj = null;
                System.out.println("Object deleted.");
                System.out.println("Now that object is eligible for GC"+"\n");
                // Now that object is not referenced by any variable. so it is now eligible for GC.
            }

            // Option 4: Exit option
            else if(usr_in == 4){
                System.out.println("Good Bye!");
                break;
            }
            else{
                System.out.println("Error");
            }
        }
        sc.close();
    }
}
