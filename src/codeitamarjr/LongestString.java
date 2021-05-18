package codeitamarjr;

import java.util.Scanner;

public class LongestString {
    public static void printLongestString(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type out the first string:");
        String firstString = keyboard.nextLine();
        System.out.println("Type out the second string:");
        String secondString = keyboard.nextLine();

        if(firstString.length() > secondString.length() ){
            System.out.println("The first string("+firstString.length()+") is greater than the second one("+secondString.length()+").");
        } else if(firstString.length() < secondString.length() ){
            System.out.println("The second string("+secondString.length()+") is greater than the first one("+firstString.length()+").");
        } else{
            System.out.println("They are equal first("+firstString.length()+") and second("+secondString.length()+").");
        }
    }
}
