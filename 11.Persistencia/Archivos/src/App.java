import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {

        escribirArchivo();
        //leerArchivo();
    }

    public static void escribirArchivo() {
        File file = new File("datos.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hola Mundo");
            bw.newLine();
            bw.write("Adios Mundo");

            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void leerArchivo() {
        File file = new File("datos.txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);

                // procesar la linea
                String[] parts = line.split(";");

                for (String part : parts) {
                    System.out.println(part);
                }

                line = br.readLine();
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
