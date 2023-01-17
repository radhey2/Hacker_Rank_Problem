import java.util.Arrays;

public class Anangram {
    public static void main(String[] args) {
        boolean b = Anangram.isAnagram("jaas", "vaaj");
        System.out.println(b);
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function

        if (a.length() != b.length()) {
            return false;
        } else {
            char[] charArray1 = a.toCharArray();
            char[] charArray2 = b.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            System.out.println(charArray1);
            System.out.println(charArray2);

            return Arrays.equals(charArray1, charArray2);

        }

    }

}
