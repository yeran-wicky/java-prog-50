public class C_3 {
    int[] numberArray = {1, 2, 3, 4, 5};
    public static void main(String[] args){

        // Creating an array object for class 'C_3'
        // This stores the location of the object
        C_3 arrObj1 = new C_3();
        // Creates another array object and assign its reference to another
        C_3 arrObj2 = arrObj1;

        // Both 'arrObj1' and 'arrObj2' refer to the same memory location
        // Prints out array using arrObj1 and arrObj2 before assignment
        System.out.println("Array objects before assignment (arrObj1):");
        for (int num: arrObj1.numberArray){
            System.out.print(num+", ");
        }
        System.out.println();
        System.out.println("Array objects before assignment (arrObj2):");
        for (int num: arrObj2.numberArray){
            System.out.print(num+", ");
        }
        System.out.println();

        // Modify arrObj2
        arrObj2.numberArray[0] = 10;

        // Prints out array using arrObj1 and arrObj2 after assignment
        System.out.println("Array objects after assignment (arrObj1):");
        for (int num: arrObj1.numberArray){
            System.out.print(num+", ");
        }
        System.out.println();
        System.out.println("Array objects after assignment (arrObj2):");
        for (int num: arrObj2.numberArray){
            System.out.print(num+", ");
        }
        // As both objects point to the same array, the change is affecting to the 'arrObj1' as well
    }
}