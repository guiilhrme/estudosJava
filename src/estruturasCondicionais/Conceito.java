package estruturasCondicionais;

import java.util.Scanner;

public class Conceito {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        double nota = leitor.nextDouble();

        if (nota >= 7){
            System.out.println("Aprovado!!");
        } else if (nota <= 5) {
            System.out.println("Reprovado :(");
        } else {
            System.out.println("Recuperação");
        }
    }
}

// Operadores
// Comparação: ==, !=, >, <, >=, <=
// Lógicos: && (E), || (OU), ! (NÃO)