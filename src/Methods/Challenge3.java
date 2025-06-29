package Methods;

import java.util.Scanner;

public class Challenge3 {

    static boolean isPrime(int num)
    {

        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
        {
            System.out.println("Is a Prime number");
        }
        else
        {
            System.out.println("Is not Prime number");
        }
    }
}
