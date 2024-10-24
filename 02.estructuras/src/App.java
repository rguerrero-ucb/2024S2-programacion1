import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Random rnd = new Random();
        int a = rnd.nextInt(1, 20);
        System.out.println("Generado " + a);

        // int a = 9;

        if (a == 10) {
            System.out.println("A es 10");
        } else {
            if (a < 10) {
                System.out.println("Es menor a 10");
            } else {
                System.out.println("Es mayor a 10");
            }
        }

        System.out.println("fin");

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca la edad:");
        int b = scan.nextInt();


        System.out.println(b * 2);
    }

}
