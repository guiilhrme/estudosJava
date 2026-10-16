package estruturasCondicionais;

import java.util.Scanner;

public class Exercicio {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();

        if (idade < 12){
            System.out.println("Criança");
        }else if(idade < 18){
            System.out.println("Adolescente");
        }else if(idade < 60){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }
}

//2.1 (básico): Crie um método classificar(int idade) que retorne "Criança" (até 11), "Adolescente"
//(12 a 17), "Adulto" (18 a 59) ou "Idoso" (60+). *Se a idade for negativa, retorne "Idade inválida".*