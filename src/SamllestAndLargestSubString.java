import java.util.Scanner;

public class SamllestAndLargestSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String curr = s.substring(0, k);
        String smallest = curr;
        String largest = curr;
        for (int i = 1; i < s.length() - k + 1; ++i) {
            curr = s.substring(i, i + k);
            if (smallest.compareTo(curr) > 0) {
                smallest = curr;
            }
            if (largest.compareTo(curr) < 0) {
                largest = curr;
            }
        }
        return smallest + "\n" + largest;
    }
}
