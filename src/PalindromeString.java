import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        PalindromeString.palindromeString(s);
        sc.close();
    }

    public static void palindromeString(String A) {

        int l = A.length();

        /* Enter your code here. Print output to STDOUT. */
        int i = 0;
        String nstr = "";

        for (i = 0; i < l; i++) {
            char ch = A.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        if (nstr.endsWith(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
