package estruturasRepeticao;

public class Intermediario {
    static void main() {
        double saldo = 1000;

        for(int mes = 1; mes < 13; mes++){
            saldo += saldo * 0.01;
            System.out.printf("O seu saldo no mês %d é: %.2f%n", mes, saldo);
        }

        System.out.println();
        int meses = 0;
        while(saldo <= 2000){
            saldo *= 1.01;
            meses++;
        }
        System.out.println("Demoraria " + meses + " meses");
    }
}

//    3.2 (real: investimento): Você investiu R$ 1.000,00 com rendimento de 1% ao mês. 9
//            (a) Use for para imprimir o saldo mês a mês durante 12 meses.
//            (b) Use while para descobrir em quantos meses o valor chega a pelo menos R$ 2.000,00.