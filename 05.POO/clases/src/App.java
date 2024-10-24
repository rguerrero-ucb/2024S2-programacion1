public class App {
    public static void main(String[] args) throws Exception {
        
        Perro perro = new Perro();

        perro.nombre = "Boby";
        perro.raza = "pitbull";
        perro.tamanio = 25;
        perro.setHambre(5);

        System.out.println(perro.getHambre());

        perro.ladrar();
        perro.indentificarse();

    }
}
