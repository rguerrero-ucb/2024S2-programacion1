import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        fibonacci();
    }

    public static void personal() {
        ArrayList<Persona> lista = new ArrayList<Persona>();

        Persona p1 = new Persona("Juan", 20);
        Persona p2 = new Persona("Maria", 30);
        Persona p3 = new Persona("Pedro", 40);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
            System.out.println(persona.getEdad());
            System.out.println(persona);
        }
    }

    public static void ejemploLista() {
        ArrayList lista = new ArrayList();

        lista.add("Hola");
        lista.add("como");
        lista.add("estas");

        int tama = lista.size();
        System.out.println(tama);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));

        for (int i = 0; i < lista.size(); i++) {
            // String elemento = (String) lista.get(i);
            // String elemento = String.valueOf(lista.get(i));
            String elemento = lista.get(i).toString();
            System.out.println(elemento);
        }

        for (Object elemento : lista) {
            System.out.println(elemento.toString());
        }
    }

    public static void fibonacci() {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 0; i < 10; i ++){
            int c = a + b;
            System.out.print (c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

}
