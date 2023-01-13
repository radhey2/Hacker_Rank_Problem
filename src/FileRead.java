import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");

        for (int i = 1; s.hasNext() == true; i++) {
            System.out.println(i + " " + s.nextLine());
        }
        s.close();
    }
}
