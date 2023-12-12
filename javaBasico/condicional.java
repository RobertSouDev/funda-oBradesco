import java.util.Scanner;

public class condiconal { //controle de fluxo
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade: ");

        int idade = sc.nextInt(); // Recebe a entrada do usuário sem argumentos

        if (idade < 12) {

            System.out.println("Ainda e uma criança");
        }else if (idade < 18) {
            System.out.println("e adolencente");
        } else {
            System.out.println("e de maior");

        }
    }
}
