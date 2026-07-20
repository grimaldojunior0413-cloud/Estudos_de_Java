package estudos_em_java01;

public class Exercicio08 {
    // Crie um programa que use um laço while para somar todos os números pares de 1 a 100.
    public static void main(String[] args) {

        int soma = 0;
        int numero = 0;

        while(numero <= 100){
            soma = soma + numero;
            numero++;
            System.out.println(soma);
        }
    }
}
