
import java.util.Scanner;

public class RonaldoAlexandre {

public static void main(String[] args) {
  
Scanner scanner = new Scanner(System.in);

System.out.println("Digite o primeiro n�mero:");
double numero1 = scanner.nextDouble();

System.out.println("Digite o segundo n�mero:");
double numero2 = scanner.nextDouble();

if (numero1 > numero2) {
System.out.println("O maior n�mero �: " + numero1);
} else if (numero2 > numero1) {
System.out.println("O maior n�mero �: " + numero2);
} else {
System.out.println("Os n�meros s�o iguais.");
        }
System.out.println("Quantos dedos tem uma m�o.");
System.out.println("Os dedos s�o iguais.");
System.out.println("qual o dedo menor.");

scanner.close();
    }
}          
