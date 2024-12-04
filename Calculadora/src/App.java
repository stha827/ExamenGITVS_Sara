import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Añada el primer numero: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Añada el segundo numero: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Añada la operación: ");
        char operación = scanner.nextLine();

        int resultado;
        switch (operacion){
            case '+': resultado = numero1 + numero2;
                    System.out.println(resultado);
                break;
            case '-': resultado = numero1 - numero2;
                    System.out.println(resultado);
                break;
            case 'x': resultado = numero1 * numero2;
                    System.out.println(resultado);
                break;
            case '/': resultado = numero1 / numero2;
                    System.out.println(resultado);
                break;
            default: System.out.println("error");
        }

        scanner.close();
    }
}
