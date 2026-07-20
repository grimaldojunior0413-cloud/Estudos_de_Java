package estudos_em_java01;

public class Exercicios01 {
   // Declare uma variável idade, representando a idade de uma pessoa e use uma estrutura if/else para determinar se ela é maior de idade (18 anos ou mais) ou não,
    // e imprima a mensagem correspondente.
    // “Maior”, quando o usuário for maior de idade ou “Menor”, caso contrário.
    public static void main(String[] args) {
        byte idade = 18;
        if (idade <=17){
            System.out.println("Menor de idade");
        }else {
            System.out.println("Maior de idade");
        }
    }

}
