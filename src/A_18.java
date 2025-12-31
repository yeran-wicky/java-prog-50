// Print all prime numbers between 1 and N

public class A_18 {
    public static void main(String[] args){

        // Loop that runs from 1 to N (10 in this case including 10 also)
        for (int num = 1; num <= 10; num++){
            // Skips numbers less than 2 as they cannot be prime numbers
            if (num < 2){
                continue;
            }
            // Then starts checking prime from 2
            else{
                // Create a new int variable to check dividing values starting from 2
                int x = 2;
                // Loop that runs until the given condition becomes false
                // This checks if num is divisible by any number from 2 to square root of num value
                while (x * x <= num){
                    // If num is divisible by x, then it is not a prime number
                    if (num % x == 0){
                        // So the while loop halts for this iteration immediately, skipping non prime number
                        break;
                    }
                    // Otherwise, keeps checking by incrementing x value by +1
                    else {
                        x = x + 1;
                    }
                }
                // If no x value is divisible from num equals to zero, and also square of x is greater than num,
                // then that number is a prime number
                // So only those numbers are printed below
                if ((x * x) > num){
                    System.out.println(num);
                }
            }
        }
    }
}
