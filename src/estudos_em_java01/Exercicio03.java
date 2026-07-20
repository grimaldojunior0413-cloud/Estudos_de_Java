package estudos_em_java01;

public class Exercicio03 {
    public static void main(String[] args) {
        //Declare duas variáveis contendo dois números e mostre qual deles é maior.
        //Imprima a mensagem “x é o maior”, onde x é o maior número entre o dois, ou “os números são iguais”, caso sejam iguais.
        int valor1 = 3;
        int valor2 = 4;
        if (valor1 < valor2) {
            System.out.println("valo1 é Maior");
        } else if (valor2 < valor1) {
            System.out.println("valor2 é Maior");
        } else {
            System.out.println("Iguais");
        }
    }
}
