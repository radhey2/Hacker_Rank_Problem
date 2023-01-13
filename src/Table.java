import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Table.table(n);
        sc.close();
    }

    private static void table(int n) {
        for (int i = 1; i < 11; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
