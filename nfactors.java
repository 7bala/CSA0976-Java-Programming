import java.util.Scanner;

class nfactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the value of n to find the nth factor: ");
        int n = scanner.nextInt();
        scanner.close();

        int factorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCount++;
            }
        }

        System.out.println("Number of factors = " + factorCount);

        int factorIndex = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorIndex++;
                if (factorIndex == n) {
                    System.out.println(n + "th factor of " + num + " = " + i);
                    break;
                }
            }
        }
    }
}
