import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        int c = A.length() + B.length();
        System.out.println(c);
        if (A.compareTo(B) == 0) {
            System.out.println("No");
        } else if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else if (A.compareTo(B) < 0) {
            System.out.println("No");
        }
        String s1 = A.substring(0, 1).toUpperCase();
        String s2 = A.substring(1);
        String s3 = B.substring(0, 1).toUpperCase();
        String s4 = B.substring(1);
        System.out.println(s1 + s2 + " " + s3 + s4);
    }
}
