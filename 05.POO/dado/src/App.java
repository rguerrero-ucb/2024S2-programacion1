import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dado dado1 = new Dado(4);
        Dado dado2 = new Dado(6);

        dado1.lanzar();
        dado2.lanzar();

        JOptionPane.showMessageDialog(null, "Hola");

    }
}
