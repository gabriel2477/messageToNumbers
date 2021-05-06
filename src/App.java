import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String message = " ";
        Scanner scanner = new Scanner(System.in);

        while (!message.equals("1")) {
            CalculadorDeSecuencia calculador = new CalculadorDeSecuencia();
            System.out.print("Igrese el mensaje o 1 para salir: ");
            message = scanner.nextLine();

            String resultado = calculador.calcular(message);
            System.out.println("El mensaje ingresado es: \"" + message + "\"");
            System.out.println("Secuencia de Numeros: " + resultado);
        }

        scanner.close();
    }

}
