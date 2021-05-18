package codeitamarjr;
import java.util.Scanner;

public class Strings {
    public static void strings() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your full full name?");
        String fullName = keyboard.nextLine();
        char initialFirstName = fullName.charAt(0);
        char initialLastName = fullName.charAt(fullName.lastIndexOf(' ')+1);
        System.out.println("The initial of your full name is: "+initialFirstName+initialLastName);


    }
}
