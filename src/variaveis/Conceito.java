package variaveis;

public class Conceito {
    static void main() {
        String nome = "Mario";
        int idade = 57;
        double altura = 1.74;
        boolean aposentado = true;

        final double PI = 3.14159; // final = constante, não pode mudar
        var cidade = "São Paulo";  // var: o Java infere o tipo (String)
    }
}

//    Nomes seguem camelCase (nomeCompleto).
//    Constantes ficam em MAIÚSCULAS (TAXA_JUROS).
//    Conversão automática (widening): double d = 10;
//    Conversão manual (casting): int i = (int) 3.99; // i = 3
//    Escopo: uma variável só existe dentro do bloco { } onde foi declarada.
