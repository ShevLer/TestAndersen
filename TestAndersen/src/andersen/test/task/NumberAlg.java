package andersen.test.task;

 import java.util.Scanner;

public class NumberAlg {

    static void sendNumber() {
        System.out.print ("Введите число >7: ");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i>7) {
            System.out.println ("Привет");
        }
    }
}
