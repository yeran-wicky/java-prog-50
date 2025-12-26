// Use a method that creates a local object and returns it; explain why it doesn’t get GC’d
// after method ends.
public class C_6 {
    // Create a simple array for demonstration
    int[] numberArray = {1};

    // Create another method to create a local object and stores it
    // in a variable 'arrayObj'
    // Then a simple update to the numberArray is done and returns it
    // The object referenced by arrayObj holds the change made to the numberArray.
    // Returning it passes that object to the caller
    // After returning, the variable arrayObj dissappears
    public static C_6 createObj(){
        C_6 arrayObj = new C_6();
        arrayObj.numberArray[0] = 10;
        return arrayObj;
    }

    // Start main method
    public static void main(String[] args){
        // Creates a variable storeObj and triggers createObj function which returns
        // an object with a value
        // It gets stored in storeObj
        // This keeps the object alive even after createObj() function ends
        C_6 storeObj = createObj();
        // Then it prints out the object
        System.out.println(storeObj.numberArray[0]);
        // This shows that the created object is still reachable via storeObj variable,
        // so that object is not eligible for garbage collection
    }
}
