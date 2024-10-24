import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor: ");
        int n = scan.nextInt();
        int sumaIterativa = sumaIterativa(n);
        int sumaRecursiva = sumaRecursiva(n);
        System.out.println("Suma iterativa de " + n + "=" + sumaIterativa);
        System.out.println("Suma recursiva de " + n + "=" + sumaRecursiva);

        System.out.println("Factorial de " + n + "=" + factorial(n));
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = n; i > 0; i--) {
            suma += i;
        }
        return suma;
    }

    public static int sumaRecursiva(int n){
        if(n == 1){
            return 1;
        }
        return n + sumaRecursiva(n - 1);
    }

}
