import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Igrese el mensaje: ");
        String message = scanner.nextLine();

        transformarANumeros(message);
        System.out.println("El mensaje ingresado es: \""+ message+"\"");
    }
    
}
