// Write a program that shows stack vs heap by creating primitives vs objects, and printing values before/after reassignment
public class C_1 {
    int x = 5;
    public static void main(String[] args){

        // STACK
        // This stores primitive values like 'int', 'float', 'boolean'...etc. (variables)
        // Each variable directly holds its value and also independent
        int a = 10;
        int b = a;

        System.out.println("Before assignment - a: "+a+", b: "+b);
        a = 20;
        System.out.println("After assignment - a: "+a+", b: "+b);
        // As each variable has its own value, even after changing 'a' value to 20,
        // 'b' retains its previous value.
        // This shows us the stack behavior

        // HEAP
        // This stores objects (Instances of class 'C_1')
        // Object variables stores the location of the object
        C_1 object1 = new C_1();
        C_1 object2 = object1;

        // Both 'object1' and 'object2' refer to the same memory location
        System.out.println("Before assignment - 'x' of object1: "+object1.x+", 'x' of object2: "+object2.x);

        // Changing the value using object1
        object1.x = 10;

        System.out.println("After assignment - 'x' of object1: "+object1.x+", 'x' of object2: "+object2.x);
        // As both object variables point to the same object, the change is affecting to the 'object2' as well
        // This shows us the heap behavior
    }
}
