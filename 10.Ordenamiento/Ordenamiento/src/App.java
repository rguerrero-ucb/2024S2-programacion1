import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int vector[] = generarVector(10000);
        int clonSelecion[] = clonarVector(vector);
        // imprimirVector(clonSelecion);
        Medida medidaSeleccion = ordenarSeleccion(clonSelecion);
        System.out.println(
                "Selección: " + medidaSeleccion.comparaciones + " comparaciones, " + medidaSeleccion.intercambios
                        + " intercambios, " + medidaSeleccion.tiempo + " milisegundos");
        // imprimirVector(clonSelecion);

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
