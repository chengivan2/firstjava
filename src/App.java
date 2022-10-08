import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner cases = new Scanner(System.in);
        int cases_num = cases.nextInt();
        String day = switch(cases_num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day number";
        };

        System.out.println(day);
    }
}
