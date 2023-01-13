import java.time.LocalDate;

public class CalenderDay {
    public static void main(String[] args) {
        String s = CalenderDay.findDay(02, 02, 2017);
        System.out.println(s);
    }

    public static String findDay(int month, int day, int year) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }
}
