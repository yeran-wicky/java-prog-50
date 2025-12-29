// Demonstrate autoboxing memory behavior: compare Integer a=100; Integer b=100; and
// Integer x=200; Integer y=200; using ==
public class C_9 {
    public static void main(String[] args){

        // Create two variables as num_a and num_b and assign values for them
        // These two values are primitive
        int num_a = 100;
        int num_b = 100;

        // Then we assign them into Integer reference variables
        // When we write like this, compiler converts 'int' into 'Integer' objects
        // This is known as autoboxing
        Integer a = num_a;
        Integer b = num_b;
        // So, the process of converting primitive types into objects is known as autoboxing

        // One key behavior of those autoboxed Integer types is they cache values
        // from -128 to 127.
        // That means Integer a's value and Integer b's value are taken from a single cached Integer object
        // that has a value of 100. So, if we check the equality of them, that should print true as they
        // refer to the same object
        System.out.println(a==b);

        // But what if we use values out of the range -128 to 127?
        // As they are outside the caching range, each one creates new unique object and both does not
        // refer to the same object.
        Integer x = 200;
        Integer y = 200;

        // So if we check the equality of them, that should print false as they don't refer to the same object
        System.out.println(x==y);
    }
}
