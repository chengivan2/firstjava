import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("How many lines do you want?");
        Scanner cases = new Scanner(System.in);
        int cases_num = cases.nextInt();
        for(int x = 1; x <= cases_num; x++) {
            System.out.println("You wanted this many lines");
        }
    }
}
