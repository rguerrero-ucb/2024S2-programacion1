import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //escribirArchivo();
        //leerArchivo();

        //guardarBinario();
        leerBinario();
    }

    public static void leerBinario(){
        File file = new File("personas.dat");

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Persona> personas = (ArrayList<Persona>) ois.readObject();

            for (Persona persona : personas) {
                System.out.println(persona.getId() + " - " + persona.getNombre());
            }

            ois.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void guardarBinario(){
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan"));
        personas.add(new Persona(2, "Maria"));
        personas.add(new Persona(3, "Pedro"));

        File file = new File("personas.dat");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(personas);

            oos.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
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
