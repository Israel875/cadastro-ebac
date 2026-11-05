import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Olá, Seja Bem-Vindo (a) ");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Preencha o formulário para iniciarmos o seu cadastro ! ");

        System.out.println(" Olá, digite o seu nome completo: ");
        String none = scanner.nextLine();

        System.out.println(" Cpf: ");
        String cpf = scanner.nextLine();

        System.out.println(" Idade: ");
        int idade = scanner.nextInt();

        System.out.println(" Peso:");
        float peso = scanner.nextFloat();

        System.out.println(" Altura ");
        float Altura = scanner.nextFloat();

        System.out.println(" Estado Civil: ");
        String EstadoCivil = scanner.nextLine();

        scanner.close();
        System.out.println(" O seu nome completo é: " + none + ", o seu cpf é: " + cpf + " a sua idade é: " + idade + "o seu peso é: " + peso + "a sua altura é: " + Altura + "e o seu estado civil atualmente é: " + EstadoCivil + "Solteiro");

    }
}
