import java.util.Scanner;

public class largestprimefactor {
    public static int largest_prime_factor(Long number) {
        int i = 2;
        while (number > 1) {
            if (number % i == 0) {
                number /= i;
            } else {
                i += 1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long number = input.nextLong();
        // Long number = 600851475143L;
        System.out.println(largest_prime_factor(number));
        input.close();
    }
}
