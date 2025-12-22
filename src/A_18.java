// Print all prime numbers between 1 and N

public class A_18 {
    public static void main(String[] args){
        for (int num = 1; num <= 10; num++){
            if (num < 2){
                continue;
            }else{
                int x = 2;
                while (x * x <= num){
                    if (num % x == 0){
                        break;
                    }else {
                        x = x + 1;
                    }
                }
                if ((x * x) > num){
                    System.out.println(num);
                }
            }
        }
    }
}
