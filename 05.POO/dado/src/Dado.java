import java.util.Random;

public class Dado {
    private Random rnd;
    private int caras;

    public Dado(int caras){
        this.rnd = new Random();
        this.caras = caras;
    }

    public void lanzar(){
        int lado = this.rnd.nextInt(this.caras) + 1;
        this.dibujar(lado);
    }

    private void dibujar(int lado) {
        if(lado == 1){
            System.out.println("---------");
            System.out.println("|       |");
            System.out.println("|   O   |");
            System.out.println("|       |");
            System.out.println("---------");
        } else if (lado == 2) {
            System.out.println("---------");
            System.out.println("|O      |");
            System.out.println("|       |");
            System.out.println("|      O|");
            System.out.println("---------");

        } else if (lado == 3) {
            System.out.println("---------");
            System.out.println("|O      |");
            System.out.println("|   O   |");
            System.out.println("|      O|");
            System.out.println("---------");

        } else if (lado == 4) {
            System.out.println("---------");
            System.out.println("|O     O|");
            System.out.println("|       |");
            System.out.println("|O     O|");
            System.out.println("---------");

        } else if (lado == 4) {
            System.out.println("---------");
            System.out.println("|O     O|");
            System.out.println("|   O   |");
            System.out.println("|O     O|");
            System.out.println("---------");

        } else if (lado == 4) {
            System.out.println("---------");
            System.out.println("|O     O|");
            System.out.println("|O     O|");
            System.out.println("|O     O|");
            System.out.println("---------");
        } else {
            System.out.println("Fuera de rango");
        }
    }
}
