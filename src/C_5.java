// Create a loop that generates many objects; explain which are eligible for garbage
// collection after each iteration.
public class C_5 {
    // Create a simple array for demonstration
    int[] numberArray = {1};

    public static void main(String[] args){

        // Using a for loop, an object is created in each iteration and the variable
        // 'arrayObj' points to it
        C_5 arrayObj;
        for (int i = 1; i <= 10; i++){
            arrayObj = new C_5();
            // After that the value of numberArray is updated using it as an optional task.
            arrayObj.numberArray[0] = 2;
            // Checking the iteration count for demonstration
            if (i < 10){
                System.out.println(arrayObj.toString()+" is eligible");
            }
            else{
                System.out.println(arrayObj.toString()+" is not eligible");
            }
        }
        // After each iteration, the previously created object is reassigned to a new object.
        // So the previously created object has no reference now, that object is eligible
        // for garbage collection.
        // After 10 iterations, the loop finishes and no objects are created. So all previous objects
        // are garbage now.
        // But last created object is still referenced by 'arrayObj'. So it is not eligible for
        // garbage collection.
    }
}
