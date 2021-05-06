import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);
        CalculadorDeSecuencia calculador = new CalculadorDeSecuencia();

        System.out.print("Igrese el mensaje: ");
        String message = scanner.nextLine();

        String resultado = calculador.calcular(message);
        System.out.println("El mensaje ingresado es: \""+ message+"\"");
        System.out.println("Secuencia de Numeros: " + resultado);

        scanner.close();
    }
    
}
