import java.util.Scanner;

class nthprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find the nth prime number: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of n to find n prime numbers after nth prime number: ");
        int n2 = scanner.nextInt();
        scanner.close();

        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            num++;
        }

        System.out.println(n + "th Prime number is " + (num-1));

        System.out.print(n2 + " prime numbers after " + (num-1) + " are: ");
        count = 0;
        while (count < n2) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
