import java.util.Random;

public class Dados {
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        int dado1 = rnd.nextInt(1, 6);
        int dado2 = rnd.nextInt(1, 6);

        System.out.println("DADO 1");
        if(dado1 == 1){
            System.out.println(".  .  .");
            System.out.println(".  O  .");
            System.out.println(".  .  .");
        }
        if(dado1 == 2){
            System.out.println("O  .  .");
            System.out.println(".  .  .");
            System.out.println(".  .  O");
        }
    }

}
