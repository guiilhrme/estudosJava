package estruturasRepeticao;

public class Exercicio {
    static void main() {
        int numero = 4;
        int resultado;
        for(int contador = 0; contador <= 10; contador++){
            resultado = numero * contador;
            System.out.println(numero + "X" + contador + " = " + resultado);
        }
    }
}

//    3.1 (básico): Peça um número (ou fixe um valor) e imprima a tabuada de 1 a 10 usando for.