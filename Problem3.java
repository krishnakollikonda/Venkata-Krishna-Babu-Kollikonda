import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1; i <= count; i++) {
            int oddNumber = 2 * i - 1;
            System.out.print(oddNumber);
            if (i < count) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
