// Demonstrate reference copying: assign one object reference to another and modify one. show both change
public class C_2 {
    int x = 5;
    public static void main(String[] args){

        // Creating an object for class 'C_2'
        // This stores objects (Instances of class 'C_2')
        // Object variables stores the location of the object
        C_1 object1 = new C_1();
        // Assigns one object reference to another
        C_1 object2 = object1;

        // Both 'object1' and 'object2' refer to the same memory location
        System.out.println("Before assignment - 'x' of object1: "+object1.x+", 'x' of object2: "+object2.x);

        // Changing the value using object1
        object1.x = 10;

        System.out.println("After assignment - 'x' of object1: "+object1.x+", 'x' of object2: "+object2.x);
        // As both object variables point to the same object, the change is affecting to the 'object2' as well
    }
}
