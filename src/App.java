import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner name1 = new Scanner(System.in);
        String name = name1.nextLine();
        System.out.println("Hello, World!");
        System.out.println(name);
        Scanner time1 = new Scanner(System.in);
        int time = time1.nextInt();
        if (time > 12) {
            System.out.println("Morning");
        }
        
        else if (time < 12) {
            System.out.println("Evening");
        }
    }
}
