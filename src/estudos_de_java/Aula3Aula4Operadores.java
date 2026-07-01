package estudos_de_java;

public class Aula3Aula4Operadores {
    public static void main(String[] args){
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2; // isso é um cast
        System.out.println(resultado);

        // % (resto)
        int resto = 21 % 2;
        System.out.println(resto);

        // < > (menor e maior) <= >= (menor igual e maior igual) == (comparação) != (operadores logicos, só volta verdadeiro ou falso)
        boolean isDezMaiorQueVinte = 18 > 20;
        boolean isDezIgualQueVinte = 18 < 20;
        boolean isDezMenorQueVinte = 18 == 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("dezoito é maior que vinte" + isDezMenorQueVinte);
        System.out.println("dezoito é maior que vinte" + isDezIgualQueVinte);

        // operadores logicos && (E ou AND) || (or) || ! (not)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaytationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaytationCompravel" + isPlaytationCompravel);

        // ecomizar um pouco de codigo: +=, -=, *=, /=, %=

        double bonus = 1800; //1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %=2;
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1;// contador = contador + 1
        contador ++;
        contador--; // primeiro executar oq vai fazer
        ++ contador; // incremente
        -- contador;
        int contador2 = 0;


        System.out.println(contador2++);
        System.out.println(contador2);


    }
}
