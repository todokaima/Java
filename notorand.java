import java.sql.SQLOutput;
import  java.util.Scanner;

public class notorand {
    public static void main(String[] args) {
        int temp = 25;

        if(temp > 30) {
            System.out.print("It's hot outside");
        }
        else if(temp>=20 && temp <=30) {
            System.out.println("It's warm outside");
        }
        else {
            System.out.printf("it is cold outsidde");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("you are playing a game, press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q")||!!response.equals("Q")) {
                System.out.println("You quit the game");
            }
        else {
            System.out.println("YOU ARE STILL PLAYING");

        }

    }
}
