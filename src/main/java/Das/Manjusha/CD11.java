package Das.Manjusha;

import java.util.Scanner;

/**
 * Created by manjushadas on 5/19/16.
 */
public class CD11 {
    Scanner scanner= new Scanner(System.in);
    String answer;
    public void askName(){
        System.out.println("What is your name?");
        answer=scanner.nextLine().toUpperCase();
        if (answer.equals("ALICE")) {
            System.out.println("Hello, Alice!");
        }else if(answer.equals("BOB")) {
            System.out.println("Hello, Bob!");
        }
        else{
            System.out.println("Hello!");
        }

    }

}
