import java.util.Random;

public class Unidimensional {

    public static void main(String[] args) {
        dias();
        promedio();
    }

    public static void dias() {
        String[] nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "Maria";

        char[] semana = new char[7];
        semana[0] = 'L';
        semana[1] = 'M';
        semana[2] = 'M';
        semana[3] = 'J';
        semana[4] = 'V';
        semana[5] = 'S';
        semana[6] = 'D';

        System.out.println(semana[0]);
    }

    public static void promedio() {
        Random rnd = new Random();
        int a[] = new int[40]; // inicializa el vector
        int suma = 0; // inicializa el acumulador

        for (int j = 0; j < 40; j++) {
            a[j] = rnd.nextInt(100); // genera el elemento
            suma = suma + a[j]; // acumula
        }

        for (int j = 0; j < 40; j++) {
            System.out.print(a[j] + " ");
        }

        double promedio = suma / 40; // promedia
        System.out.println();
        System.out.println("Promedio: " + promedio);
    }
}
