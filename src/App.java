import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String [] [] names = new String [] [] {{"Ivan"}, {"Oyeezy"}, {"Warren"}, {"Mnyang'oo"}, {"Cheng'ole", "Enock", "Biggedi"}};
        for (String[] element: names) {
            System.out.println(element[0]);
        }
    }
}
