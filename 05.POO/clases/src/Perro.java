public class Perro {
    public String nombre;
    public String raza;
    public int tamanio;

    private int hambre;

    public void setHambre(int valor){
        if(valor > 10){
            System.out.println("No");
        } else {
            this.hambre = valor;
        }
    }

    public int getHambre() {
        return this.hambre;
    }

    public void ladrar() {
        System.out.println("Guau guau!!");
    }

    public void indentificarse() {
        System.out.println("Mi nombre es: "
                + this.nombre
                + " y mido "
                + this.tamanio);
    }
}
