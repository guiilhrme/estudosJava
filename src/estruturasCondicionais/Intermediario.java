package estruturasCondicionais;

import java.util.Scanner;

public class Intermediario {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double saldo = 3000;
        System.out.println("Seu saldo atual é de R$ " + saldo);
        System.out.print("Qual o valor do saque desejado? ");
        double saque = scanner.nextDouble();

        if(saque < 0){
            System.out.println("Valor de saque inválido");
        }else if(saque > saldo){
            System.out.println("Saldo insuficiente");
        }else if(saque % 10 != 0){
            System.out.println("Só é possivél fazer saques com valores múltiplos de 10");
        }else{
            saldo = saldo - saque;
            System.out.println("Saque realizado! O saldo atual é de R$" + saldo);
        }
    }
}

//    2.2 (real: caixa eletrônico): Dado um saldo e um valor de saque, o sistema deve:
//
//    recusar se o saque for menor ou igual a zero;
//    recusar se for maior que o saldo (“Saldo insuficiente”);
//    recusar se não for múltiplo de 10 (o caixa só tem notas de 10, 20, 50...);
//    caso contrário, realizar o saque e mostrar o novo saldo.