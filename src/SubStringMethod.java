import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        String s1 = S.substring(start, end);
        System.out.println(s1);
    }
}
