import java.util.Random;

public class Multidimensional {
    
    public static void main(String[] args) throws Exception {
        int[][] tabla = generarAleatoria(4, 5);
        int impares = contarImpares(tabla);
        imprimir(tabla);
        System.out.println("impares:" + impares);
    }
    
    public static int contarImpares(int[][] tabla) {
        int impares = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                if (tabla[i][j] % 2 != 0) {
                    impares++;
                }
            }
        }
        return impares;
    }

    public static int[][] generarAleatoria(int filas, int columas) {
        int[][] tabla = new int[filas][columas];

        Random rnd = new Random();

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = rnd.nextInt(100);
            }
        }

        return tabla;
    }

    public static int[][] generarTabla() {
        int tabla[][] = new int[3][4];
        tabla[0][0] = 10;
        tabla[1][1] = 20;
        tabla[2][2] = 30;
        tabla[2][3] = 50;
        return tabla;
    }

    public static void imprimir(int tabla[][]) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
