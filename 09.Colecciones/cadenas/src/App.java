import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        invertir();
        
    }

    public static void invertir(){
        String texto = JOptionPane.showInputDialog("Ingrese un texto");
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Texto invertido: " + invertido.toUpperCase());

    }

    public static void cadenas(){
        
        String a = new String("hola");
        String b = a.concat(" mundo").concat(" como ").concat("estas");
        System.out.println(b);
        System.out.println(b.length());
        System.out.println(b.toUpperCase());
        
        String c = " hola ";
        String d = c.trim();
        int l = d.length();
        System.out.println(l);

        System.out.println(c.trim().length());

        System.out.println(b.charAt(6));

        System.out.println(b.substring(5, 10));

        String fila = "111;22;33;44";
        String partes[] = fila.split(";");
        System.out.println(partes[0]);
        System.out.println(partes[1]);

        String num = String.valueOf(123);
        System.out.println(num);

        JOptionPane.showMessageDialog(null, "Este es el texto a mostrar " + num);

        String valor = JOptionPane.showInputDialog("Ingrese un valor");
        int edad = Integer.parseInt(valor);
        System.out.println(edad + 10);

    }

}
