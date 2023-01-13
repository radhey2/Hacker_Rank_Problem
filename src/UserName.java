import java.util.ArrayList;
import java.util.List;

public class UserName {
    public static void main(String[] args) {
        List<String> usernames = new ArrayList<>();
        usernames.add("hydra");
        usernames.add("bee");
        usernames.add("superhero");
        UserName.possibleChanges(usernames);

    }

    public static List<String> possibleChanges(List<String> usernames) {
        for (int i = 0; i < usernames.size() - 1; i++) {
            char a = usernames.get(i).charAt(i);
            char b = usernames.get(i).charAt(i + 1);

            if (Character.compare(a, b) > 0) {

                System.out.println("NO");
            } else if (Character.compare(a, b) == 0) {
                System.out.println("NO");
            } else if (Character.compare(a, b) < 0) {
                System.out.println("Yes");

            }
        }
        return usernames;
    }
}
