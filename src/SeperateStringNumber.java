import java.util.Scanner;

public class SeperateStringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter String");
            String s1 = sc.next();
            System.out.println("Enter Number");

            int x = sc.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);
            // Complete this line
        }
        System.out.println("================================");
        sc.close();
    }
}
