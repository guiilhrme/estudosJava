package variaveis;

import java.util.Scanner;

public class Exercicio {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leitor.next();
        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();
        System.out.print("É aposentado? ");
        boolean aposentado = leitor.nextBoolean();

        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Aposentado: " + aposentado);
    }
}
