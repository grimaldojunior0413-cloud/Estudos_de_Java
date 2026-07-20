package estudos_em_java01;

public class Exercicio09 {
    //Declare uma variável contendo um número e imprima a tabuada desse número, de 1 a 10. Use um laço for
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 10; i++){
            soma = i + i;

            System.out.println(i + "+" + i + "=" + soma);
        }
    }
}
