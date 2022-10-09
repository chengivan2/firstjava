import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String [] [] names = new String [] [] {{"Ivan"}, {"Oyeezy"}, {"Warren"}, {"Mnyang'oo"}, {"Cheng'ole", "Enock", "Biggedi"}};
        for (String[]  element: names) { //The variable is set to an array since the elements are arrays
            System.out.println(element[0]);
        }
    }
}
