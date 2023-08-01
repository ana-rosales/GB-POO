package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class GuessingMonth {

    private static Scanner ent = new Scanner(System.in);

    private static ArrayList<String> yearList = new ArrayList<>();
    private static String[] yearArray = {"january", "february", "march", "april", "may",
        "june", "july", "august", "september", "october", "november", "december"};
    
    private static String secretMonth;

    public static void main(String[] args) {
        boolean out, first, found;
        String guess;
        Collections.addAll (yearList, yearArray);
        
        do {
            out = false;
            first = true;
            found = false;
            secretMonth = yearList.get(Math.toIntExact(Math.round(Math.random() * 12)));
            
            System.out.println();
            do {
                //do{
                    if (first) {
                        System.out.print("Try to guess the secret month! (minus): ");
                        first = false;
                    } else {
                        System.out.print("Sorry! Try to guess again: ");
                    }
                    guess = ent.nextLine();
                //}while(!yearList.contains(guess));
                found = secretMonth.equalsIgnoreCase(guess);                
            } while (!found);
            System.out.println();
            System.out.println("CONGRATULACIONES!!! LO ENCONTRATEEEE");
            System.out.println();
            System.out.print("Another round? (Y/N): ");
            out = ent.nextLine().equalsIgnoreCase("Y");
        } while (out == true);
    }

}
