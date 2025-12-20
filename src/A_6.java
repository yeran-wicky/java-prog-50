// Find the sum of all even numbers up to N
public class A_6 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 0; i<=10; i++) {
            if (i % 2 == 0) {
               sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
