package estudos_em_java01;

import javax.imageio.ImageReadParam;

public class Exercicio02 {
    //Declare uma variável contendo um número e informe se ele é par ou ímpar.
    //“É par”, quando o número for par ou “É ímpar”, caso contrário.
    public static void main(String[] args) {
        int valor = 159;
        if (valor % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}


