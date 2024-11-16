import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int vector[] = generarVector(10000);

        int pos = busquedaSecuencial(vector, 50);
        System.out.println("Posición: " + pos);

        int posBinaria = busquedaBinaria(vector, 50);
        System.out.println("Posición: " + posBinaria);


        // SELECCIÓN
        // int clonSelecion[] = clonarVector(vector);
        // Medida medidaSeleccion = ordenarSeleccion(clonSelecion);
        // System.out.println(
        //         "Selección: " + medidaSeleccion.comparaciones + " comparaciones, " + medidaSeleccion.intercambios
        //                 + " intercambios, " + medidaSeleccion.tiempo + " milisegundos");

        // // BURBUJA
        // int clonBurbuja[] = clonarVector(vector);
        // Medida medidaBurbuja = ordenarBurbuja(clonBurbuja);
        // System.out.println(
        //         "Burbuja: " + medidaBurbuja.comparaciones + " comparaciones, " + medidaBurbuja.intercambios
        //                 + " intercambios, " + medidaBurbuja.tiempo + " milisegundos");

    }

    public static int busquedaBinaria(int vector[], int dato) {
        int izq = 0;
        int der = vector.length - 1;
        while (izq <= der) {
            int centro = (izq + der) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                der = centro - 1;
            } else {
                izq = centro + 1;
            }
        }
        return -1;
    }

    public static int busquedaBinariaRecursiva(int vector[], int dato) {
        return busquedaBinariaRecursivaHelper(vector, dato, 0, vector.length - 1);
    }

    private static int busquedaBinariaRecursivaHelper(int vector[], int dato, int izq, int der) {
        if (izq <= der) {
            int centro = (izq + der) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                return busquedaBinariaRecursivaHelper(vector, dato, izq, centro - 1);
            } else {
                return busquedaBinariaRecursivaHelper(vector, dato, centro + 1, der);
            }
        }
        return -1;
    }

    public static int busquedaSecuencial(int vector[], int dato) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == dato) {
                return i;
            }
        }
        return -1;
    }

    public static Medida ordenarSeleccion(int vector[]) {
        Medida medida = new Medida();
        long inicia = System.currentTimeMillis();

        for (int i = 0; i < vector.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < vector.length; j++) {
                medida.comparaciones++;
                if (vector[j] < vector[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                medida.intercambios++;
                int aux = vector[i];
                vector[i] = vector[menor];
                vector[menor] = aux;
            }
        }

        long termina = System.currentTimeMillis();
        medida.tiempo = termina - inicia;

        return medida;
    }

    public static Medida ordenarBurbuja(int vector[]) {
        Medida medida = new Medida();
        long inicia = System.currentTimeMillis();

        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                medida.comparaciones++;
                if (vector[j] > vector[j + 1]) {
                    medida.intercambios++;
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        long termina = System.currentTimeMillis();
        medida.tiempo = termina - inicia;

        return medida;

    }

    public static int[] clonarVector(int vector[]) {
        int clon[] = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            clon[i] = vector[i];
        }
        return clon;
    }

    public static void imprimirVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static int[] generarVector(int tamanio) {
        Random rnd = new Random();
        int vector[] = new int[tamanio];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(100);
        }
        return vector;
    }

  
}
